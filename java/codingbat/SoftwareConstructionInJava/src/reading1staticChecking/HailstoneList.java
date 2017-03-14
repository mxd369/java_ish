package reading1staticChecking;

import java.util.ArrayList;
import java.util.List;

public class HailstoneList {	
	/**
	 * Compute a hailstone sequence.
	 * @param n Starting number for sequence. Assumes n > 0.
	 * @return hailstone sequence starting with n and ending with1.
	 */
	public static List<Integer> hailstoneSequence(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		while (n != 1) {
			list.add(n);
			if (n % 2 == 0){
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		list.add(n);
		return list;
	}

}
/*
public static List<Integer> hailstoneSequence(final int n) { 
      final List<Integer> list = new ArrayList<Integer>();
      while (n != 1) {
          list.add(n);
          if (n % 2 == 0) {
              n = n / 2;
          } else {
              n = 3 * n + 1;
          }
      }
      list.add(n);
      return list;
    }
  }


Which of the following are true statements about putting final on n?
final can't be used on n because n is reassigned to other integer values in the body of the method 


Which of the following are true statements about putting final on list?
final can be used on list, and it prevents the list variable from being reassigned 

Explanation
final can't be used on n because n needs to be reassigned in the body of the method.
But final can indeed be used on list.
final can be used on both parameters and local variables.
When used on a parameter, final means that the parameter is assigned when the method is called,
and then can't be reassigned during the body of the method. When used on a local variable,
final means that the variable can't be reassigned after its first assignment,
until the variable's scope ends.
final can be used on variables of any type -- not just immutable types like int,
but also mutable types like List. If a final variable points to a mutable object,
then the variable cannot be reassigned, but the object it points to can still be mutated,
say by calling add() on a List.
*/

// public means that any code, anywhere in your program,
// can refer to the class or method.
// Other access modifiers, like private,
// are used to get more safety in a program,
// and to guarantee immutability for immutable types

// static means that the method doesn't take a self parameter — which
// in Java is implicit anyway, you won't ever see it as a method parameter.
// Static methods can't be called on an object.
// Contrast that with the List add() method or the String length() method,
// for example, which require an object to come first.
// Instead, the right way to call a static method uses the class name instead
// of an object reference:

//   Hailstone.hailstoneSequence(83)

/*

Take note also of the comment before the method,
because it's very important.
This comment is a specification of the method,
describing the inputs and outputs of the operation.
The specification should be concise and clear and precise.
The comment provides information that is not already clear from the method types.
It doesn't say, for example, that n is an integer,
because the int n declaration just below already says that.
But it does say that n must be positive,
which is not captured by the type declaration but is very important for the caller to know.

We'll have a lot more to say about how to write good specifications in a few classes,
but you'll have to start reading them and using them right away.

*/
