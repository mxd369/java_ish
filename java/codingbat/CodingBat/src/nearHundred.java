/*
Given an int n,
return true if it is within 10 of 100
or 200.
Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

Expected	Run		
nearHundred(93)   → true	true	OK	
nearHundred(90)   → true	true	OK	
nearHundred(89)   → false	false	OK	
nearHundred(110)  → true	true	OK	
nearHundred(111)  → false	false	OK	
nearHundred(121)  → false	false	OK	
nearHundred(-101) → false	false	OK	
nearHundred(-209) → false	false	OK	
nearHundred(190)  → true	true	OK	
nearHundred(209)  → true	true	OK	
nearHundred(0)    → false	false	OK	
nearHundred(5)    → false	false	OK	
nearHundred(-50)  → false	false	OK	
nearHundred(191)  → true	true	OK	
nearHundred(189)  → false	false	OK	
nearHundred(200)  → true	true	OK	
nearHundred(210)  → true	true	OK	
nearHundred(211)  → false	false	OK	
nearHundred(290)  → false	false	OK
*/
public class nearHundred{

	public static boolean nearHundred(int n){
		return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10; 
	}
	
	public static void main(String[] args){
		System.out.print("Should be true: ");
		System.out.println(nearHundred(93));
		System.out.println();
		System.out.print("Should be true: ");
		System.out.println(nearHundred(90));
		System.out.println();
		System.out.print("Should be false: ");
		System.out.println(nearHundred(89));
		System.out.println();
	}
}