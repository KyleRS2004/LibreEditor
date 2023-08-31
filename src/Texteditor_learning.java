/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kylestevenson.texteditor_learning;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Kyle Stevenson
 */
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
        // Text Edit
        JTextField textZone = new JTextField("", SwingConstants.TOP);
        textZone.setPreferredSize(new Dimension(300,300));
        windowFrame.getContentPane().add(textZone, BorderLayout.NORTH);
        // Menubar
        
        //Tool bar
        
    }
    
}
