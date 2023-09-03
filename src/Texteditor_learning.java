// Licensed under GPL v3
// author is Kyle Stevenson (also known as KyleRS2004 on Github)
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
        
        // Scroll Bar
        ScrollPane scrollPane = new ScrollPane();
        windowFrame.add(scrollPane, BorderLayout.CENTER);
        
        // Text Edit Area
        JTextArea textZone = new JTextArea();
        textZone.setPreferredSize(new Dimension(800,800));
        scrollPane.add(textZone,BorderLayout.WEST);
        
        // Menu Bar Items
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        
        // File Submenu
        JMenu f_NewMenu = new JMenu("New");
        JMenu f_OpenMenu = new JMenu("Open");
        JMenu f_SaveMenu = new JMenu("Save");
        JMenu f_SaveAsMenu = new JMenu("Save As");
        JMenu f_ExitMenu = new JMenu("Exit");
        fileMenu.add(f_NewMenu);
        fileMenu.add(f_OpenMenu);
        fileMenu.add(f_SaveMenu);
        fileMenu.add(f_SaveAsMenu);
        fileMenu.add(f_ExitMenu);
        
        // Edit Submenu
        JMenu e_UndoMenu = new JMenu("Undo");
        JMenu e_CopyMenu = new JMenu("Copy");
        JMenu e_CutMenu = new JMenu("Cut");
        JMenu e_PasteAsMenu = new JMenu("Paste");
        JMenu e_SelectAllMenu = new JMenu("Select All");
        editMenu.add(e_UndoMenu);
        editMenu.add(e_CopyMenu);
        editMenu.add(e_CutMenu);
        editMenu.add(e_PasteAsMenu);
        editMenu.add(e_SelectAllMenu);
        
        // Help Submenu
        JMenu h_AboutMenu = new JMenu("About");
        helpMenu.add(h_AboutMenu);

        
        // Menubar
        JMenuBar menuBar = new JMenuBar ();
        menuBar.setPreferredSize(new Dimension(50,25));
        windowFrame.add(menuBar,BorderLayout.NORTH);
            //File Menu Bar
        menuBar.add(fileMenu,BorderLayout.LINE_START);
            //Edit Menu Bar
        menuBar.add(editMenu,BorderLayout.LINE_START);
            //Help Menu Bar
        menuBar.add(helpMenu,BorderLayout.LINE_START);
        
        
        
        //Tool bar
        
        // Pack
        windowFrame.pack();
        windowFrame.setSize(new Dimension(800, 600));
        windowFrame.setVisible(true);
    }
    
}
