/*
A class declaration for a MountainBike class
is a subclass of Bicycle might look like this:
*/
public class MountainBike extends Bicycle {

	// the MountainBike subclass has
	// one field
	public int seatHeight;

	// the MountainBike subclass has
	// one constructor
	public MountainBike (int startHeight, int startCadence, int startSpeed, int startGear){
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass has
	// one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

}
/*
MountainBike inherits all the fields and methods of Bicycle
and adds the field seatHeight
and a method to set it
(mountain bikes have seats that can be moved up and down as the terrain demands).
*/

/*
Error:
Main method not found in class MountainBike, please define the main method as:
   public static void main(String[] args)

or a JavaFX application class must extend javafx.application.Application
*/