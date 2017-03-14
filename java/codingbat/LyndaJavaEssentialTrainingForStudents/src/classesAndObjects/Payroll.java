package classesAndObjects;
/**
 * In this class, we're going to be able to create objects for the address and the employee.
 * We're then going to print the values back out again.
 * We're going to try and change some of the values, as well as use our "compareTo" methods.
 * @author michaeldang
 */
public class Payroll
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        When we create a new object from a class definition,
        it is actually called an "instance" of the class and
        that's why we say we've instantiated a new object.
        It is important to note that you must instantiate an object by using a keyword "new".
        We can create any number of employees using this process. 
        */
        Address a1 = new Address("123", "South Main Street", "Cleveland", "OH", "12345");
        Address a2 = new Address("123", "North Main Street", "Willoughby", "OH", "54321");
        Address a3 = null;
        
        Employee ee1 = new Employee("Peggy", "Fisher", "717-555-1212", a1, 955123, 003, "Lecturer", 45000.00);
        
        ee1.printEmployee();
        
        Employee ee2 = new Employee("Bob", "Fisher", "717-555-1212", a2, 955123, 003, "Lecturer", 45000.00);
        
        ee2.printEmployee();
        
        Employee ee3 = new Employee("Jane", "Smith", "510-555-1212", a3, 456789, 001, "Administrator", 55000.00);
        
        ee3.printEmployee();
        
        // compare salaries to see who makes more money
        // line 141 of Employee   if(this.salary>emp.salary)
        if(ee1.compareTo(ee2)==0)
            System.out.println("\nEqual salaries");
        else if(ee1.compareTo(ee2)<0)
            System.out.println("\n"+ee2.getName() + " makes more than " + ee1.getName());
        else
            System.out.println("\n"+ee1.getName() + " makes more than " + ee2.getName());
        
        // print out the addresses in sorted order by zip code
        System.out.println("Address in sorted order: \n");
        if(a1.compareTo(a2)==0 || a1.compareTo(a2)<0)
        {
            System.out.println(a1);
            System.out.println(a2);
        }
        else
        {
            System.out.println(a2);
            System.out.println(a1);
        }
    }
}
/*
create two employee objects but before I can create the employee,
I need to instantiate an address object.

On line 11, I declare address "a1". "a1" is my variable name.
I say "equals new", there's that key word that instantiates this address.
"Address a1 = new Address" in the parentheses,
I'm passing all the values for the address,
"123", "South Main Street", "Cleveland", "OH", zip code "12345".
I'm creating a second address,
"123", "North Main Street", 'Willoughby", "OH", "54321".

Now I can create my two employees.
I'm just going to name them "ee1" and "ee2". The first employee,
again instantiated with the keyword "new", says "Employee ee1 = new Employee" "Peggy", "Fisher",
with the phone number, "a1" for my address, my employee ID number,
the department that I'm in, "003", my title of "Lecturer" and my salary, "45000.00".
I print out the employee by using the new name of the object, "ee1.printEmployee" because the
"printEmployee" is a method in the Employee class.

Now I'm creating a second employee, Bob Fisher. He's also a lecturer,
he makes a little bit more than Peggy, 45500.00. I'm going to print out Bob's
information as well, "ee2.printEmployee" Now I want to show how we can use the "compareTo" method.
I have "if ee1.compareTo" and in parentheses "(ee2)" == 0 Okay,
I'm going to jump over to the Employee class, just for a second and remember that on line 23 it
says "if ee1.compareTo ee2".

In the Employee class, if I scroll down to the "compareTo" ,
we talked about this earlier, but you see where it has "if this"?
The "this" is referring to "ee1.salary is>emp" and "emp" represents the "ee2" object that came in
from the calling program in the parentheses of the "compareTo". Let me go back to the Payroll program,
and you can see I checked to see if the salaries are equal or if "ee1" makes less than "ee2",
or if "ee1" makes more than "ee2", and finally, I want to use my "compareTo" for the addresses
because the addresses are sorted by zip code.

It wouldn't make sense to sort the addresses by salary. You can see how useful that "compareTo" method 
can be. So again, I check "if (a1.compareTo (a2) ==0 or if a1<a2", either way I'll print "a1" first,
then "a2". Otherwise, I'll reverse the order. All right, let's take a look at running this program.
All the code is already in the program to instantiate the employees and their addresses and
then print out the results.

Let's check it out. I'm going to make my output window a little bigger and we can see it printed
out the employee information for Employee One, the name, the title, the address, the employee ID, the
department and the salary. Right below that is Employee Two, name, title, address, employee ID,
department and salary. The next lines show that Bob Fisher makes more than Peggy Fisher.
We used the compareTo with the salaries, and finally, we print the addresses out in sorted order.

Of course, 12345, that zip code comes before 54321. All right, before we leave, let's do one more thing.
Let's change the title of the second employee and change the salary. Let's give the second employee a
title of "Producer" and change the salary to 60000 dollars. But the first time we do it,
let's accidentally type 6000, because we do have that check in there for salaries less than 10000.

Okay, I'm going to come down here to right below where I print out my Employee Two,
and I'm going to do "ee2." and you can see all the methods that I created in my Employee class come up,
and what I want to do is I want to use the "setSalary" so I need to scroll down to "setSalary"
and I'm going to put it as 6000 dollars and I also want to do "ee2.setTitle" and give this second
employee a new title of Producer.

To make sure that everything was done correctly, I'll now print it out again "ee2.printEmployee".
All right, let's run the program and see how this works. Okay, if I scroll to the top you'll see it
printed out, both employees again, but now here I have an error. It says "invalid salary amount,
salary was not updated". But it still printed out the second employee and you'll notice the title
was changed but the salary is still 45500. By adding that code, it helps us to make sure that the
data is not updated incorrectly.

Okay, let's go back to Payroll and fix it to 60000 and run it one more time. This time we're not
getting any error messages and you can see that Bob Fisher is now a Producer making 60000 dollars.
In this example you've seen how to create a class, instantiate objects with that class type,
and modify data in the class using what we call "mutator methods" or "set methods."
In this example, you have seen how to create classes, how to instantiate objects with the class types,
how to modify data in the class using "mutator methods" and how to access the data using "accessor methods".

This is an example of encapsulation and I hope that this made sense and you can now create your
own classes and instantiate your own objects.
*/