package testingGround;

import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;

/**
 * Joda Time - Demo
 *
 * 1. Joda Time has a much better API than what's available in Java's standard Library
 * 2. There are classes for TIMESTAMPS with or without a TIMEZONE, classes for holding only a date
 * (year, month, day) or only a TIME OF DAY.
 * 3. It supports the ISO 8601 FORMAT
 */


public class JodaTimeExample {

    public static void main(String[] args)
    {
        String dateStart = "06/14/2015 08:40:58";
        String dateStop = "06/15/2015 11:34:48";
    
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    
        java.util.Date date1 = null;
        java.util.Date date2 = null;
    
        try 
        {
            date1 = format.parse(dateStart);
            date2 = format.parse(dateStop);
        
            DateTime dt1 = new DateTime(date1);
            DateTime dt2 = new DateTime(date2);
        
            System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
            System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " hours, ");
            System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " minutes, ");
            System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 + " seconds, ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}