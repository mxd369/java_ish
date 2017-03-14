import java.util.LinkedList;

public class LinkedListVSArrayList
{
	/**
	 * difference is in the storing of objects
	 * ArrayList is better for storing and accessing data, similar to a normal array
	 * LinkedList is better for manipulating data, such as making numerous inserts and deletes,
	 * stores the memory address (or Link) of the element that follows it,
	 * each element contains a link to the neighboring element
	 * 
	 * a program with large numbers of inserts and deletes, better to use a LinkedList
	 */
	public static void main(String[] args){
		// use an enhanced for loop to iterate over its elements
		LinkedList<String> c = new LinkedList<String>();
		c.add("Reds");
		c.add("Blue");
		c.add("Purp");
		c.add("Pink");
		c.add("Viol");
	
		for(String s: c) {
			System.out.println(s);
		}
	}
}