package aSortedDoublyLinkedListUsingGenerics;
public class TestDLL
{
	public static void main(String[] args) {

		// Integer test
		SortedDoubleLinkedList<Integer> sdll = new SortedDoubleLinkedList<>();
		sdll.add(234);
		sdll.add(3455);
		sdll.add(123);
		sdll.add(5000);
		sdll.add(234);
		sdll.add(0);

		System.out.println("List in  order:");
		System.out.println(sdll);

		// test reverse order toString function
		System.out.println("List in descending order:");
		System.out.println(sdll.toStringDescending());

		// test contains()
		System.out.println("List contains item value of '3455' = " + sdll.contains(3455));

		// test remove()
		System.out.println("Removing an item");
		sdll.remove(3455);

		System.out.println("List contains item value of '3455' = " + sdll.contains(3455));
		System.out.println("List in order:");
		System.out.println(sdll);

		// test getfirst() & getLast()
		System.out.println("First:" + sdll.getFirst());
		System.out.println("Last:" + sdll.getLast());

		// test Strings
		SortedDoubleLinkedList<String> list2 = new SortedDoubleLinkedList<>();
		list2.add("Fish");
		list2.add("Meat");
		list2.add("Argue");
		System.out.println("List of strings");
		System.out.println(list2);
		System.out.println("List contains 'Fish' = " + list2.contains("Fish"));
		System.out.println();

		// test Doubles
		SortedDoubleLinkedList<Double> dub = new SortedDoubleLinkedList<>();
		dub.add(120.003);
		dub.add(3.1415967);
		dub.add(27.3);
		System.out.println("List of doubles:");

		// test recursive display function
		System.out.println(dub.toStringRecursive());
		System.out.println();

		// test object
		SortedDoubleLinkedList<Inventory> objects = new SortedDoubleLinkedList<>();
		objects.add(new Inventory("Quixotic Journey", 10, 20.00f));
		objects.add(new Inventory("Purple Suit", 5, 199.99f));
		objects.add(new Inventory("Alphabet Soup", 100, 0.99f));
		objects.add(new Inventory("Maple Syrup",20, 5.99f));

		System.out.println("Object list:");
		System.out.println(objects);
		System.out.println(objects.toStringDescending());
		System.out.println("Object at index 0 = \n" + objects.get(0));
		System.out.println("Remove object at index 1");
		objects.remove(objects.get(1));
		System.out.println(objects);
	}
	
}