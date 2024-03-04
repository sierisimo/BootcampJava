package com.codigofacilito.clase03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejemplo donde solicitamos usuarios y su año de nacimiento y posterior calculamos su edad.
 * Al final guardamos en un archivo `user_ages.txt` los resultados.
 */
public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many users are we going to register? ");
        int useCount = scanner.nextInt();
        scanner.nextLine();

        // Collect user names and birth years
        Map<String, Integer> userBirthYears = collectUserAges(useCount, scanner);

        // Calculate and display ages
        displayUserAges(userBirthYears);

        // Store user information and ages in a file
        storeDataToFile(userBirthYears);

        // Closing scanner
        scanner.close();
    }

    private static Map<String, Integer> collectUserAges(int userCount, Scanner scanner) {
        Map<String, Integer> userBirthYears = new HashMap<>();
        for (int i = 0; i < userCount; i++) {
            System.out.print("Enter user name: ");
            String userName = scanner.nextLine();

            System.out.print("Enter birth year for " + userName + ": ");
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            userBirthYears.put(userName, birthYear);
        }
        return userBirthYears;
    }

    private static void displayUserAges(Map<String, Integer> userBirthYears) {
        System.out.println("\nUser Ages:");
        int currentYear = java.time.LocalDate.now().getYear();
        for (Map.Entry<String, Integer> entry : userBirthYears.entrySet()) {
            String userName = entry.getKey();
            int birthYear = entry.getValue();
            int age = currentYear - birthYear;

            System.out.println(userName + ": " + age + " years old");
        }
    }

    private static void storeDataToFile(Map<String, Integer> userBirthYears) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("user_ages.txt"))) {
            for (Map.Entry<String, Integer> entry : userBirthYears.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue() + " years old");
            }
            System.out.println("\nUser information written to 'user_ages.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
