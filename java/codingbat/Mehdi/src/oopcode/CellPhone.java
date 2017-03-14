/**
 * 
 */
package exercise;

/**
 * @author Mehdi
 *
 */
public class CellPhone extends PortableElectronics
{
   protected String phoneNumber;
   protected boolean hasCamera;

   //----------------------------------------------------------------
   //  Sets up a cell phone with the specified information.
   //----------------------------------------------------------------
   public CellPhone (String eManufacturer, double ePrice, double eWeight, String number, boolean camera)
   {
      super (eManufacturer, ePrice, eWeight);
      phoneNumber = number;
      hasCamera = camera;
   }

   //----------------------------------------------------------------
   //  Returns information about this walkman's battery type as a
   //  string.
   //----------------------------------------------------------------
   public String batteryType()
   {
      return "Lithium-Ion";
   }

   //----------------------------------------------------------------
   //  Returns the camera's phone number as a string.
   //----------------------------------------------------------------
   public String number()
   {
      return phoneNumber;
   }

   //----------------------------------------------------------------
   //  Returns true if the phone has a camera and false otherwise.
   //----------------------------------------------------------------
   public boolean takesPictures()
   {
      return hasCamera;
   }

	//----------------------------------------------------------------
	//  Returns information about this cell phone as a string.
	//----------------------------------------------------------------
	public String toString()
	{
		String result = super.toString();

		result += "\nNumber: " + phoneNumber + "\n";
		result += "Has Camera: " + hasCamera + "\n";
		result += "Battery Type: " + batteryType();

		return result;
	}
}
