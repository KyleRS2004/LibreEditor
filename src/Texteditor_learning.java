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
        
        // Popup Menu Bar Menus
        JPopupMenu  filePopup = new JPopupMenu();
        JPopupMenu  editPopup = new JPopupMenu();
        JPopupMenu  viewPopup = new JPopupMenu();
        JPopupMenu  helpPopup = new JPopupMenu();
        filePopup.setPreferredSize(new Dimension(50,100));
        menuBar.add(filePopup);
        
        
        //Tool bar
        
        // Pack
        windowFrame.pack();
        windowFrame.setSize(new Dimension(800, 600));
        windowFrame.setVisible(true);
    }
    
}
