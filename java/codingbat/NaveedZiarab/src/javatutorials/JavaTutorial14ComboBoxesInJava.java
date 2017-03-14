package javatutorials;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * https://www.youtube.com/watch?v=2oMIbX5eEio
 * @author michaeldang
 */
public class JavaTutorial14ComboBoxesInJava {
    
    // array to be added to the combobox, will store objects
    String[] items = {"Steve","Simon","Vince","Chris","Ashley","Tina"};
    
    
    // instance variable for the combo box called c
    // then add items to it
    JComboBox c = new JComboBox(items);
    
    // declare a button that says 'Print'
    JButton b = new JButton("Print");
    // declare a label that says 'Display Combo items'
    JLabel l = new JLabel("Display Combo items");

    /**
     * constructor for the class
     */
    public JavaTutorial14ComboBoxesInJava(){
        // frame method
        frame();
        
        
    }
    
    // frame method
    public void frame(){
        // create the frame
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        
        // after declaring the combobox, add to the panel
        p.add(c);
        // add the button and label so it displays on the frame
        p.add(b);
        p.add(l);
        
        
        // add the panel on the frame
        f.add(p);
        
        
        // add an action listener to the button
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // get the selected item in the combo box
                // and display it on the label
                String s = c.getSelectedItem().toString();// convert to string
                l.setText(s);//whatever is s it should display that
            }
        });
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaTutorial14ComboBoxesInJava();
    }
    
}