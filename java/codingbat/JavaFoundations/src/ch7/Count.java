// 10632277-2

/*************************************************************

PP 7.1

Design and implement an application that reads an
arbitrary number of integers that are in the range
0-50 inclusive and counts how many occurrences of each are entered.
After all input has been processed, print all of the values
(with the number of occurrences)
that were entered one or more times.


ch7/10632277-1

Program Plan:
  -This program counts the number of each value entered from the keyboard.
  -All the values which are entered between 0-50 are counted.
  -Display the numeric value with frequency.


Program Name: Count.java

**************************************************************/

/*
package ch7;
import java.io.*;
import java.util.Scanner;
public class Count
{
	public static void main(String[] args)
	throws IOException
	{
		// variable declaration
		Scanner scan = new Scanner(System.in);
		final int max = 50;
		final int min = 0;
		
		//array used as a counter
		int[] x = new int[max+1];
		
		// Initialize the array to zero
		for (int i = 0; i<x.length; i++)
		{
			x[i] = 0;
		}
		
		// Loop repeats up to either greater than the value or 50 or less than the value.
		// read numeric values and count every occurrence of each numeric value
		
		// reads input from user
		System.out.println("If you give a value below 0 or above 50 the program will stop and give you the output");
		System.out.println("Value Counter[Limit 0-50]\n{ (>Limit) To STOP}");
		System.out.print("Enter Value : ");
		int ip = scan.nextInt();
		System.out.println(ip);
		
		// loop runs until the user input is in the limit (0-50)
		while (ip >= min && ip <= max)
		{
			// increments the number of times the values are read from the keyboard
			x[ip] = x[ip] + 1;
			
			// reads values
			System.out.println("Enter Value: ");
			ip = scan.nextInt();
		}
		
		// Display the numeric value with count
		
		//prints the result
		System.out.println("\nCount of Each Value : ");
		for (int i = 0; i<x.length;i++)
		{
			if (x[i] > 0)
				System.out.print(i+": "+x[i]+"\n");
		}
		scan.close();
	}
	
}
*/