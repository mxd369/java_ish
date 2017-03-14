package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MyFirstButton extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFirstButton frame = new MyFirstButton();
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
    public MyFirstButton() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        
        // constructor
        JButton btnMyFirstButton = newBtnMyFirstButton();
        contentPane.add(btnMyFirstButton, BorderLayout.NORTH);
    }

    private JButton newBtnMyFirstButton() {
        JButton btnMyFirstButton = new JButton("My First Button");
        btnMyFirstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnMyFirstButton.getBackground().equals(Color.GREEN))
                    btnMyFirstButton.setBackground(Color.YELLOW);
                else 
                    btnMyFirstButton.setBackground(Color.GREEN);
            }
        });
        btnMyFirstButton.setOpaque(true);
        btnMyFirstButton.setBackground(new Color(128, 0, 0));
        btnMyFirstButton.setForeground(new Color(255, 255, 255));
        btnMyFirstButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
        return btnMyFirstButton;
    }

}
