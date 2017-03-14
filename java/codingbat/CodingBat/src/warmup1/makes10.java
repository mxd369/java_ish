package warmup1;
/*
Given 2 ints, a and b,
return true if one if them is 10
or if their sum is 10.



Expected	Run		
makes10(9, 10) → true	true	OK	
makes10(9, 9) → false	false	OK	
makes10(1, 9) → true	true	OK	
makes10(10, 1) → true	true	OK	
makes10(10, 10) → true	true	OK	
makes10(8, 2) → true	true	OK	
makes10(8, 3) → false	false	OK	
makes10(10, 42) → true	true	OK	
makes10(12, -2) → true	true	OK

*/
public class makes10 {
	
	public static boolean makes10(int a, int b) {
		  return (a == 10 || b == 10) || (a + b == 10);
	}

	public static void main(String[] args){
		System.out.print("Should be true: ");
		System.out.println(makes10(9, 10));
		System.out.println();
		System.out.println("Should be false: ");
		System.out.println(makes10(9, 9));
		System.out.println();
		System.out.println("Should be true: ");
		System.out.println(makes10(1, 9));
		System.out.println();
	}
	
}