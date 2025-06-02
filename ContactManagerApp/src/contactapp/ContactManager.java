package contactapp;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    private final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private final String PHONE_REGEX = "^\\d{10}$";

    public boolean addContact(String name, String password, String email, String phone, String birthday) {
        if (!email.matches(EMAIL_REGEX) || !phone.matches(PHONE_REGEX)) {
            return false;
        }
        contacts.add(new Contact(name, password, email, phone, birthday));
        return true;
    }

    public void deleteContact(String name) {
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Contact c : contacts) {
                writer.write(c.toFileString());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        contacts.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contacts.add(Contact.fromFileString(line));
            }
        }
    }
}