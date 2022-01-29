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
        label.setBounds(10,20,80,25); // 10 = x, 20 = y, 80 = width, 25 = height.
        panel.add(label);
        JTextField userTextField = new JTextField(20);
        userTextField.setBounds(100,20,165,25);
        panel.add(userTextField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();

        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);




        frame.setVisible(true);

    }

}