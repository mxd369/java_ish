package ch3;
// 10536209-1
import java.util.Scanner;

public class VolumeAndSurfaceAreaValues {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int radius;
		double pi = 3.14;
		System.out.println("Give the radius value:");
		radius = scan.nextInt();
		double volume = (4/3) * pi * Math.pow(radius, 3);
		double surfaceArea = 4 * pi * Math.pow(radius, 2);
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + surfaceArea); 
	}
}
