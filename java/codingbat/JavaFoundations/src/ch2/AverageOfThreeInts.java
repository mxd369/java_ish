package ch2;

import java.util.Scanner;
public class AverageOfThreeInts {
	public static void main(String args[]){
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first int");
		a = scan.nextInt();
		System.out.println("Enter the second int");
		b = scan.nextInt();
		System.out.println("Enter the third int");
		c = scan.nextInt();
		System.out.println("The average is: " + ((a+b+c)/3));
		
		
		scan.close();
	}
}
