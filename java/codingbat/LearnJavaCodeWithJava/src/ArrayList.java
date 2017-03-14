// import java.util.ArrayList;

/**
 *  ArrayList = a resizable array, created with an initial size,
 *  but when this size is exceeded, the collection is automatically enlarged.
 *  
 *  Objects removed, may shrink in size.
 */

//  ArrayList colors = new ArrayList();

// specify capacity and type of objects ArrayList will hold, use Integer for int, Double for double and so on.
// defines an ArrayList of Strings with 1- as its initial size.
//  ArrayList<String> colors = new ArrayList<String>(10);

// Declare an ArrayList to hold 9 Integers.
//  ArrayList<Integer> ar = new ArrayList <Integer>(9);

// ArrayList class methods:
// add()
// remove()
// contains()      Returns true if the list contains the specified element        
// get(int index)  Returns the element at the specified position in the list
// size()          Returns the number of elements in the list
// clear           Removes all of the elements from the list          

public class ArrayList
{
	public static void main(String[] args)
	{
		java.util.ArrayList<String> colors = new java.util.ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.remove("Green");
		
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(colors);
		System.out.println(list.get(1));
	}
}