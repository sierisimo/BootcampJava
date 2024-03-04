package com.codigofacilito.clase03;

import com.codigofacilito.sier.SierWithPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Estos ejemplos son muy basicos y no son uso extenso de muchas de estas clases, la principal finalidad es
 * entender que dentro del JDK tenemos muchas opciones de clases con diferente funcionalidad, asi como ver un uso
 * simple de ellas.
 */

public class JDKClassesExamples {
    private static void usingObject() {
        Object obj = new Object();
        System.out.println(obj);

        // Cualquier clase puede ser guardada como objeto
        Object sier = new SierWithPackage();
        System.out.println(sier);
    }

    private static void usingString() {
        String greeting = "Hello, World!";
        System.out.println(greeting.length());

        String otherGreeting = new String("Goodbye");
        System.out.println(otherGreeting);
    }

    private static void usingArrayList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names.size());
    }

    private static void usingScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextInt();
        scanner.nextLine();
        scanner.hasNextDouble();
        System.out.println("Hello, " + name + "!");
    }

    private static void usingBuffers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String sentence = reader.readLine();
        System.out.println("You entered: " + sentence);
    }

    private static void usingFile() {
        File file = new File("/home/sierisimo/.config/nvim/lazy-lock.json");
        System.out.println("File exists: " + file.exists());
        file.exists();
        file.getAbsoluteFile();
        file.getParentFile();
        file.getAbsolutePath();
        file.getPath();
        file.delete();
    }

    private static void usingPath() throws IOException {
        Path filePath = Paths.get("/home/sierisimo/example.json");
        List<String> lines = Files.readAllLines(filePath);
    }

    private static void usingURL() throws IOException {
        URL url = new URL("https://www.codigofacilito.com/?sier=cool");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        int responseCode = connection.getResponseCode();

        System.out.println("Codigo facilito response: " + responseCode);
    }

    private static void usingSQL() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase",
                "username",
                "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
    }
}
