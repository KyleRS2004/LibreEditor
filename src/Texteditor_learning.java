// Licensed under GPL v3
// author is Kyle Stevenson (also known as Cortex2004 on Github)
package kylestevenson.texteditor_learning;
import java.awt.*;
import javax.swing.*;

public class Texteditor_learning {

    public static void main(String[] args) {
        windowCreate();
    }
    
    public static void windowCreate() {
        // Main window
        JFrame windowFrame = new JFrame("LibreEditor");
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setLocationRelativeTo(null);
        windowFrame.pack();
        windowFrame.setVisible(true);
        windowFrame.setSize(new Dimension(800, 600));
        // Text Edit Area
        JTextArea textZone = new JTextArea();
        textZone.setPreferredSize(new Dimension(800,800));
        windowFrame.getContentPane().add(textZone, BorderLayout.CENTER);
        // Menubar
        
        //Tool bar
        
    }
    
}
