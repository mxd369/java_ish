package warmup1;
/*

Given 2 int values,
return true if one is negative and one is positive.

Except if the parameter "negative" is true,
then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

Expected	Run		
posNeg(1, -1, false) → true	true	OK	
posNeg(-1, 1, false) → true	true	OK	
posNeg(-4, -5, true) → true	true	OK	
posNeg(-4, -5, false) → false	false	OK	
posNeg(-4, 5, false) → true	true	OK	
posNeg(-4, 5, true) → false	false	OK	
posNeg(1, 1, false) → false	false	OK	
posNeg(-1, -1, false) → false	false	OK	
posNeg(1, -1, true) → false	false	OK	
posNeg(-1, 1, true) → false	false	OK	
posNeg(1, 1, true) → false	false	OK	
posNeg(-1, -1, true) → true	true	OK	
posNeg(5, -5, false) → true	true	OK	
posNeg(-6, 6, false) → true	true	OK	
posNeg(-5, -6, false) → false	false	OK	
posNeg(-2, -1, false) → false	false	OK	
posNeg(1, 2, false) → false	false	OK	
posNeg(-5, 6, true) → false	false	OK	
posNeg(-5, -5, true) → true

*/

public class posNeg {
	
	public static boolean posNeg(int a, int b, boolean negative){
		if (!negative) {
			return (a >= 0 && b < 0) || (b >= 0 && a < 0);
		}
		else if (negative){
			return a < 0 && b < 0;
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.print("Should be true: ");
		System.out.println(posNeg(1, -1, false));
		System.out.println();

		System.out.print("Should be true: ");
		System.out.println(posNeg(-1, 1, false));
		System.out.println();
		
		System.out.print("Should be true: ");
		System.out.println(posNeg(-4, -5, true));
		System.out.println();
	}
}