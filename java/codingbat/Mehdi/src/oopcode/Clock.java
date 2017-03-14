/**
 * 
 */
package exercise;

/**
 * @author Mehdi
 *
 */
public class Clock extends HomeAppliance
{
   protected String currentTime;

   //----------------------------------------------------------------
   //  Sets up a clock with the specified information.
   //----------------------------------------------------------------
   public Clock (String eManufacturer, double ePrice, double eWeight,
                 String time)
   {
      super (eManufacturer, ePrice, eWeight);	
      currentTime = time;
   }

   //----------------------------------------------------------------
   //  Returns information about the room of the house the clock
   //  is in.
   //----------------------------------------------------------------
   public String room() {
      return "Living Room";
   }

   //----------------------------------------------------------------
   //  Returns information about the current time.
   //----------------------------------------------------------------
   public String getTime() {
      return currentTime;
   }

   //----------------------------------------------------------------
   //  Sets a new time for the clock.
   //----------------------------------------------------------------
   public void setTime(String newTime) {
      currentTime = newTime;
   }

   //----------------------------------------------------------------
   //  Returns information about this clock as a string.
   //----------------------------------------------------------------
   public String toString() {
      String result = super.toString();
      result += "\nCurrent Time: " + currentTime + "\n";
      result += "In Room: " + room();
      return result;
   }
}
