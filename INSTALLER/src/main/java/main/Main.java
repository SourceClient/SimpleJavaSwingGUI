package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private static JTextField userTextField;
    private static JLabel label;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // frame setting
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // username setting
        label = new JLabel("Username:");
        label.setBounds(10,20,80,25); // 10 = x, 20 = y, 80 = width, 25 = height.
        panel.add(label);

        // username text field settings
        userTextField = new JTextField(20);
        userTextField.setBounds(100,20,165,25);
        panel.add(userTextField);

        //password settings
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        // password text field settings
        passwordText = new JPasswordField();

        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Login Settings
        button  = new JButton("Login");
        button.addActionListener(new Main());
        button.setBounds(10,80,80,25);
        panel.add(button);

        // success settings
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        // makes the pannel show or not. **VERY IMPORTANT**
        frame.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    // Action Perform when you click login! (prints text via command line)
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userTextField.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);
        if(user.equals("TwoOneTwo") && password.equals("123")){
            success.setText("Login Works!");
        }
    }
}