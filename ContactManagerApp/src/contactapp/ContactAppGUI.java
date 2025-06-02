package contactapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContactAppGUI extends JFrame {
    private ContactManager manager = new ContactManager();
    private JTextArea displayArea;

    public ContactAppGUI() {
        setTitle("Contact Manager");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().sekground(Color.PINK);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(255, 182, 193)); // Light pink
        buttonPanel.setLayout(new GridLayout(2, 3, 10, 10));

        JButton addBtn = new JButton("Add Contact");
        JButton delBtn = new JButton("Delete Contact");
        JButton saveBtn = new JButton("Save");
        JButton loadBtn = new JButton("Load");
        JButton refreshBtn = new JButton("Show Contacts");

        addBtn.addActionListener(e -> addContact());
        delBtn.addActionListener(e -> deleteContact());
        saveBtn.addActionListener(e -> saveContacts());
        loadBtn.addActionListener(e -> loadContacts());
        refreshBtn.addActionListener(e -> showContacts());

        buttonPanel.add(addBtn);
        buttonPanel.add(delBtn);
        buttonPanel.add(saveBtn);
        buttonPanel.add(loadBtn);
        buttonPanel.add(refreshBtn);

        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void addContact() {
        String name = JOptionPane.showInputDialog("Enter name:");
        String password = JOptionPane.showInputDialog("Enter password:");
        String email = JOptionPane.showInputDialog("Enter email:");
        String phone = JOptionPane.showInputDialog("Enter phone (10 digits):");
        String birthday = JOptionPane.showInputDialog("Enter birthday:");

        if (manager.addContact(name, password, email, phone, birthday)) {
            JOptionPane.showMessageDialog(this, "Contact added.");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or phone format.");
        }
    }

    private void deleteContact() {
        String name = JOptionPane.showInputDialog("Enter name to delete:");
        manager.deleteContact(name);
        JOptionPane.showMessageDialog(this, "Contact deleted (if it existed).");
    }

    private void saveContacts() {
        try {
            manager.saveToFile("contacts.txt");
            JOptionPane.showMessageDialog(this, "Contacts saved.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving file.");
        }
    }

    private void loadContacts() {
        try {
            manager.loadFromFile("contacts.txt");
            JOptionPane.showMessageDialog(this, "Contacts loaded.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading file.");
        }
    }

    private void showContacts() {
        displayArea.setText("");
        for (Contact c : manager.getContacts()) {
            displayArea.append(c.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        new ContactAppGUI();
    }
}