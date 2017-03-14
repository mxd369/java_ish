package ch2;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String args[]) {
	// ((Fahrenheit - 32) * 5) / 9
	Scanner s = new Scanner(System.in);
	System.out.println("Give the temperature to be converted from Fahrenheit to Celsius");
	float Fahrenheit, Celsius;
	Fahrenheit = s.nextFloat();
	Celsius = ((Fahrenheit - 32) * 5) / 9;
	System.out.println("Celsius is: " + Celsius);
	}
}
