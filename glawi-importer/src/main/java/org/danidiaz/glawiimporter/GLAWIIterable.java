package org.danidiaz.glawiimporter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stax.StAXSource;
import java.util.Iterator;
import java.util.function.Supplier;

public class GLAWIIterable implements Iterable<Element> {

    private final Transformer t;
    private final String enclosingTag;
    private final String elementTag;
    private final Supplier<XMLEventReader> readerSupplier;
    private final DocumentBuilder builder;

    public GLAWIIterable(Transformer t,
                         String enclosingTag,
                         String elementTag,
                         Supplier<XMLEventReader> readerSupplier,
                         DocumentBuilder builder) {
        this.t = t;
        this.readerSupplier = readerSupplier;
        this.enclosingTag = enclosingTag;
        this.elementTag = elementTag;
        this.builder = builder;
    }

    @Override
    public Iterator<Element> iterator() {
            return new ElementIterator(readerSupplier.get());
    }

    private class ElementIterator implements Iterator<Element> {

        private final XMLEventReader reader;
        private ParseState state;

        public ElementIterator(XMLEventReader reader) {
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
                    case READY_FOR_NEXT -> ParseState.READY_FOR_NEXT;
                    case AFTER_PARSING -> consumeInitialElementTag();
                    case EXHAUSTED -> ParseState.EXHAUSTED;
                };
                return state.equals(ParseState.READY_FOR_NEXT);
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
                t.transform(new StAXSource(reader), result);
                final Document document = (Document) result.getNode();
                final Element element = (Element) document.getFirstChild();
                final Document newDocument = builder.newDocument();
                final Element newElement = newDocument.createElement(elementTag);
                final NodeList childNodes = element.getChildNodes();
                for (int i=0; i < childNodes.getLength(); i++) {
                    newElement.appendChild(newDocument.importNode(childNodes.item(i),true));
                }
                state = ParseState.AFTER_PARSING;
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
                    return ParseState.READY_FOR_NEXT;
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
        READY_FOR_NEXT,
        AFTER_PARSING,
        EXHAUSTED
    }

}
