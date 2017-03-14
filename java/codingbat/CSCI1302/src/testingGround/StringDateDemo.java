package testingGround;

import java.text.ParseException;
import java.text.SimpleDateFormat;

// Create a simpleDateFormat object by passing the date pattern
// Pass the date String to SimpleDateFormat parse method
public class StringDateDemo 
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
        String date="01-01-1990";
        System.out.println(sdf.parse(date));
    }
    
}