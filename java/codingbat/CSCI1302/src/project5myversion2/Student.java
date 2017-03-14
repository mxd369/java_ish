package project5myversion2;
import java.io.Serializable;
public class Student extends Person implements Serializable
{
    private String College = "";

    public Student(int idNumber, String firstName, String lastName, String dob, String College)
    {
        super(idNumber, firstName, lastName, dob);
        this.College = College;
    }
    
    public String toString()
    {
        return super.toString() + " [" + College + "]";
    }
    
}