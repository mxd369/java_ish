package serialization;

import java.io.Serializable;

public class Participant implements Serializable
{
    private final String firstName;
    private final String lastName;
    private int age;
    
    // initialize the 3 fields
    public Participant(String fName, String lName, int a)
    {
        firstName = fName;
        lastName = lName;
        age = age;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // toString
    @Override
    public String toString()
    {
        return  firstName + " " + lastName + " (" + age + ")" ;
    }    
    
    
}