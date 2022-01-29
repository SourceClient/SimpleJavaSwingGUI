package main;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Username:");
        label.setBounds(10,20,80,25);
        panel.add(label);
        JTextField userTextField = new JTextField(20);
        userTextField.setBounds(100,20,165,25);
        panel.add(userTextField);

        frame.setVisible(true);

    }

}