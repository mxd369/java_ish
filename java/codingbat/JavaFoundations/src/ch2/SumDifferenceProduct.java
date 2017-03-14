package ch2;
import java.util.Scanner;

public class SumDifferenceProduct {
	public static void main(String args[]){
		float a,b,sum,difference,product;
		Scanner s = new Scanner(System.in);
		System.out.println("Give the first floating point number");
		a = s.nextFloat();
		System.out.println("Give the second floating point number");
		b = s.nextFloat();
		sum = a + b;
		difference = a - b;
		product = a * b;
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
	}
}
