package project5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Student extends Person implements Serializable
{
    String college = "";

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    
    public void storeObject(ObjectOutputStream out) throws IOException
    {
        
    }
    
    public Student retrieveObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        
    }

    @Override
    public String toString() {
        return "Student [college=" + college + "]";
    }
    
    
}

