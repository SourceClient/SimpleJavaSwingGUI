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
    private static JLabel incorrect;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // THE CORE OF THE SYSTEM!!!
        frame.setSize(600,800); // (you can change the dimensions from the .setBounds(x,y,w,h)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // username setting
        label = new JLabel("Username:");
        label.setBounds(10,20,80,25); // (you can change the dimensions from the .setBounds(x,y,w,h)
        panel.add(label);

        // username text field settings
        userTextField = new JTextField(20);
        userTextField.setBounds(100,20,165,25);
        panel.add(userTextField);

        //Creates the label  that's on the side of the input box (you can change the dimensions from the .setBounds(x,y,w,h)
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        // password field
        passwordText = new JPasswordField();

        // creates the input box for password!
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // the login button that is very important for everything below  (you can change the dimensions from the .setBounds(x,y,w,h)
        button  = new JButton("Login");
        button.addActionListener(new Main());
        button.setBounds(10,80,80,25);
        panel.add(button);

        // sets the text proving the input is correct (you can change the dimensions from the .setBounds(x,y,w,h)
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        // sets the text proving the input is wrong (you can change the dimensions from the .setBounds(x,y,w,h)
        incorrect = new JLabel("");
        incorrect.setBounds(10,110,300,25);
        panel.add(incorrect);

        // DO NOT GET RID OF AS THIS TELLS INTELLIJ WHETHER TO SHOW THE PANEL OR NOT!!!!!
        frame.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    // Tells us whether when you click the button is correct or not (simple login system where if the password/username is correct)
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userTextField.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);
        if(user.equals("TwoOneTwo") && password.equals("123")){
            success.setText("Login Works!"); // <------ if you're using a login system this where the Correct would  be.
        } else if(user.equals("") && password.equals("")){ // kinda broken login system this is just a wip so you can remove this or make a pr for suggestions
            incorrect.setText(""); // <------ if you're using a login system this where the incorrect would  be.
        }
    }
}