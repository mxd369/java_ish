package warmup1;
/*
Given two int values, return their sum.
Unless the two values are the same, then return double their sum.

Expected	Run		
sumDouble(1, 2)  → 3	3	OK	
sumDouble(3, 2)  → 5	5	OK	
sumDouble(2, 2)  → 8	8	OK	
sumDouble(-1, 0) → -1	-1	OK	
sumDouble(3, 3)  → 12	12	OK	
sumDouble(0, 0)  → 0	0	OK	
sumDouble(0, 1)  → 1	1	OK	
sumDouble(3, 4)  → 7	7	OK

*/
public class sumDouble{
	public static int sumDouble(int a, int b){
		int sum = a + b;
		if (a == b){
			return sum * 2;
		} else
		return sum;
	}
	public static void main(String[] args){
		System.out.print("Should be 3: ");
		System.out.println(sumDouble(1, 2));
		System.out.println();
		System.out.print("Should be 5: ");
		System.out.println(sumDouble(3, 2));
		System.out.println();
		System.out.print("Should be 8: ");
		System.out.println(sumDouble(2, 2));
		System.out.println();
		System.out.print("Should be 0: ");
		System.out.println(sumDouble(0, 0));
		System.out.println();
		System.out.print("Should be 1: ");
		System.out.println(sumDouble(-1, 2));
		System.out.println();
	}
}