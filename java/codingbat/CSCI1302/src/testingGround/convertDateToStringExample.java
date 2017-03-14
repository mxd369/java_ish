/*
        Java Date to String Example
        This Java Date to String example shows how to convert java.util.Date to
        String in Java.
 */
package testingGround;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class convertDateToStringExample {
 
        public static void main(String args[]){
               
                //create new java.util.Date object
                Date date = new Date();
                //date = "11"
                /*
                 * To convert java.util.Date to String, use SimpleDateFormat class.
                 */
               
                /*
                 * crate new SimpleDateFormat instance with desired date format.
                 * We are going to use yyyy-mm-dd hh:mm:ss here.
                 */
                DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
               
                //to convert Date to String, use format method of SimpleDateFormat class.
                String strDate = dateFormat.format(date);
               
                System.out.println(strDate);
               
        }
}
 
/*
Output of above given java.util.Date to String example would be
Date converted to String: 2011-17-10 11:17:50
*/