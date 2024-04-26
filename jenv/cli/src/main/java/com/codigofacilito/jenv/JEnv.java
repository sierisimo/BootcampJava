package com.codigofacilito.jenv;

import com.codigofacilito.sier.files.search.DirectoryNotFound;
import com.codigofacilito.sier.files.search.FilesFound;
import com.codigofacilito.sier.files.search.NoFilesFound;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Command(
        name = "jenv",
        mixinStandardHelpOptions = true,
        version = "0.0.1",
        description = "Manage your env files like a pro"
)
public class JEnv implements Callable<Integer> {
    @Option(names = {"-l", "--list"}, description = "List all the key-values in current directory")
    private boolean isListing;

    private final FileListing fileListing = new FileListing();

    @Override
    public Integer call() throws Exception {
        if(isListing){
            var searchFileResult = fileListing.getFiles(".", ".env");
            return switch (searchFileResult){
                case NoFilesFound noFilesFound-> 1;
                case DirectoryNotFound directoryNotFound -> -1;
                case FilesFound filesFound -> 0;
                default -> throw new IllegalStateException("Unexpected value: " + searchFileResult);
            };
        }
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new JEnv()).execute(args);
        System.exit(exitCode);
    }
}
