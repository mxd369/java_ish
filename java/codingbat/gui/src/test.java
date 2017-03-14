// https://www.youtube.com/watch?v=GvTZ2Huo0T4&t=303s
import javax.swing.*;
import java.awt.*;

public class test
{
    // declare a frame with the name of the frame(window)
    private JFrame f;
    // declare a panel (displays all the components on the frame)
    private JPanel p;
    // declare a button (a component)
    private JButton b1;
    // declare a label (a component)
    private JLabel lab;// the label
    
    
    // declare constructor for the class
    public test()
    {
        // method name
        gui();
    }
    
    // declare the method
    public void gui()
    {
        // create the frame, panel, button, and label objects
        f = new JFrame("Graphical User Interface");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//must write or it won't close
        
        // create an object of JPanel p
        p = new JPanel();
        // set the background color
        p.setBackground(Color.GRAY);
        
        // Add components on the panel
        // create objects
        b1 = new JButton("Test");
        lab = new JLabel("This is a test label");
        
        p.add(b1);
        p.add(lab);
        
        // change the location of the button to the bottom or NORTH, EAST, WEST
        // f.add(p,BorderLayout.SOUTH);
    }
        

    public static void main(String[] args) {
        // must create an object of main, create an object of the class test
        new test();
    }
}