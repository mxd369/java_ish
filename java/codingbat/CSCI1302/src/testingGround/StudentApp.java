// Create Java class Name with 3 private variables for day, month, year
// Date.java
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

/**************
Employee
______________
- Name
- Date of Birth
- NIC
______________
+ toString()
+ input
***************/

/**************
Name
______________
- First Name
- Middle Name
- Last Name
______________
+ toString()
+ input()
***************/

package testingGround;
import java.util.Date;
/**
 *
 * @author MD
 */

public class StudentApp
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO
        Date d = new Date(2,5,2015);
        System.out.println(""+d);
    }
}