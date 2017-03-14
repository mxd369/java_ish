package javatutorials;
import javax.swing.*;
/**
 *
 * @author michaeldang
 */
public class JavaTutorial15AddingMenuBarOnJFrame {
    
    
    // create a menu bar
    JMenuBar mb = new JMenuBar();
    
    // add choices/items on menu bar, call it file
    JMenu file = new JMenu("File");
    
    
    // create item Load
    JMenuItem load = new JMenuItem("Load");
    // create item Save
    JMenuItem save = new JMenuItem("Save");  
    // create items Exit
    JMenuItem exit = new JMenuItem("Exit");  
    
    
    public JavaTutorial15AddingMenuBarOnJFrame()
    {
        frame();
    }

    public void frame(){
    // create frame
    JFrame f = new JFrame();
    f.setVisible(true);
    f.setSize(400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    
    
    // add file to the menu bar
    mb.add(file);
    // add the item to the file menu
    file.add(load);
    // add the item to the file menu
    file.add(save);
    // add the item to the file menu
    file.add(exit);

    
    
    f.setJMenuBar(mb);
    
    
    
    
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaTutorial15AddingMenuBarOnJFrame();
    }
    
}
