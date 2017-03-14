// Listing 4.1
//*******************************************************
// Age.java
//
// Demonstrates the use of an if statement.
//*******************************************************
package ch4;
import java.util.Scanner;

// create variable minor
// read in age
// output the age to display
// check if age is less than minor
// if it is, then output "Youth is a wonderful thing. Enjoy."
// or
// "age is a state of mind"
public class Listing_4_1_Age {

	public static void main(String[] args){
		final int minor = 21;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		scanner.close();
		System.out.println("The Age entered is "+age);
		
		if (age < minor)
			System.out.println("Youth is a wonderful thing. Enjoy.");
		System.out.println("Age is a state of mind.");
	} 
	
}