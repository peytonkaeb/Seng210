package driverPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class driver {

	
	
	   JLabel labelName; // Draggable image label
	   int mouseX, mouseY; // Mouse click position relative to image
	   public static void main(String args[]) {
	       new Driver(); // Start the GUI
	   }
	   public Driver() {
	       // Frame setup
	       JFrame frameName = new JFrame("Drag & Drop Image + New Window");
	       frameName.setLayout(null);
	       frameName.setSize(500, 500);
	       frameName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       // Load image
	       ImageIcon originalIcon = new ImageIcon("C:/Users/skkae/Pictures/Camera Roll/262BAA35-1A58-49C4-BAD9-93143D22F727.jpg");
	       Image image2 = originalIcon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
	       ImageIcon resizedIcon = new ImageIcon(image2);
	       // Label for image (draggable)
	       labelName = new JLabel(resizedIcon);
	       labelName.setBounds(50, 50, 200, 150);
	       // Mouse events for dragging
	       labelName.addMouseListener(new MouseAdapter() {
	           public void mousePressed(MouseEvent e) {
	               mouseX = e.getX();
	               mouseY = e.getY();
	           }
	       });
	       labelName.addMouseMotionListener(new MouseMotionAdapter() {
	           public void mouseDragged(MouseEvent e) {
	               int x = e.getXOnScreen() - mouseX;
	               int y = e.getYOnScreen() - mouseY;
	               labelName.setLocation(x - frameName.getInsets().left, y - frameName.getInsets().top);
	           }
	       });
	       // Button to open a new window
	       JButton openWindowButton = new JButton("Open New Window");
	       openWindowButton.setBounds(150, 300, 200, 50);
	       openWindowButton.addActionListener(e -> openNewWindow());
	       // Add components to frame
	       frameName.add(labelName);
	       frameName.add(openWindowButton);
	       frameName.setVisible(true);
	   }
	   // Method to open a new window
	   public void openNewWindow() {
	       JFrame newFrame = new JFrame("New Window");
	       newFrame.setSize(300, 200);
	       newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	       newFrame.setLayout(new FlowLayout());
	       JLabel messageLabel = new JLabel("Welcome to the new window!");
	       newFrame.add(messageLabel);
	       newFrame.setVisible(true);
	   }
	}
