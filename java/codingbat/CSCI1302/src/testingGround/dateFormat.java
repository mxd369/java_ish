package testingGround;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
  public static void main(String[] args) throws ParseException {
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    // formatting
    System.out.println(format.format(new Date()));
    
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    String date="01-01-1990";
    System.out.println(sdf.parse(date));
    
  }
}