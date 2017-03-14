package ch3;
//SumOfCube.java
//10536206-1.png
import java.util.Scanner;

public class SumOfCube {
	public static void main(String args[]){
		int a, b, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give an Integer Value: ");
		a = scan.nextInt();
		System.out.println("Give another Integer Value: ");
		b = scan.nextInt();
		sum =(int) (Math.pow(a, 3) + Math.pow(b, 3));
		System.out.println(sum);
	}
}

