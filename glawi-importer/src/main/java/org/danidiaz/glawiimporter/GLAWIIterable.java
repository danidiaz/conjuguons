package org.danidiaz.glawiimporter;

import org.w3c.dom.Node;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stax.StAXSource;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GLAWIIterable implements Iterable<Node> {

    private final Transformer t;
    private final XMLStreamReader reader;

    public GLAWIIterable(Transformer t, XMLStreamReader reader) {
        this.t = t;
        this.reader = reader;
    }

    @Override
    public Iterator iterator() {
        try {
            reader.nextTag();
            //reader.nextTag();
            return new NodeIterator();
        } catch (XMLStreamException e) {
            throw new IllegalStateException(e);
        }
    }

    private class NodeIterator implements Iterator<Node> {

        @Override
        public boolean hasNext() {
            return reader.isStartElement();
        }

        @Override
        public Node next() {
            final DOMResult result = new DOMResult();
            try {
                t.transform(new StAXSource(reader), result);
                final Node domNode = result.getNode();
                reader.nextTag();
                return domNode;
            } catch (TransformerException | XMLStreamException e) {
                throw new NoSuchElementException();
            }
        }
    }
}
