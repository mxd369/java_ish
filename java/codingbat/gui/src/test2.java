// resource:
// https://www.youtube.com/watch?v=mH1TltI61yU
// Java Tutorial 13: Adding Action Listener in Java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author michaeldang
 */
public class test2 {

    
    // create a method, can create any method
    // the constructor for the class
    public test2()
    {
        // the constructor runs the frame method
        frame();
    }
    
    // declare the method here
    public void frame()
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create panel
        JPanel p = new JPanel();
        // Create button
        JButton b1 = new JButton("Action Listener");//show action lister on button
        
        // action listener
        b1.addActionListener(new ActionListener()
        {
        // write a method
            public void actionPerformed(ActionEvent e)
            {
                // message dialog
                JOptionPane.showMessageDialog(null, "Action Listener is working");
            }
        });


        // add the button on the panel p
        p.add(b1);
        // add the panel on the frame
        f.add(p);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the object for the class
        // new name of the class and the cosnstructor
        new test2();
    }
    
}
