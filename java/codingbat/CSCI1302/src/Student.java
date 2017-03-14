package edu.uga.cs1302.list;
import java.util.Date;
// Student
public class Student extends Person {

    private String collegeName;

    public Student(String firstName, String lastName, int idNumber, Date dateOfBirth, String collegeName) {
        super(firstName, lastName, idNumber, dateOfBirth);
        // TODO Auto-generated constructor stub
    }
    /*
    The Student class is a subclass of Person.
    It should contain a String attribute that holds the student's college name.
    It should also contain the proper toString method to add college name (in brackets)
    to the result of Person.toString() .
        
    So, for the above example if "Joe Smith" is a student at "Art&Sci" college.
    The output of the toString method should be: 
    1111 Joe Smith 01-25-1990 [Art&Sci]
    */

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        return 0;
    }

    // String toString
    /**
     * @
     */
    public String toString()
    {
        String desp = "";
        desp += "id= "        + idNumber  + ", ";
        desp += "firstName= " + firstName + ", ";
        desp += "LastName=  " + lastName  + ", ";
        //desp += "dob=       " + dateOfBirth;
        desp += "[ "           + collegeName + " ]";
        return desp;
    }

}
