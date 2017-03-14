package ch2;
import java.util.Scanner;

public class MilesToKilometers{

	public static void main(String args[]){
	// kilometers = miles * 1.60935
	Scanner scan = new Scanner(System.in);
	double Miles, Kilometers;
	System.out.println("Give the miles");
	Miles = scan.nextDouble();
	Kilometers = Miles*1.60935;
	System.out.println("Kilometers is: " + Kilometers);
	}
}
