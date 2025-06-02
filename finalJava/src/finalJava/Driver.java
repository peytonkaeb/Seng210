package finalJava;

import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        JFrame frame = new JFrame("Contact Manager");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 105, 150));

        ImageIcon logo = new ImageIcon("C:\\Users\\skkae\\Downloads\\contacts logo- pink.png");
        Image scaled = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel imgLabel = new JLabel(new ImageIcon(scaled));
        imgLabel.setBounds(10, 10, 100, 100);
        frame.add(imgLabel);

        String[] btnTexts = {
            "Add New Contact"
            // other buttons can be added later
        };

        JButton[] buttons = new JButton[btnTexts.length];
        for (int i = 0; i < btnTexts.length; i++) {
            buttons[i] = new JButton(btnTexts[i]);
            buttons[i].setBounds(150, 20 + 40 * i, 200, 30);
            frame.add(buttons[i]);
        }

        buttons[0].addActionListener(e -> new AddContactGui());

        frame.setVisible(true);
    }
}