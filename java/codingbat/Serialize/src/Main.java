import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main
{
    public static void main(String[] args)
    {
        // create a person
        Person arthur = new Person();
        // name
        arthur.name = "Arthur Dent";
        // age
        arthur.age = 44;
        
        // put arthur in a file called data.bin
        String fileName = "data.bin";
        try
        {
            // create an objectoutputstream
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(arthur); // write object
            os.close();
        }
        catch (FileNotFoundException e)
        {
            // catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // catch block
            e.printStackTrace();
        }
        System.out.println("Done writing");
        
        
        
        
        // read it back
        // is = inputstream
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
            Person p = (Person) is.readObject(); // read object
            System.out.println("Read name=" + p.name + " age=" + p.age);
            is.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        
        
        
        
        
    }
}