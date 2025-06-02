package guiLearning;

import javax.swing.*;
import java.awt.*;

public class DeleteContactGUI {
    public DeleteContactGUI() {
        JFrame frame = new JFrame("Delete Contact");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 228, 225));
        frame.setLayout(null);

        JLabel label = new JLabel("Delete contact functionality goes here.");
        label.setBounds(20, 50, 250, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}