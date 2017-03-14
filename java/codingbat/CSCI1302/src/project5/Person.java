/*http://beginnersbook.com/2013/12/how-to-serialize-arraylist-in-java/
ArrayList is serializable by default.
This means you need not to implement Serializable interface explicitly in order to serialize an ArrayList.
In this tutorial we will learn how to serialize and de-serialize an ArrayList.*/
package project5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
public class Person
{
    String firstName = "";
    String lastName = "";
    int idNumber;
    Date dateOfBirth;
    // ****************************
    // Person class should implement all getter and setter methods for these data members.
    // firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // idNumber
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    // dob
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    // ****************************
    // ****************************
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber + ", dateOfBirth="
                + dateOfBirth + "]";
    }
}