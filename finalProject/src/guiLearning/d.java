package guiLearning;

import javax.swing.*;
import java.awt.*;

public class SortContactGUI {
    public SortContactGUI() {
        JFrame frame = new JFrame("Sort Contacts");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(240, 255, 240));
        frame.setLayout(null);

        JLabel label = new JLabel("Sort contacts functionality goes here.");
        label.setBounds(20, 50, 250, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}