package guiLearning;

import javax.swing.*;
import java.awt.*;

public class SearchContactGUI {
    public SearchContactGUI() {
        JFrame frame = new JFrame("Search Contact");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(224, 255, 255));
        frame.setLayout(null);

        JLabel label = new JLabel("Search contact functionality goes here.");
        label.setBounds(20, 50, 250, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}