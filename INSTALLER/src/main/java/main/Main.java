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

@SuppressWarnings("serial")
public class Main extends JPanel{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel errorViewLabel;
    private JButton loginButton,resetButton;
    public JFrame window;

    public static void main(String[] args) {
        new Main().window.setVisible(true);
    }

    public Main() {
        window = new JFrame();
        setLayout(new BorderLayout(10, 10));
        window.setIconImage(new ImageIcon("src/logo.png").getImage());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel componentsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        window.setContentPane(this);

        errorViewLabel = new JLabel(" ");
        errorViewLabel.setFont(new Font("Tahoma",Font.ITALIC, 18));
        errorViewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(onClick->{
            String user = usernameField.getText();
            String password = passwordField.getText();
            System.out.println(user + ", " + password);
            if(user.equals("TwoOneTwo") && password.equals("123")){
                errorViewLabel.setText("Login Works!");
            } else {
                errorViewLabel.setText("Login Incorrect DM Two#6969 for pword reset!");
            }
        });
        resetButton = new JButton("Reset");
        resetButton.addActionListener(onClick->{
            usernameField.setText("");
            passwordField.setText("");
            errorViewLabel.setText(" ");
        });

        addComponentsToWindow(componentsPanel,
                new JLabel("USER NAME : "),usernameField,
                new JLabel("PASSWORD"),passwordField,
                loginButton,resetButton);

        add(componentsPanel, BorderLayout.CENTER);
        add(errorViewLabel, BorderLayout.SOUTH);
        window.setPreferredSize(new Dimension(600,200));
        window.pack();

    }
    private void addComponentsToWindow(JPanel panel,JComponent...component) {
        for(JComponent com:component) {
            com.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
            panel.add(com);
        }
    }

}