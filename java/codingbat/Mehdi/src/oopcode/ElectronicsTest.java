/**
 * 
 */
package exercise;

/**
 * @author Mehdi
 *
 */
public class ElectronicsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Clock clock = new Clock ("Centurian", 20.34, 3.2, "12:35pm");
		System.out.println ("Clock\n");
		System.out.println (clock.toString() + "\n");
		WallClock wClock = new WallClock ("Swiss", 13.89, 2.5, "2:33pm");
		System.out.println ("Wall Clock\n");
		System.out.println(wClock.toString());
		CellPhone cell = new CellPhone ("Motorola", 99.99, .5, "555-987-1829", true);
		System.out.println ("Cell Phone\n");
		System.out.println (cell.toString());
		if (cell.takesPictures())
			System.out.println ("This is a camera phone.\n");
		else
			System.out.println ("Sorry, your phone cannot take pictures.\n");
	}

}
