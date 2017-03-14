// Linkedlist: a data structure consisting of a group of nodes which together represent a sequence.
// Each node is composed of data and a link to the next node in the sequence.
// can change ArrayList to LinkedList by changing object type
import java.util.LinkedList;

public class LinkedLists
{
	public static void main(String[] args)
	{
		LinkedList<String> c = new LinkedList<String>();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Orange");
		c.remove("Green");
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Bye");
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Java");
		list2.add("Mathematics");
		
		
		System.out.println(c);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list2.get(0));
	}
}