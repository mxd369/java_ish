package classesAndObjects;
import java.util.*;
/**
 * 
 * @author MXD
 */
public class Employee implements Comparable
{
    // state of the employee.
    // instance data
    // private enforces data integrity
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    private int employeeID;
    private int deptID;
    private String title;
    private double salary;
    
    // constructor
    public Employee(String fname, String lname, String phone,
            Address address, int employeeID, int deptID,
            String title, double salary)
    {
        firstName = fname;
        lastName = lname;
        phoneNumber = phone;
        this.address = address;
        this.employeeID = employeeID;
        this.deptID = deptID;
        this.title = title;
        this.salary = salary;
    }

    /*
    we need to add our methods that provide our public interface.
    These methods allow access to our instance data.
    Since our instance data is private,
    if the program needs to get the name,
    or set the first name, or last name, as an example,
    you have to go through these methods.

    For this example we have a method to get each piece of instance data
    and a corresponding set method to change them.
    You'll often hear these referred to as the accessor, or to the get methods,
    and the mutator, which are the set methods.    
     */

    public String getName() { return firstName + " " + lastName; }
    public void setFirstName(String value) { firstName = value; }
    public void setLastName(String value) { lastName = value; }
    
    public String getPhone() { return phoneNumber; }
    public void setPhone(String value) { phoneNumber = value; }
    
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    
    public int getEEID() { return employeeID; }
    public void setEEID(int value) { employeeID = value; }
    
    public int getDeptID() { return deptID; }
    public void setDeptID(int value) { deptID = value; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public double getSalary() { return salary; }
    /*
    So we can add code that says if value is less than or equal to 10,000
    then print an error saying invalid salary amount. And let the user know
    the salary was not updated. This prevents the user from accidentally
    updating the salary directly
    and gives us some control over what gets changed and what doesn't.
     */
    public void setSalary(double value)
    { 
        if(value <= 10000)
            System.out.println("Error, invalid salary amount, salary was not updated");
        else
            salary = value;
    }
    // usually helpful to add a method that formats and prints the information contained in the class.
    public void printEmployee()
    {
        if(address==null)
        {
        System.out.println(lastName + ", "+firstName+"\nTitle: " + title +
                "\nno address is on file for this employee" +
                "\n\nEmployee ID: " + employeeID +
                "\nDepartment: " + getDeptName(deptID));
        System.out.printf("Salary: $%8.2f", salary);
        System.out.println();
        }
        else
        {
        System.out.println(lastName + ", "+firstName+"\nTitle: " + title +
                    "\nAddress: " + address.toString() +
                    "\n\nEmployee ID: " + employeeID +
                    "\nDepartment: " + getDeptName(deptID));
        System.out.printf("Salary: $%8.2f", salary);
        System.out.println();  
        }
    }
    
    public String getDeptName(int value)
    {
        switch(value)
        {
            case 001:
                return "Human Resources";
            case 002:
                return "Staff";
            case 003:
                return "Faculty";
            case 004:
                return "Administration";
            default:
                return "other";
        }
    }
    
    /*
    The last method that I want to show you in the employee class is the compare to method.
    Notice this method is overriding the default compare to method allowing us to decide
    what it means to compare two employees. In this example I have it set up to compare
    the salaries of each employee.
    In the class definition I included the statement at the top, implements comparable.
     */
    /*
    compare to method.
    The compare to method takes in an object called T.
    Well, in order to use that object, I need to tell the computer what type of object it is.
    So I'm creating on line 89 a new variable that's a type of employee, an employee emp equals,
    and I'm casting the object T as an employee object.
    Now I can compare the employee that came in from the calling program in the compare to as
    a parameter.

    I can compare that to the object that this compare to is being performed on.
    So I say if this .salary is greater than emp.salary I return a positive number.
    Otherwise, if this .salary is the same as the emp salary, I return zero,
    because they're the same. And finally, if neither is true, that means that this
    .salary was less than the value they came in from the calling program in the
    compare to as an argument, then I return a negative one.
     */
    /*
    Overriding the compare to method is a really useful and helpful technique
    */
    @Override
    public int compareTo(Object t)
    {
        Employee emp = (Employee)t;
        if(this.salary>emp.salary)
        {
            return 1;
        }
        else if (this.salary == emp.salary)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
