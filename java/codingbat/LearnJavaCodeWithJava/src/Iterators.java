// Iterator
// object that enables to cycle through a collection, obtain or remove elements
// 
// before accessing a collection through an iterator, must object one
//
// each collection classes provides an iterator() method
// that return an iterator to start of the collection
// can access each element in the collection, one element at a time

/**
 * iterator class
 * hasNext():  returns true if there is at least one more element; otherwise false
 * next():     returns next object and advances the iterator
 * remove():   removes the last object returned by next from collection
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Iterators
{
	public static void main(String[] args)
	{
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Fox");
		animals.add("Mouse");
		animals.add("Hawk");
		animals.add("Rabbit");
		
		// it.next() returns the first element in the list and then moves the iterator on to the next element.
		// each time you call it.next(), the iterator moves to the next element of the list
		Iterator<String> it = animals.iterator();
		String value = it.next();
		System.out.println(value);
		System.out.println("");
		
		// iterators are used in loops
		// each iteration of the loop, you can access the corresponding list element
		// the while loop determines whether the iterator has additional elements
		// prints the value of the element 
		// and advances the iterator to the next
		/**
		 * iterate and print all of the items in the list of Integers 
		 *   Iterator<Integer> it = list.iterator();
		 *   while(it.hasNext())
		 *   {
		 * 	   System.out.println(it.next());
		 *   }
		 */
		Iterator<String> it2 = animals.iterator();
		while(it2.hasNext())
		{
			String value2 = it2.next();
			System.out.println(value2);
		}
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> it1 = list.iterator();
		int value1 = it1.next();
		System.out.println(value1);
		//System.out.println(it1.next());
		// should be 20
	}
}
