package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.TreeMap;

public class App
{
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;
    //public volatile TreeMap<String, File> imageTreeMap = new TreeMap<>();
    public void run() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        JFrame frame = new JFrame("DT Developer Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setLayout(new BorderLayout());
        //frame.add(new OpenImageBrowser());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new App()::run);
    }
}
