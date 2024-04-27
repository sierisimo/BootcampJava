package com.codigofacilito.jenv;

import com.codigofacilito.sier.env.EnvFile;
import com.codigofacilito.sier.files.search.DirectoryNotFound;
import com.codigofacilito.sier.files.search.FilesFound;
import com.codigofacilito.sier.files.search.NoFilesFound;
import picocli.CommandLine;
import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.concurrent.Callable;

@Command(
        name = "jenv",
        mixinStandardHelpOptions = true,
        version = "1.0.0",
        description = "Manage your env files like a pro"
)
public class JEnv implements Callable<Integer> {

    private final FileListing fileListing = new FileListing();

    @ArgGroup(exclusive = true)
    private JEnvOptions options;

    static class JEnvOptions {
        @Option(names = {"-l", "--list"}, required = true, description = "List all the key-values in current directory")
        private boolean isListing;

        @Option(names = {"-u", "--update"}, paramLabel = "ENVIRONMENT", required = true, description = "Promote a environment to be used on local")
        private String environmentFile;
    }

    @Override
    public Integer call() throws Exception {
        if (options.isListing) {
            return resolveListing();
        }
        if (options.environmentFile != null) {
            var sourceFile = new File(".env." + options.environmentFile);
            Files.copy(sourceFile.toPath(), new File(".env").toPath(), StandardCopyOption.REPLACE_EXISTING);
            return 0;
        }
        return 0;
    }

    private int resolveListing() {
        var searchFileResult = fileListing.getFiles(".", ".env");
        return switch (searchFileResult) {
            case NoFilesFound noFilesFound -> 1;
            case DirectoryNotFound directoryNotFound -> -1;
            case FilesFound filesFound -> {
                Arrays.stream(filesFound.files)
                        .map(EnvFile::parse)
                        .forEach(System.out::println);
                yield 0;
            }
        };
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new JEnv()).execute(args);
        System.exit(exitCode);
    }
}
