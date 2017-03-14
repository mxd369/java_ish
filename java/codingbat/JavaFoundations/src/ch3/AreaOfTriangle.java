package ch3;
import java.text.DecimalFormat;// round the three decimal places
import java.util.Scanner;
// 10536210-1
// https://en.wikipedia.org/wiki/Heron%27s_formula
public class AreaOfTriangle {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int sideA, sideB, sideC;
		double area, s;
		System.out.println("Give side A: ");
		sideA = scan.nextInt();
		System.out.println("Give side B: ");
		sideB = scan.nextInt();
		System.out.println("Give side C: ");
		sideC = scan.nextInt();
		
		// After reading the lengths of the triangle find the perimeter of
		// the triangle because "S" is half of the perimeter.
		// Math.sqrt helps find the square root.

		// Calculate area of a triangle
		s = (sideA+sideB+sideC)/2;
		area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		
		// round the output to three decimal places
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		// printing area to three decimal places
		System.out.println("Area is: "+fmt.format(area));
		
		// close the scanner
		scan.close();
	}
}
