/*

Array1

Basic array problems -- no loops..
Use a[0], a[1], ... to access elements in an array,
a.length is the length (note that s.length() is for Strings).
Allocate a new array like this: int[] a = new int[10]; // length 10 array 



Given an array of ints, return true if the array is length 1 or more,
and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/
/*
package array1;

public class sameFirstLast{
	
	
	public static boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && (nums[0] == nums[nums.length-1]);
	}
	
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	
}

/*
Expected	Run		
sameFirstLast([1, 2, 3]) 			→ false	false	OK	
sameFirstLast([1, 2, 3, 1]) 		→ true	true	OK	
sameFirstLast([1, 2, 1]) 			→ true	true	OK	
sameFirstLast([7]) 					→ true	true	OK	
sameFirstLast([]) 					→ false	false	OK	
sameFirstLast([1, 2, 3, 4, 5, 1])	→ true	true	OK	
sameFirstLast([1, 2, 3, 4, 5, 13]) 	→ false	false	OK	
sameFirstLast([13, 2, 3, 4, 5, 13]) → true	true	OK	
sameFirstLast([7, 7]) 				→ true	true	OK	
other tests
OK	

*/
