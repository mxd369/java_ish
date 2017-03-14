// Sets
// a set is a collection that cannot contain duplicate elements
// It models the mathematical set abstraction
// One of the implementations of the Set is the HashSet class.
import java.util.HashSet;

public class HashSets
{
	public static void main(String[] args)
	{
		// can use the size() method to get the number of elements in the HashSet
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		
		HashSet<String> set1 = new HashSet<String>();
		set.add("X");
		set.add("Y");
		set.add("Z");
		
		System.out.println(set);
		System.out.println(set1);
		System.out.println(set.size());
	}
}