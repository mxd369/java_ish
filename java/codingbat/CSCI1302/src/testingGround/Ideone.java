package testingGround;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    private class Test{
        private Date date;

        public void setDate(Date date){
            this.date = date;
        }

        public Date getDate(){
            return this.date;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Ideone abc = new Ideone();
        abc.functionTest();

    }

    public void functionTest(){
        Date tempDate = new Date(1403685556000L);    // first reference.
        Test test = new Test();                  
        test.setDate(tempDate);                      
        tempDate = new Date(1435221556000L);         // second reference.
        Date abc = test.getDate();                   // you take the first reference since you do not set "tempDate" in Test before.
        Long def = abc.getTime();
        System.out.println("Date 1:"+def.toString()); // you print the first reference.
        test.setDate(tempDate);                       // you set the second reference and overwrite the first one.
        def = abc.getTime();                          // but "abc" still points on first reference.
        System.out.println("Date 2:"+def.toString());
    }
}