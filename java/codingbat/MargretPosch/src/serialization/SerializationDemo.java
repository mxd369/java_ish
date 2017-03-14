package serialization;

import java.io.*;
import java.util.*;

public class SerializationDemo
{
    public void serialize (List<Participant> pList, String fileName)
    {
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            out.writeObject(pList);
        }
        catch (IOException ex)
        {
            System.out.println("A problem occurred during serialization");
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Participant> deserialize(String fileName)
    {
        // Create list of participant, named pList, initialized with null
        List<Participant> pList = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName)))
        { // body of the try block, use object input stream in the dot operator
            // use read object, in this case we serialized a list of participants
            // now must deserialize a list of participants
            // cast a list of participants
            // assign it to pList
            // Type safety: Unchecked cast from Object to List<Participant>
            // Unhandled exception type ClassNotFoundException
            pList = (List<Participant>) in.readObject();
           
        } // catch block used to catch IOException
        catch (IOException | ClassNotFoundException ex)
        {
            // if encounter one of the two exception types, print message to the user
            System.out.printf("A problem occurred deserializing %s%n", fileName);
            // print the original message from the exception
            System.out.println(ex.getMessage());
            
        } // if unable to deserialize, return null, otherwise return the list
        return pList;
    }

}