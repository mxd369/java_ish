package testingGround;

//import java.util.Date;
import java.util.Scanner;

//Date.java
/**************
Date
______________
- Day
- Month
- Year
______________
+ toString()
+ input()
***************/

public class Date
{
    // create variables
    private int day;
    private int month;
    private int year;
    
    
    // create 3 constructors:
    // Date()
    // Date(int, int, int)
    // Date(Date)
    public Date()
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Date(Date d)
    {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    
    // toString method
    @Override
    public String toString() {
        // return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
        return ""+this.year+". "+this.month+". "+this.year;
    }
    
    // input method
    public void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day");
        day = in.nextInt();
        System.out.println("Enter month");
        month = in.nextInt();
        System.out.println("Enter year");
        year = in.nextInt();
    }
    
    
    
    /*
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.println("Today's date is: " + d);//Today's date is: Sat Nov 26 16:04:55 EST 2016
    }
    */
}