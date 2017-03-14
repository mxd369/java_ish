package ch2;
public class Result {
	
	public static void main(String args[]) {

		int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		double fResult, val1 = 17.0, val2 = 12.78;
		iResult = num1 / num4;  // 25 / 5 = 5
		fResult = num1 / num4;  // 25 / 5 = 5.0

		System.out.println("The expected stored result is " + 5);
		System.out.println("The stored result is " + iResult);
		System.out.println("The expected stored result is " + 5.0);
		System.out.println("The stored result is " + fResult);

		System.out.println(" ");

		System.out.println("iResult = num3 / num4");					// 17 / 5 = 3
		System.out.println("fResult = num3 / num4");					// 17 / 5 = 3.4
		System.out.println("fResult = val1 / num4");					// 17.0 / 5
		System.out.println("fResult = val1 / val2");					// 17.0 / 12.78
		System.out.println("iResult = num1 / num2");					// 25 / 40
		System.out.println("fResult = (double) num1 / num2");			// 
		System.out.println("fResult = (double) (num1/num2)");			//
		System.out.println("iResult = (int) (val1 / num4)");			//
		System.out.println("fResult = (int) (val1 / num4)");			//
		System.out.println("fResult = (int) ((double) num1 / num2)");	//
		System.out.println("iResult = num3 % num4");					//
		System.out.println("iResult = num2 % num3");					//
		System.out.println("iResult = num3 % num2");					//
		System.out.println("iResult = num2 % num4");					//

	}
}