package step;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FindRelatedPeople {
    private static final int MAX_LENGTH = 256;

    public static boolean isValidName(String name) {
        return name.length() <= MAX_LENGTH && name.matches("[A-Za-z- ]*[A-Za-z][A-Za-z- ]*");
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        return Pattern.matches(emailRegex, email);
    }

    public static boolean validateRow(String firstName, String lastName, String email) {
        return !firstName.trim().isEmpty() && !lastName.trim().isEmpty() && !email.trim().isEmpty() &&
                isValidName(firstName) && isValidName(lastName) && isValidEmail(email);
    }

    public static void processCSV(String inputFile, String outputFile) {
        List<String[]> validEntries = new ArrayList<>();
        Map<String, Set<String>> relations = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3 && validateRow(data[0], data[1], data[2])) {
                    validEntries.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < validEntries.size(); i++) {
            String firstName1 = validEntries.get(i)[0];
            String lastName1 = validEntries.get(i)[1];
            Set<String> lnameParts1 = new HashSet<>(Arrays.asList(lastName1.split("-")));

            for (int j = 0; j < validEntries.size(); j++) {
                if (i == j) continue;
                String firstName2 = validEntries.get(j)[0];
                String lastName2 = validEntries.get(j)[1];
                Set<String> lnameParts2 = new HashSet<>(Arrays.asList(lastName2.split("-")));

                if (lastName1.equals(lastName2) || lnameParts1.contains(lastName2) || !Collections.disjoint(lnameParts1, lnameParts2)) {
                    relations.computeIfAbsent(firstName1 + " " + lastName1, k -> new HashSet<>()).add(firstName2 + " " + lastName2);
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Set<String>> entry : relations.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    bw.write(entry.getKey() + ": " + String.join(", ", entry.getValue()) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
