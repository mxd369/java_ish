package project5myversion;
import java.io.Serializable;
import java.util.Date;
public class Person implements Serializable
{
    int idNumber;
    String firstName = "";
    String lastName = "";
    String dob = "";
    
    public Person(int idNumber, String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.dob = dob;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // dob
    /*
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    */    

    public String toString() {
        return idNumber + " " + firstName + " " + lastName + " " + dob;
    }
}