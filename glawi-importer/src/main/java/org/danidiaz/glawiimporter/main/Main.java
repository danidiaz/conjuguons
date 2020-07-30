package org.danidiaz.glawiimporter.main;

import org.danidiaz.glawiimporter.appya.ImporterApplicationA;
import org.danidiaz.glawiimporter.appyb.ImporterApplicationB;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
                .child(ImporterApplicationA.class)
                .sibling(ImporterApplicationB.class)
                .run(args);
    }
}
