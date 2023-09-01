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
        
        // Text Edit Area
        JTextArea textZone = new JTextArea();
        textZone.setPreferredSize(new Dimension(800,800));
        windowFrame.add(textZone, BorderLayout.CENTER);
        
        // Menu Popouts
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");
        // Menubar
        JMenuBar menuBar = new JMenuBar ();
        menuBar.setPreferredSize(new Dimension(50,25));
        windowFrame.add(menuBar,BorderLayout.NORTH);
            //File Menu Bar
        menuBar.add(fileMenu,BorderLayout.LINE_START);
            //Edit Menu Bar
        menuBar.add(editMenu,BorderLayout.LINE_START);
            //View Menu Bar
        menuBar.add(viewMenu,BorderLayout.LINE_START);
            //Help Menu Bar
        menuBar.add(helpMenu,BorderLayout.LINE_START);
        //Tool bar
        
        // Input Controls + Saving File Mechanics
        
        // Pack
        windowFrame.pack();
        windowFrame.setSize(new Dimension(800, 600));
        windowFrame.setVisible(true);
    }
    
}
