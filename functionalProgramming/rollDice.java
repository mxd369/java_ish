public class rollDice {
	public int rollsDice() {
		// random num between 0 and (almost) 1
		double randomNumber = Math.random(); // 0 - 0.999

		// change range to 0 to (almost) 6
		randomNumber = randomNumber * sides; // range of 6 total numbers,change to accommedate for 8

		// cast to integer (ignore decimal part)
		// ex. 6.998 becomes 6
		int randomInt = (int) randomNumber; // casting, range = 1 - 6 (integers)

		// return statement
		return randomInt;
	}
}

public static void main(String args[]) {
	// Function calls
	int roll1 = new rollsDice();
	int roll2 = new rollsDice();
	System.out.println("Roll 1: " + roll1);
	System.out.println("Roll 2: " + roll2);
}