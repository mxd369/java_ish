package interfaces;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Interface7
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Joe",12,3.7);
        Student s2 = new Student("Bob",12,3.7);
        
        System.out.println("Compare to Returns :: " + s1.compareTo(s2));
        int result = s1.compareTo(s2);
        
        if(result < 0)
            System.out.println(s1.getName() + " comes before " + s2.getName());
        else if(result > 0)
            System.out.println(s2.getName() + " comes before " + s1.getName());
        else
            System.out.println(s1.getName() + " is equal to " + s2.getName());
    }
}