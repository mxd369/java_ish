//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.text.*;
/**
 * Person
 * @author Michael Dang
 */
// The Person class should implement the generic Comparable<T> interface and contain the following:
public class Person /*implements Comparable<T>*/
{
    // Start: variables
    //********************************************************
    private int idNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    //********************************************************
    // End: variables

    // Start: Constructors
    //********************************************************
    // constructor to initialize parameters firstName, lastName, idNumber, dateOfBirth
    public Person(int idNumber, String firstName, String lastName, String dateOfBirth)
    {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    //********************************************************
    // End: Constructors

    // Start : Getters and Setters
    //********************************************************
    // updates the idNumber
    public void setidNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    
    // returns the idNumber
    public int getidNumber()
    {
        return idNumber;
    }
    //********************************************************
    //********************************************************
    // updates the firstName
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    // returns the firstName
    public String getfirstName()
    {
        return firstName;
    }
    //********************************************************
    //********************************************************
    // updates the lastName
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }

    // returns the lastName
    public String getlastName()
    {
        return lastName;
    }
    //********************************************************
    //********************************************************
    // update the dateOfBirth
    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    // return the dateOfBirth
    public String getdateOfBirth()
    {
        return dateOfBirth;
    }
    //********************************************************
    // End: Setters and Getters
    
    // Start: compareTo
    //********************************************************
    // compareTo method of the above Comparable interface.
    // The comparison must be based on the id of the Person instances.
    // need to implement compare to method
    //********************************************************
    // End: compareTo
    //********************************************************
    
    // Start: toString
    //********************************************************
    /* for a student with: id=1111, firstName="Joe", lastName="Smith", dob="01-25-1990":   
    1111 Joe Smith 01-25-1990 */
    public String toString()
    {
        String desp = "";
        desp += idNumber  + " ";
        desp += firstName + " ";
        desp += lastName  + " ";
        desp += dateOfBirth;
        return desp;
    }
    //********************************************************
    // End: toString
}
