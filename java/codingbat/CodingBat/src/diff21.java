/*

Given an int n,
return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

Expected	Run		
diff21(19) → 2	2	OK	
diff21(10) → 11	11	OK	
diff21(21) → 0	0	OK	
diff21(22) → 2	2	OK	
diff21(25) → 8	8	OK	
diff21(30) → 18	18	OK	
diff21(0)  → 21	21	OK	
diff21(1)  → 20	20	OK	
diff21(2)  → 19	19	OK	
diff21(-1) → 22	22	OK	
diff21(-2) → 23	23	OK	
diff21(50) → 58	58	OK	


*/

public class diff21{
	public static int diff21(int n){
		int absdiff = Math.abs(n-21);
		if (n >= 21){
			return absdiff * 2;
		} else
			return absdiff;	
	}
	public static void main(String[] args){
		System.out.print("Should be 2: ");
		System.out.println(diff21(19));
		System.out.println();
		System.out.print("Should be 11: ");
		System.out.println(diff21(10));
		System.out.println();
		System.out.print("Should be 0: ");
		System.out.println(diff21(21));
		System.out.println();

	}
}