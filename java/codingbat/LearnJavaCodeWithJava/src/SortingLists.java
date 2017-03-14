// Sorting Lists
// sort()
// sorts the elements of your collection type
// methods in Collections class are static,
// so you don't need a Collections object to call


/**
 * useful method on Collections class:
 * max(Collection c):  returns maximum element in c as determined by natural ordering 
 * min(Collection c):  returns minimum element in c as determined by natural ordering
 * reverse(List list): reverses the sequences in list
 * shuffle(List list): Shuffles (i.e. randomizes) the elements in list
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists
{
	public static void main(String[] arg)
	{
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("horse");
		animals.add("cat");
		animals.add("whale");
		animals.add("dog");
		Collections.sort(animals);
		System.out.println(animals);

	
		
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("c");
		Collections.sort(list);
		System.out.println(list.get(0));
		
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(36);
		nums.add(73);
		nums.add(43);
		nums.add(13);
		Collections.sort(nums);
		System.out.println(nums);
		
		
		// add three items to the list
		// sort it
		// print 2
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(2);
		list1.add(1);
		Collections.sort(list1);
		System.out.println(list1.get(1));
		
	}
}