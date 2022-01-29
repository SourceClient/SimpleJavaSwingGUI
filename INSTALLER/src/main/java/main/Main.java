package main;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args){
        new Main().setVisible(true);
    }

    public Main() {
        super("Installer");
        setSize(400,400); // 1024, 768, 800 x 600 modern res'
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Install"); // method below creates button and makes it clickable <-
        add(button); // adds the button on the GUI
        setLayout(new FlowLayout());
    }

}