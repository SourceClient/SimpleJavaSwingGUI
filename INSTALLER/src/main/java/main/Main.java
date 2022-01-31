package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
// if you know how to make it a register system then make a pull request and ill review it!
// Hello everyone! If you are reading this then that means you're using my simple GUI!
// If you have any questions please reach me on Discord. Two#6969 <3


@SuppressWarnings("serial")
public class Main extends JPanel{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel errorViewLabel;
    private JButton loginButton,resetButton;
    public JFrame window;

    public static void main(String[] args) {
        new Main().window.setVisible(true); // very important!
    }
    // X, Y, W, H Represent the Coordinates!
    public Main() {
        window = new JFrame();
        setLayout(new BorderLayout(10, 10));
        window.setIconImage(new ImageIcon("src/1200px-Internet_Explorer_10+11_logo.svg.png").getImage()); // input a image file here! (can only be src)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel componentsPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        window.setContentPane(this);

        errorViewLabel = new JLabel(" ");
        errorViewLabel.setFont(new Font("Tahoma",Font.BOLD, 18));
        errorViewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(onClick->{
            String user = usernameField.getText();
            String password = passwordField.getText();
            System.out.println(user + ", " + password);
            if(user.equals("TwoOneTwo") && password.equals("123")){ // input the username/password here!
                errorViewLabel.setText("Login Works!");
            } else {
                errorViewLabel.setText("DM the creator for a password reset!"); // output if input is incorrect
            }
        });
        resetButton = new JButton("Reset"); // button for reset
        resetButton.addActionListener(onClick->{
            usernameField.setText(""); // puts the username blank
            passwordField.setText(""); // puts the password blank
            errorViewLabel.setText(" ");
        });

        addComponentsToWindow(componentsPanel,
                new JLabel("USERNAME"),usernameField, // usernameField set to USERNAME
                new JLabel("PASSWORD"),passwordField, // passwordField set to PASSWORD (you can change both
                // if change passwordField/usernameField to different char then change the chars at the top (private static usernameField etc)
                loginButton,resetButton);

        add(componentsPanel, BorderLayout.CENTER);
        add(errorViewLabel, BorderLayout.SOUTH);
        window.setPreferredSize(new Dimension(600,200));
        window.pack();

    }
    private void addComponentsToWindow(JPanel panel,JComponent...component) {
        for(JComponent com:component) {
            // com.setFont(new Font("Tahoma", Font.BOLD, 20)); changes the font and size.
            com.setFont(new Font("Tahoma", Font.BOLD, 20));
            panel.add(com);
        }
    }

}