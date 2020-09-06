package org.danidiaz.glawiimporter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;

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
            final DictionaryEntries entries = new DictionaryEntries("items", "item", () -> reader);
            entries.stream().forEach((element) -> {
                System.out.println(pprint(element));
            });
        }
    }

    public static String pprint(Node node) {
        try {
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            //initialize StreamResult with File object to save to file
            final StreamResult result = new StreamResult(new StringWriter());
            final DOMSource source = new DOMSource(node);
            transformer.transform(source, result);
            return result.getWriter().toString();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

}
