/*
Given a non-empty string and an int n,
return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/

public class missingChar {
	
	public static String missingChar(String str, int n){
		// remove n from str
		String front = str.substring(0,n);
		String back = str.substring(n,str.length());
		return back;
	}

	public static void main(String[] args){
		System.out.print("Should be ktten: ");
		System.out.print(missingChar("kitten", 1));
		System.out.println();
		
		System.out.print("Should be itten: ");
		System.out.print(missingChar("kitten", 0));
		System.out.println();
		
		System.out.print("Should be kittn: ");
		System.out.println(missingChar("kitten", 4));
		System.out.println();
	}

}
