// Listing 4.8
//*******************************************************
// PalindromTester.java
//
// Demonstrates the use of nested while loops.
//*******************************************************
package ch4;

import java.util.Scanner;

public class Listing_4_8_PalindromeTester {
	
	//---------------------------------------------------
	// Tests strings to see if they are palindromes.
	//---------------------------------------------------
	public static void main(String[] args){
		
		String str, another = "y";
		int left, right;
		
		Scanner scan = new Scanner(System.in);
		
		// while loop
		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome");
			str = scan.nextLine();
			
			left = 0;
			right = str.length() - 1;
			
			while (str.charAt(left) == str.charAt(right) && left < right)
			{
				left++;
				right--;
			}
			
			System.out.println();
			if (left < right)
				System.out.println("That string is not palindrome.");
			else
				System.out.println("That string IS a palindrome.");
			System.out.println();
			System.out.println("Test another palindrome (y/n) ? ");
			another = scan.nextLine();
		}
		
		
		scan.close();
		System.out.print("Done");
	}

}