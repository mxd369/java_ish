package graphicaluserinterface;

import java.awt.*;
import javax.swing.*;

class MyWindowDemo extends JFrame
{
    // test
    //public void pack (){}
    //public void setVisible (boolean visible){}
    // test end
    
    public MyWindowDemo()
    {
        setTitle("Window created using JFrame");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    /*
    public static void main(String[] args)
    {
        MyWindowDemo.setVisible(true);
        JFrame MyWindowDemo = new JFrame()
    }
    */
    
}
