package ch2;

/*
Read numerator and denominator from user
calculate decimal value equivalent of fraction
display fraction value
*/
import java.util.Scanner;

public class fractionValue {
	public static void main(String[] args) {
		double numerator;
		double denominator;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give double value of numerator");
		numerator = scan.nextDouble();
		System.out.println("Give double value of denominator");
		denominator = scan.nextDouble();
		System.out.println("Fraction Value: " + (numerator/denominator));
	}
}
