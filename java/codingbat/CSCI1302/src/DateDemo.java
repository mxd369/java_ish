import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo
{
    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        String s = sdf.format(d);
        System.out.println(s);
    }
}