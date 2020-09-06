package org.danidiaz.glawiimporter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
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

            final TransformerFactory tf = TransformerFactory.newInstance();
            final Transformer t = tf.newTransformer();

            final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = docFactory.newDocumentBuilder();

            final GLAWIIterable iterable = new GLAWIIterable(t, "items", "item", () -> xer, builder);
            for (Node node : iterable) {
                System.out.println(pprint(node));
            }
        }
/*
//            xer.next();
//            xer.next();
//            xer.next();
//            xer.next();
//
//            system.out.println(xer.geteventtype());
//            xer.nexttag();
//            system.out.println(xer.geteventtype());
//            system.out.println(xer.getname());
//            xer.nexttag();
//            system.out.println(xer.geteventtype());
//            system.out.println(xer.getname());

            while (!xer.peek().isstartelement()) {
                system.out.println("> find the root element ------------");
                system.out.println(xer.peek().getclass());
                system.out.println("<-----------------------------------");
                xer.next();
            }
            system.out.println("namy");
            system.out.println(xer.peek().asstartelement().getname());
            xer.next();
            while (!xer.peek().isstartelement()) {
                system.out.println("> find the next item ---------------");
                system.out.println(xer.peek().getclass());
                system.out.println("<-----------------------------------");
                xer.next();
            }
            system.out.println("namy");
            system.out.println(xer.peek().asstartelement().getname());
            xer.next();

            while (!xer.peek().isstartelement()) {
                system.out.println(">-----------------------------------");
                system.out.println(xer.peek().getclass());
                system.out.println("<-----------------------------------");
                xer.next();
            }
            system.out.println("namy");

            system.out.println(xer.peek().asstartelement().getname());
//            system.out.println(xer.peek().getclass());
//            xer.nexttag();
//            system.out.println("-----------------------------------");
//            system.out.println(xer.peek().getclass());
//            system.out.println("<-----------------------------------");
            {
                documentbuilderfactory docfactory = documentbuilderfactory.newinstance();
                documentbuilder docbuilder = docfactory.newdocumentbuilder();
                document doc = docbuilder.newdocument();
                element rootelement = doc.createelement("wat");

                final domresult result = new domresult(rootelement);
                t.transform(new staxsource(xer), result);
                final node domnode = result.getnode();
                system.out.println(domnode);
                system.out.println(domnode.gettextcontent());

                system.out.println("pp-----------------------------------");
                system.out.println(pprint(domnode));
                system.out.println("pp-----------------------------------");
            }
            while (!xer.peek().isstartelement()) {
                system.out.println(">-----------------------------------");
                system.out.println(xer.peek().getclass());
                system.out.println("<-----------------------------------");
                xer.next();
            }
            xer.next();
            while (!xer.peek().isstartelement()) {
                system.out.println(">-----------------------------------");
                system.out.println(xer.peek().getclass());
                system.out.println("<-----------------------------------");
                xer.next();
            }
            {

*/
/*
                documentbuilderfactory docfactory = documentbuilderfactory.newinstance();
                documentbuilder docbuilder = docfactory.newdocumentbuilder();
                document doc = docbuilder.newdocument();
                element resultelement = doc.createelement("elemy");
*//*


                final domresult result = new domresult();
                // final domresult result = new domresult(resultelement);
                t.transform(new staxsource(xer), result);
                final node domnode = result.getnode();
                system.out.println(domnode);
                system.out.println(domnode.gettextcontent());

                system.out.println("pp-----------------------------------");
                system.out.println(pprint(domnode));
                system.out.println("pp-----------------------------------");
            }
//            for (int i = 0; i < 10; i++) {
//                system.out.println(xer.geteventtype());
//                system.out.println(xer.getname());
//                xer.nexttag();
//            }

//            streamsupport
//                    .stream(new glawiiterable(t, xer).spliterator(), false)
//                    .limit(3)
//                    .peek((n) -> {
//                        system.out.println(n.getclass());
//                    })
//                    .foreach(system.out::println);
        }

//        system.out.println(filesupplier.get());
//
//        jdbctemplate.query("select * from foo", (resultset rs) -> {
//            system.out.println(rs.getstring(0));
//  });
*/
    }

    public static String pprint(Node node) throws TransformerException {
        final Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        //initialize StreamResult with File object to save to file
        final StreamResult result = new StreamResult(new StringWriter());
        final DOMSource source = new DOMSource(node);
        transformer.transform(source, result);
        return result.getWriter().toString();
    }

}
