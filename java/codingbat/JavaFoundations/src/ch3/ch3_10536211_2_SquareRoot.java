package ch3;
/**
 * This program demonstrates to reads the num1 and num2
 * and computes the square root of the sum and display the result.
 * Program name: ch3_10536211_2_SquareRoot.java
 * @author michaeldang
 */

/**
 * find the square root of two numbers after addition and then storing in the third variable.
 * "Math.sqrt()" function is used to find the square root of the variable
 * Statement:
 * compute square root of the sum of num1 and num2 and assigns the result to num3
 * num3=Math.sqrt(num1+num2);
 */
import java.util.Scanner;

public class ch3_10536211_2_SquareRoot
{
	
	public static void main (String[] args){
		int num1,num2;
		double num3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give num1: ");
		num1 = scanner.nextInt();
		System.out.println("Give num1: ");
		num2 = scanner.nextInt();
		
		scanner.close();
		
		num3 = Math.sqrt(num1+num2);
		
		System.out.println("The square root value is: "+num3);
	}
	
}