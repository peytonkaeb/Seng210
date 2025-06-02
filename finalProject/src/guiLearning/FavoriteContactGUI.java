package guiLearning;

import javax.swing.*;
import java.awt.*;

public class FavoriteContactGUI {
    public FavoriteContactGUI() {
        JFrame frame = new JFrame("Favorite Contacts");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 240, 245));
        frame.setLayout(null);

        JLabel label = new JLabel("Favorite contacts functionality goes here.");
        label.setBounds(20, 50, 250, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}