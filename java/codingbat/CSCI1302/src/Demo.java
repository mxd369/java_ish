//import java.util.Date;
import java.util.LinkedList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import java.text.*;
/**
 * Demo class
 * Contains Main Method
 */
public class Demo {	

    /*
    Demo:
    The Demo program is a class with a main method that demonstrates that every method of your SortedDblList works.
    For the methods union and intersection of SortedDblList show that they work even if the current SortedDblList
    is a SortedDblList of Persons and the otherList is a SortedDblList of Students (see below).
    Do not forget to demonstrate how to serialize (to a file) and deserialize a SortedDblList.
    */
    public static void main(String[] args)
    {    
        //Person person1 = new Person(33,"A","B",sdf.parse("1-2-1994"));
        //Person person1 = new Person(33,"A","B",sdf.parse("1-2-1994"));

        // Create
        Person person0 = new Person(1111,"Tim","Keema", "01-25-1990");    
        Person person1 = new Person(1112,"Joe","Smith", "01-25-1991");
        Person person2 = new Person(1113,"Bob","Kerni", "01-25-1992");
        
        // Out
        System.out.println(person0);
        System.out.println(person1);
        System.out.println(person2);
    }
    
}