// QuartersDimesNickelsPenniesToDollarsAndCents
package ch2;
import java.util.Scanner;

public class QuartersDimesNickelsPenniesToDollarsAndCents {
	public static void main(String args[]){
		int quarters, dimes, nickels, pennies;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give number of quarters:");
		quarters = scan.nextInt();
		System.out.println("Give number of dimes:");
		dimes = scan.nextInt();
		System.out.println("Give number of nickels:");
		nickels = scan.nextInt();
		System.out.println("Give number of pennies:");
		pennies = scan.nextInt();

		
		int dollars = (quarters/4)+(dimes/10)+(nickels/20)+(pennies/100); 
		int cents = 0;
		
		System.out.println("$" + dollars + "." + cents + " cents"); 
	}	
}
