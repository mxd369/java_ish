package serializearraylist;
import java.util.ArrayList;
import java.io.*;

/*
http://beginnersbook.com/2013/12/how-to-serialize-arraylist-in-java/

ArrayList is serializable by default.
This means you need not to implement Serializable interface
explicitly in order to serialize an ArrayList.
In this tutorial we will learn how to serialize
and de-serialize an ArrayList.
*/

public class ArrayListSerialization
{

    public static void main(String[] args)
    {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Hello");
        a1.add("Hi");
        a1.add("Howdy");

        try
        {
            FileOutputStream fos = new FileOutputStream("src/serializearraylist/myfile.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a1);
            oos.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }   
}