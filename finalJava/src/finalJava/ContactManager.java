package finalJava;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ContactManager {
    private static final String FILE_NAME = "ContactFile.txt";
    private static final Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    private static final Pattern phonePattern = Pattern.compile("^\\d{10}$");

    public static List<Contact> loadContacts() throws IOException {
        List<Contact> contacts = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return contacts;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    try {
                        contacts.add(Contact.fromString(line));
                    } catch (IllegalArgumentException e) {
                        System.err.println("Skipping invalid line: " + line);
                    }
                }
            }
        }
        return contacts;
    }

    public static void saveContacts(List<Contact> contacts) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Contact c : contacts) {
                writer.write(c.toString() + "\n");
            }
        }
    }

    public static boolean isValidEmail(String email) {
        return emailPattern.matcher(email).matches();
    }

    public static boolean isValidPhone(String phone) {
        return phonePattern.matcher(phone).matches();
    }
}
