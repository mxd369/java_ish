/**
 * 
 */
package exercise;

/**
 * @author Mehdi
 *
 */
public class HomeAppliance extends Electronics{
	//----------------------------------------------------------------
	//  Sets up a home appliance with the specified information.
	//----------------------------------------------------------------
	public HomeAppliance (String eManufacturer, double ePrice, double eWeight) {
		super (eManufacturer, ePrice, eWeight);
	}
	
	public String room() {
	      return "Office";
	   }

	//----------------------------------------------------------------
	//  Derived classes must define the room method for each
	//  type of appliance.
	//----------------------------------------------------------------
	public String toString() {
		return super.toString() + "\n" + "Category: Home Appliance";
	}
}
