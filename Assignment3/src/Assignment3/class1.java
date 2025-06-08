package Assignment3;

// This is my assignment 3 code
// I've decided to create a simple game

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class class1 extends JFrame {
    private JButton singleTossButton, multiTossButton;
    private JTextField multiTossField;
    private JTextArea resultArea;
    private JButton resetButton;

    private int totalTosses = 0;
    private int headsCount = 0;
    private int tailsCount = 0;

    private Random rand = new Random();

    public class1() {
        setTitle("Coin Toss Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        singleTossButton = new JButton("Toss Coin Once");
        multiTossButton = new JButton("Toss Multiple Times");
        multiTossField = new JTextField(5);
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        resetButton = new JButton("Reset Stats");
        add(resetButton);
        resetButton.addActionListener(e -> {
            totalTosses = 0;
            headsCount = 0;
            tailsCount = 0;
            resultArea.setText("");
        });

        add(singleTossButton);
        add(new JLabel("Number of tosses:"));
        add(multiTossField);
        add(multiTossButton);
        add(new JScrollPane(resultArea));
        

        // Single toss button action
        singleTossButton.addActionListener(e -> tossCoins(1));

        // Multiple toss button action
        multiTossButton.addActionListener(e -> {
            try {
                int times = Integer.parseInt(multiTossField.getText());
                if (times > 0) {
                    tossCoins(times);
                } else {
                    JOptionPane.showMessageDialog(this, "Enter a positive number.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            }
        });
    }

    private void tossCoins(int times) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < times; i++) {
            boolean isHeads = rand.nextBoolean();
            totalTosses++;
            if (isHeads) {
                headsCount++;
                results.append("Toss ").append(i + 1).append(": Heads\n");
            } else {
                tailsCount++;
                results.append("Toss ").append(i + 1).append(": Tails\n");
            }
        }

        results.append("\n--- Statistics ---\n");
        results.append("Total tosses: ").append(totalTosses).append("\n");
        results.append("Heads: ").append(headsCount).append("\n");
        results.append("Tails: ").append(tailsCount).append("\n");

        resultArea.setText(results.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new class1().setVisible(true));
    }
}