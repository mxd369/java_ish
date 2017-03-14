// https://www.youtube.com/watch?v=AK__Af6F6aA
package testingGround;

import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;
import java.time.*;
/**
 * How to validate "Date" Format using Java ?
 * @author michaeldang
 */
public class ValidDate
{
    public static void main(String[] args)
    {
        List<String> dates = new ArrayList<String>();
        // VALID DATES
        dates.add("1/1/11");
        dates.add("01/01/2015");
        dates.add("1/11/2014");
        // INVALID DATES
        dates.add("01/31/112");
        dates.add("01/20/1987");
        
        for (String date : dates)
        {
            if (isValidDate(date))
            {
                System.out.println(date + " Valid Date Format");
            }
            else
            {
                System.out.println(date + " Invalid Date Format");
            }
        }
    }
    
    // Using Joda Time
    private static boolean isValidDate(String dateOfBirth)
    {
        boolean validDate = true;
        try
        {
            org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyy");
            DateTime dob = formatter.parseDateTime(dateOfBirth);// very important
        }
        catch (Exception e)
        {
            validDate = false;
        }
        return validDate;
    }
}