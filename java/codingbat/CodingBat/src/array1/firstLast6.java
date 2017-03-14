/*

Array1

Basic array problems -- no loops..
Use a[0], a[1], ... to access elements in an array,
a.length is the length (note that s.length() is for Strings).
Allocate a new array like this: int[] a = new int[10]; // length 10 array 



Given an array of ints,
return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/

/*
package array1;
public class firstLast6 {
	
	public static boolean firstLast6(int[] nums){
		return nums[0] == 6 || nums[nums.length-1] == 6;
	}
	
	public static void main(String[] args){
		//System.out.println(firstLast6(1, 2, 6));// → true
		//System.out.println(firstLast6(new int[] {6, 1, 2, 3}));// → true
		//System.out.println(firstLast6(new int[] {13, 6, 1, 2, 3}));// → false
		System.out.println("hello");
	}
}
*/

/*
Expected	Run		
firstLast6([1, 2, 6]) 		 → true		true	OK	
firstLast6([6, 1, 2, 3]) 	 → true		true	OK	
firstLast6([13, 6, 1, 2, 3]) → false	false	OK	
firstLast6([13, 6, 1, 2, 6]) → true		true	OK	
firstLast6([3, 2, 1]) 		 → false	false	OK	
firstLast6([3, 6, 1]) 		 → false	false	OK	
firstLast6([3, 6]) 			 → true		true	OK	
firstLast6([6]) 			 → true		true	OK	
firstLast6([3]) 			 → false	false	OK	
firstLast6([5, 6]) 			 → true		true	OK	
firstLast6([5, 5]) 			 → false	false	OK	
firstLast6([1, 2, 3, 4, 6])  → true		true	OK	
firstLast6([1, 2, 3, 4]) 	 → false	false	OK	
other tests					OK
*/
