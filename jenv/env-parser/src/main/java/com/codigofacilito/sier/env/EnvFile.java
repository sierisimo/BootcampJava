package com.codigofacilito.sier.env;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public record EnvFile(String environment, Map<String, String> variables) {
    @Override
    public String toString() {
        var formatBuilder = new StringBuilder()
                .append("[")
                .append(environment)
                .append("]")
                .append("\n");

        variables.forEach((key, value) ->{
            formatBuilder.append(key)
                    .append(" --> ")
                    .append(value)
                    .append("\n");
        });

        return formatBuilder.toString();
    }

    public static EnvFile parse(File file) {
        try (Stream<String> lines = Files.lines(file.toPath())) {
            Map<String, String> resultMap = new HashMap<>();

            lines.filter(line -> !line.startsWith("#"))
                    .map(line -> line.split("="))
                    .forEach(parts -> resultMap.put(parts[0], parts[1]));

            return new EnvFile(file.getName(), resultMap);
        } catch (IOException e) {
            System.out.println("Problem processing file");
        }
        return new EnvFile(file.getName(), Collections.emptyMap());
    }
}
