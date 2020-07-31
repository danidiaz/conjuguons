package org.danidiaz.glawiimporter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stax.StAXSource;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
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
            final XMLStreamReader xsr = xif.createXMLStreamReader(reader);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            while(xsr.nextTag() == XMLStreamConstants.START_ELEMENT) {
                DOMResult result = new DOMResult();
                t.transform(new StAXSource(xsr), result);
                Node domNode = result.getNode();

                System.out.println(domNode);
            }
        }

//        System.out.println(fileSupplier.get());
//
//        jdbcTemplate.query("select * from foo", (ResultSet rs) -> {
//            System.out.println(rs.getString(0));
//        });
    }


}
