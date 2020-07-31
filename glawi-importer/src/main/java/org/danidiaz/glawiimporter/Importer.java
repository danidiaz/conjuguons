package org.danidiaz.glawiimporter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

@Component
public class Importer implements ApplicationRunner {

    private final Supplier<File> fileSupplier;

    private final JdbcTemplate jdbcTemplate;

    public Importer(Supplier<File> fileSupplier, JdbcTemplate jdbcTemplate) {
        this.fileSupplier = fileSupplier;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I'm running!");

        try (var reader = new BufferedReader(new FileReader(fileSupplier.get(), StandardCharsets.UTF_8))) {
            final XMLInputFactory xif = XMLInputFactory.newInstance();
            final XMLEventReader xer = xif.createXMLEventReader(reader);

            TransformerFactory tf = TransformerFactory.newInstance();
            System.out.println(tf.getClass());
            Transformer t = tf.newTransformer();

//            xer.next();
//            xer.next();
//            xer.next();
//            xer.next();
//
//            System.out.println(xer.getEventType());
//            xer.nextTag();
//            System.out.println(xer.getEventType());
//            System.out.println(xer.getName());
//            xer.nextTag();
//            System.out.println(xer.getEventType());
//            System.out.println(xer.getName());

            while (!xer.peek().isStartElement()) {
                System.out.println(">-----------------------------------");
                System.out.println(xer.peek().getClass());
                System.out.println("<-----------------------------------");
                xer.next();
            }
            System.out.println("namy");
            System.out.println(xer.peek().asStartElement().getName());
            xer.next();
            while (!xer.peek().isStartElement()) {
                System.out.println(">-----------------------------------");
                System.out.println(xer.peek().getClass());
                System.out.println("<-----------------------------------");
                xer.next();
            }
            System.out.println("namy");
            System.out.println(xer.peek().asStartElement().getName());
            xer.next();

            while (!xer.peek().isStartElement()) {
                System.out.println(">-----------------------------------");
                System.out.println(xer.peek().getClass());
                System.out.println("<-----------------------------------");
                xer.next();
            }
            System.out.println("namy");

            System.out.println(xer.peek().asStartElement().getName());
//            System.out.println(xer.peek().getClass());
//            xer.nextTag();
//            System.out.println("-----------------------------------");
//            System.out.println(xer.peek().getClass());
//            System.out.println("<-----------------------------------");
            {
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("wat");

                final DOMResult result = new DOMResult(rootElement);
                t.transform(new StAXSource(xer), result);
                final Node domNode = result.getNode();
                System.out.println(domNode);
                System.out.println(domNode.getTextContent());

                System.out.println("pp-----------------------------------");
                System.out.println(pprint(domNode));
                System.out.println("pp-----------------------------------");
            }
            while (!xer.peek().isStartElement()) {
                System.out.println(">-----------------------------------");
                System.out.println(xer.peek().getClass());
                System.out.println("<-----------------------------------");
                xer.next();
            }
            xer.next();
            while (!xer.peek().isStartElement()) {
                System.out.println(">-----------------------------------");
                System.out.println(xer.peek().getClass());
                System.out.println("<-----------------------------------");
                xer.next();
            }
            {

                final DOMResult result = new DOMResult();
                t.transform(new StAXSource(xer), result);
                final Node domNode = result.getNode();
                System.out.println(domNode);
                System.out.println(domNode.getTextContent());

                System.out.println("pp-----------------------------------");
                System.out.println(pprint(domNode));
                System.out.println("pp-----------------------------------");
            }
//            for (int i = 0; i < 10; i++) {
//                System.out.println(xer.getEventType());
//                System.out.println(xer.getName());
//                xer.nextTag();
//            }

//            StreamSupport
//                    .stream(new GLAWIIterable(t, xer).spliterator(), false)
//                    .limit(3)
//                    .peek((n) -> {
//                        System.out.println(n.getClass());
//                    })
//                    .forEach(System.out::println);
        }

//        System.out.println(fileSupplier.get());
//
//        jdbcTemplate.query("select * from foo", (ResultSet rs) -> {
//            System.out.println(rs.getString(0));
//        });
    }

    public static String pprint(Node node) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
//initialize StreamResult with File object to save to file
        StreamResult result = new StreamResult(new StringWriter());
        DOMSource source = new DOMSource(node);
        transformer.transform(source, result);
        return result.getWriter().toString();
    }

}
