package finalJava;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class AddContactGui {
    public AddContactGui() {
        JFrame frame = new JFrame("Add New Contact");
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255, 182, 193));

        String[] labels = {"Name", "Password", "Email", "Phone"};
        JTextField[] fields = new JTextField[4];

        for (int i = 0; i < labels.length; i++) {
            JLabel l = new JLabel(labels[i] + ":");
            l.setBounds(20, 20 + 40 * i, 80, 25);
            frame.add(l);

            fields[i] = new JTextField();
            fields[i].setBounds(100, 20 + 40 * i, 200, 25);
            frame.add(fields[i]);
        }

        JCheckBox favoriteBox = new JCheckBox("Favorite?");
        favoriteBox.setBounds(100, 180, 100, 25);
        favoriteBox.setBackground(new Color(255, 182, 193));
        frame.add(favoriteBox);

        JButton save = new JButton("Save");
        save.setBounds(100, 220, 80, 30);
        frame.add(save);

        save.addActionListener(e -> {
            String name = fields[0].getText().trim();
            String pass = fields[1].getText().trim();
            String email = fields[2].getText().trim();
            String phone = fields[3].getText().trim();

            if (!ContactManager.isValidEmail(email)) {
                JOptionPane.showMessageDialog(frame, "Invalid email.");
                return;
            }

            if (!ContactManager.isValidPhone(phone)) {
                JOptionPane.showMessageDialog(frame, "Invalid phone (must be 10 digits).");
                return;
            }

            try {
                List<Contact> contacts = ContactManager.loadContacts();
                contacts.add(new Contact(name, pass, email, phone, favoriteBox.isSelected()));
                ContactManager.saveContacts(contacts);
                JOptionPane.showMessageDialog(frame, "Contact saved.");
                frame.dispose();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving contact: " + ex.getMessage());
            }
        });

        frame.setVisible(true);
    }
}
