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

public class DictionaryEntries implements Iterable<Element> {

    private final String enclosingTag;
    private final String elementTag;
    private final Supplier<Reader> readerSupplier;

    public DictionaryEntries(String enclosingTag,
                             String elementTag,
                             Supplier<Reader> readerSupplier) {
        this.readerSupplier = readerSupplier;
        this.enclosingTag = enclosingTag;
        this.elementTag = elementTag;
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
