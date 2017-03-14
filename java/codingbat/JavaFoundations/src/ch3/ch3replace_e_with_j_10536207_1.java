package ch3;
/*
Program declaration to replace all the characters "e" with the character "j"
from the string object "original" and store the new changed string
in the string object is called "change"

The statements are:

String original = "ecobe", change;
change = original.replaceAll("e","j");
System.out.println("Reversed string is : "+change);

*/
public class ch3replace_e_with_j_10536207_1 {
	public static void main(String[] args){
		String original = "ecobe", change;
		change = original.replaceAll("e","j");
		System.out.println("Reversed string is : "+change);
	}
}