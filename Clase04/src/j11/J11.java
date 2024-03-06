package j11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class J11 {
    public static void main(String[] args) {
        "Sier".toLowerCase();
        "Sierisimo".lines().parallel().filter(s -> {
            return true;
        });
        try {
            String v = Files.readString(Path.of("/home/sierisimo/file.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
