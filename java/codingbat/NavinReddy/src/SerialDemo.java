import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serialization 
 * https://www.youtube.com/watch?v=4NoW9yHYPQY
 *@author Navin Reddy
 */

public class SerialDemo
{
    public static void main(String[] args) throws Exception
    {
        Save obj = new Save();
        obj.i = 4;
        
        File f = new File("Obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // save
        oos.writeObject(obj);
        
        
        // retrieve
        // values from file
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        
        
        //get the value of obj1
        System.out.println("Value of Obj1" + obj1.i);
    }
}

// needs to implement Serializable
class Save implements Serializable
{
    int i;// Obj.txt
}