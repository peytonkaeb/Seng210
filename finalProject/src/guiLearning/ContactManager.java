package guiLearning;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import guiLearning.Contact;


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
                contacts.add(Contact.fromString(scanner.nextLine()));
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

    public static List<Contact> searchByName(String namePattern) throws IOException {
        Pattern pattern = Pattern.compile(namePattern, Pattern.CASE_INSENSITIVE);
        List<Contact> result = new ArrayList<>();
        for (Contact c : loadContacts()) {
            if (pattern.matcher(c.getName()).find()) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Contact> getSortedContacts() throws IOException {
        List<Contact> contacts = loadContacts();
        contacts.sort(Comparator.comparing(Contact::getName));
        return contacts;
    }
}