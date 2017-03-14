package warmup1;
/*

Given a string,
return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

notString("candy")   → "not candy"
notString("x")       → "not x"
notString("not bad") → "not bad"

Expected	Run		
notString("candy") 	→ "not candy"	"not candy"		OK
notString("x") 		→ "not x"		"not x"			OK
notString("not bad")→ "not bad"		"not bad"		OK
notString("bad") 	→ "not bad"		"not bad"		OK
notString("not") 	→ "not"			"not"			OK
notString("is not") → "not is not"	"not is not"	OK
notString("no") 	→ "not no"		"not no"		OK

*/

public class notString {
	
	public static String notString(String str){
		if (str.length() >= 3 && str.substring(0, 3).equals("not")){
			return str;
		}else
			return "not " + str;
	}
	
	public static void main(String[] args){
		System.out.print("Should be 'not candy': ");
		System.out.println(notString("candy"));
		System.out.println();
		
		System.out.print("Should be 'not x': ");
		System.out.println(notString("x"));
		System.out.println();
		
		System.out.print("Should be 'not bad': ");
		System.out.println(notString("bad"));
		System.out.println();
	}
}