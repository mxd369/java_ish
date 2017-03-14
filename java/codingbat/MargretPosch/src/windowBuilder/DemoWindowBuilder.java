package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

//is a JFrame(JFrame represents a window)
public class DemoWindowBuilder extends JFrame
{

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    // main method, creates a demo window builder, 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //
                    DemoWindowBuilder frame = new DemoWindowBuilder();
                    // sets visibility to true
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public DemoWindowBuilder() {
        //if you click the x it will close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // what is the: position-left hand, position-top-left-corner, width, height
        setBounds(100, 100, 450, 300);
        // create a new JPanel, assigned to contentPane
        contentPane = new JPanel();
        // contentPane has a border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // contentPane has a borderlayout
        contentPane.setLayout(new BorderLayout(0, 0));
        // set as the content pane of the jframe
        setContentPane(contentPane);
        
        

        
        JLabel lblHelloworld = newLblHelloWorld();
        contentPane.add(lblHelloworld, BorderLayout.CENTER);
        
    }

    private JLabel newLblHelloWorld() {
        JLabel lblHelloworld = new JLabel("HelloWorld");
        lblHelloworld.setOpaque(true);
        lblHelloworld.setBackground(new Color(255, 215, 0));
        lblHelloworld.setForeground(Color.DARK_GRAY);
        lblHelloworld.setFont(new Font("Georgia", Font.BOLD, 24));
        lblHelloworld.setHorizontalAlignment(SwingConstants.CENTER);
        return lblHelloworld;
    }

}
