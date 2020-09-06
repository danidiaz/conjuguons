package org.danidiaz.glawiimporter;

import org.w3c.dom.Node;

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

public class GLAWIIterable implements Iterable<Node> {

    private final DocumentBuilder builder;
    private final Transformer t;
    private final String enclosingTag;
    private final String elementTag;
    private final Supplier<XMLEventReader> readerSupplier;

    public GLAWIIterable(DocumentBuilder builder,
                         Transformer t,
                         String enclosingTag,
                         String elementTag,
                         Supplier<XMLEventReader> readerSupplier) {
        this.builder = builder;
        this.t = t;
        this.readerSupplier = readerSupplier;
        this.enclosingTag = enclosingTag;
        this.elementTag = elementTag;
    }

    @Override
    public Iterator<Node> iterator() {
            return new NodeIterator(readerSupplier.get());
    }

    private class NodeIterator implements Iterator<Node> {

        private final XMLEventReader reader;
        private ParseState state;

        public NodeIterator(XMLEventReader reader) {
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
        public Node next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
            try {
                final DOMResult result = new DOMResult();
                t.transform(new StAXSource(reader), result);
                final Node node = result.getNode();
                node.setNodeValue(elementTag);
                state = ParseState.AFTER_PARSING;
                return node;
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
                    return ParseState.READY_FOR_NEXT;
                }
            }
        }
    }

    public enum ParseState {
        INITIAL,
        READY_FOR_NEXT,
        AFTER_PARSING,
        EXHAUSTED
    }

}
