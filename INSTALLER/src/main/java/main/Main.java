package main;

import javax.swing.*;

public class Main {
    private static JTextField textField;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // frame setting
        frame.setIconImage(new ImageIcon("logo.png").getImage());
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        textField = new JTextField(20);
        textField.setBounds(200,20,165,25);
        panel.add(textField);

        // makes the pannel show or not. **VERY IMPORTANT**
        frame.setVisible(true);

    }
}

    /*
    // Action Perform when you click login! (prints text via command line)
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userTextField.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);
        if(user.equals("TwoOneTwo") && password.equals("123")){
            success.setText("Login Works!");
        } else if(user.equals("") && password.equals("")){
            incorrect.setText("Login Incorrect DM Two#6969 for pword reset!");
        }
    }

     */