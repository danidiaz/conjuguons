package org.danidiaz.glawiimporter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stax.StAXSource;
import java.io.Reader;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * <p>An {@link Iterable} over the inner {@link Element}s of an XML file of the form:</p>
 * <pre>{@code
 * <enclosingTag>
 *    <elementTag>stuff</elementTag>
 *    <elementTag>stuff</elementTag>
 *    <elementTag>stuff</elementTag>
 * </enclosingTag>
 * }</pre>
 *
 * <p>The aim is to build a {@link Stream} of {@link Element}s, so we can
 * harness the stream API's capabilities for mapping and grouping when processing potentially
 * huge XML files. </p>
 *
 * <p>Related Stack Overflow questions:</p>
 * <ul>
 * <li><a href="https://stackoverflow.com/questions/9379868/reading-a-big-xml-file-using-stax-and-dom ">Reading a big XML file using stax and dom</a></li>
 * </ul>
 * <ul>
 * <li><a href="https://stackoverflow.com/questions/36617013/stream-xml-node-by-node ">Stream XML node by node</a></li>
 * </ul>
 * <ul>
 * <li><a href="https://stackoverflow.com/questions/36717402/what-is-the-difference-between-xmlstreamreader-and-xmleventreader ">What is the difference between XMLStreamReader and XMLEventReader?</a></li>
 * </ul>
 * <ul>
 * <li><a href="https://stackoverflow.com/questions/41803078/how-to-read-modify-fragments-of-xml-using-stax-in-java ">How to read modify fragments of XML using StAX in Java?</a></li>
 * </ul>
 */
public class Elements implements Iterable<Element> {

    private final String enclosingTag;
    private final String elementTag;
    private final Supplier<Reader> readerSupplier;

    public Elements(String enclosingTag,
                    String elementTag,
                    Supplier<Reader> readerSupplier) {
        this.readerSupplier = readerSupplier;
        this.enclosingTag = enclosingTag;
        this.elementTag = elementTag;
    }

    public Stream<Element> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override
    public Iterator<Element> iterator() {
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            final Transformer transformer = transformerFactory.newTransformer();
            final DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            final XMLInputFactory xif = XMLInputFactory.newInstance();
            final XMLEventReader xer = xif.createXMLEventReader(readerSupplier.get());
            return new EntryIterator(transformer, builder, xer);
        } catch (TransformerConfigurationException | ParserConfigurationException | XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    private class EntryIterator implements Iterator<Element> {

        private final Transformer transformer;
        private final DocumentBuilder builder;
        private final XMLEventReader reader;
        private ParseState state;

        public EntryIterator(Transformer transformer, DocumentBuilder builder, XMLEventReader reader) {
            this.transformer = transformer;
            this.builder = builder;
            this.reader = reader;
            this.state = ParseState.INITIAL;
        }

        @Override
        public boolean hasNext() {
            try {
                state = switch (state) {
                    case INITIAL -> {
                        consumeInitialEnclosingTag();
                        yield consumeInitialElementTag();
                    }
                    case READY_FOR_NEXT_ENTRY -> ParseState.READY_FOR_NEXT_ENTRY;
                    case AFTER_ENTRY -> consumeInitialElementTag();
                    case EXHAUSTED -> ParseState.EXHAUSTED;
                };
                return state.equals(ParseState.READY_FOR_NEXT_ENTRY);
            } catch (XMLStreamException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override
        public Element next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
            try {
                final DOMResult result = new DOMResult();
                transformer.transform(new StAXSource(reader), result);
                final Document document = (Document) result.getNode();
                final Element element = (Element) document.getFirstChild();
                // https://stackoverflow.com/a/63767320/1364288
                final Document newDocument = builder.newDocument();
                final Element newElement = newDocument.createElement(elementTag);
                final NodeList childNodes = element.getChildNodes();
                for (int i=0; i < childNodes.getLength(); i++) {
                    newElement.appendChild(newDocument.importNode(childNodes.item(i),true));
                }
                state = ParseState.AFTER_ENTRY;
                return newElement;
            } catch (XMLStreamException | TransformerException e) {
                throw new IllegalStateException(e);
            }
        }

        private void consumeInitialEnclosingTag() throws XMLStreamException {
            while (true) {
                final XMLEvent next = reader.nextEvent();
                if (next.isStartElement() &&
                        next.asStartElement().getName().getLocalPart().equals(enclosingTag)) {
                    return;
                }
            }
        }

        private ParseState consumeInitialElementTag() throws XMLStreamException {
            while (true) {
                final XMLEvent next = reader.nextEvent();
                if (next.isEndElement() &&
                        next.asEndElement().getName().getLocalPart().equals(enclosingTag)) {
                    return ParseState.EXHAUSTED;
                }
                if (next.isStartElement() &&
                        next.asStartElement().getName().getLocalPart().equals(elementTag)) {
                    consumeWhitespaceBeforeTag();
                    return ParseState.READY_FOR_NEXT_ENTRY;
                }
            }
        }

        private void consumeWhitespaceBeforeTag() throws XMLStreamException {
            while (!reader.peek().isStartElement()) {
                reader.nextEvent();
            }
        }
    }

    private enum ParseState {
        INITIAL,
        READY_FOR_NEXT_ENTRY,
        AFTER_ENTRY,
        EXHAUSTED
    }

}
