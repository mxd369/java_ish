//********************************************************************
//  StyleOptions.java       Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************
package ch6;
import javax.swing.JFrame;

public class StyleOptions
{
   //-----------------------------------------------------------------
   //  Creates and displays the style options frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Style Options");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add (new StyleOptionsPanel());

      frame.pack();
      frame.setVisible(true);
   }
}
