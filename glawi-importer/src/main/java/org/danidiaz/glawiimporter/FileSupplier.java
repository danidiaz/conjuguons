package org.danidiaz.glawiimporter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.function.Supplier;

/**
 * Making this a managed bean might be overkill, it was done to check the injection of {@link ApplicationArguments}.
 */
@Component
public class FileSupplier implements Supplier<File> {
    private ApplicationArguments args;

    public FileSupplier(ApplicationArguments args) {
        this.args = args;
    }

    @Override
    public File get() {
        return new File(args.getNonOptionArgs().iterator().next());
    }

}
