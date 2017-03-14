/**
 * 
 */
package exercise;

/**
 * @author Mehdi
 *
 */
public class WallClock extends Clock
{
   //----------------------------------------------------------------
   //  Sets up an alarm clock with the specified information.
   //----------------------------------------------------------------
   public WallClock (String eManufacturer, double ePrice, double eWeight,
				   String time)
   {
       super (eManufacturer, ePrice, eWeight, time);
   }

   //----------------------------------------------------------------
   //  Returns information about the room of the house the wall
   //  clock is in.
   //----------------------------------------------------------------
   public String room()
   {
      return "Kitchen";
   }

   //----------------------------------------------------------------
   //  Returns information about this wall clock as a string.
   //----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString() + "\n";
      return result;
   }
}
