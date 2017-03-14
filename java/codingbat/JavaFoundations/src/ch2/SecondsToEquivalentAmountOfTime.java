// read number of seconds
// convert seconds to equivalent combination of hours, minutes and seconds
package ch2;
import java.util.Scanner;

public class SecondsToEquivalentAmountOfTime {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int seconds;
		System.out.println("Give the number of seconds");
		seconds = scan.nextInt();
		int hours, minutes;
		hours = seconds / 3600;
		minutes = hours % 3600; 
		seconds = minutes/ 60;
		seconds = seconds % 60; 
		System.out.println("Time is: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
	}

}
