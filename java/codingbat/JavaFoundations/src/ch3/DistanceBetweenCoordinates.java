package ch3;
// 10536208-1

import java.util.Scanner;
public class DistanceBetweenCoordinates {

	public static void main(String args[]){
		int x1, y1, x2, y2;
		double distance;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the x1:");
		x1 = scan.nextInt();
		System.out.println("Give the y1:");
		y1 = scan.nextInt();
		System.out.println("Give the x2:");
		x2 = scan.nextInt();
		System.out.println("Give the y2:");
		y2 = scan.nextInt();
		distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("The distance between the coordinates is: " + distance);
	}
}
