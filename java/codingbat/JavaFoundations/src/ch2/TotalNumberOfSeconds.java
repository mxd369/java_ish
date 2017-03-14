package ch2;
//Reads values of hours, minutes and seconds
//converts hours, minutes, and seconds to total number of seconds
//displays total number of seconds
import java.util.Scanner;

public class TotalNumberOfSeconds {
	
	public static void main(String args[]){
	int hours, minutes, seconds;
	Scanner scan = new Scanner(System.in);

	System.out.println("Give the of Hours");
	hours = scan.nextInt();
	System.out.println("Give the number of Minutes");
	minutes = scan.nextInt();
	System.out.println("Give the number of Seconds");
	seconds = scan.nextInt();

	int TotalSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;

	// Display total number of seconds
	System.out.println("Total Number of Seconds " + TotalSeconds);	
	}
}
