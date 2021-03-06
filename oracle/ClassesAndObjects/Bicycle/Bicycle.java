public class Bicycle {
	// Bicycle class has
	// three fields
	public int cadence;
	public int gear;
	public int speed;

	// the Bicycle class has
	// one constructor
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}

	// the Bicycle class has
	// four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed += decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}

/*
cadence (or pedalling rate) is the number of revolutions
of the crank per minute; this is the rate at which a
cyclist is pedalling/turning the pedals.
*/

// resource: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html