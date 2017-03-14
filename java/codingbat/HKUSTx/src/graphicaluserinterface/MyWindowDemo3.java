package graphicaluserinterface;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class MyWindowDemo3 extends JFrame implements MouseListener
{

    public MyWindowDemo3()
    {
        setTitle("Window created using JFrame");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // create a JPanel with the name content
        // so we can put some graphical components into the panel
        JPanel content = new JPanel();
        // tell the computer where to put it
        // We can use the method setLayout to tell the program what layout to use.
        // In this case, the layout manager will use the layout FlowLayout
        // which would simply put the components in a row,
        // That is, the layout would place the components from left to right,
        // and then from top to bottom.
        content.setLayout(new FlowLayout());
        
        // label
        JLabel label = new JLabel("My Panel");
        // The first component that we are creating here,
        // is some text using the class JLabel
        // and the variable is called label.
        // Here, we are using the string “My Panel” to label the panel.
        // The label can then be added to the panel content using the method add.
        content.add(label);
        // The second component is to add a button.
        // A button is created as a JButton type
        // and the button is given the label "Click Me".
        // Again, the button is added to the content panel.
        JButton button = new JButton("Click Me");
        content.add(button);
        
        //

        
        //*****************************************
        // To connect the button with a mouseclick event,
        // the button would be treated as an event source.
        // We use addMouseListener to register this object
        // with the event source that is the button.
        // So that it would be notified when the mouse-click
        // event occurred on the button.
        button.addMouseListener(this); // must implement MouseListener interface
        //*****************************************
        
        setContentPane(content);
        
        // You can see that this window is basically the same as before,
        // except that we have now the text My Panel being added to the window,
        // and then there's also a button called Click Me.
        // But now, if you try to click on this button, nothing would happen.
        // Because we have not added the listeners to it,
        // as we discussed in the previous examples on event-driven programming.
        
        
        setVisible(true);
        
    }
    
    public void mouseClicked(MouseEvent e)
    {
        Toolkit.getDefaultToolkit().beep();
    }
    public void mousePressed(MouseEvent e)
    {
        //IO.outputln();
    }
    public void mouseReleased(MouseEvent e)
    {
        //IO.outputln();
    }
    public void mouseEntered(MouseEvent e)
    {
        //IO.outputln();
    }
    public void mouseExited(MouseEvent e)
    {
        //IO.outputln();
    }
    
    
    
    
}
