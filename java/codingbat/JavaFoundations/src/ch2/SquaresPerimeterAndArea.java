package ch2;
import java.io.*;
import java.util.Scanner;

// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
public class SquaresPerimeterAndArea {
	public static void main(String args[]) {
		System.out.println("Give length of square's side");
		Scanner sc = new Scanner(System.in);
		int squareSide = sc.nextInt();
		System.out.println("You entered: " + squareSide);
		int Perimeter = squareSide * 4;
		int Area = squareSide * squareSide;
		System.out.println("The Perimeter is " + Perimeter);
		System.out.println("The Area is " + Area);
	}
}
