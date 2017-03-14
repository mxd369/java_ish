// HashMap
// used for storing data collections as key and value pairs.
// one object is used as a key (index) to another object (the value)
// put()     adds values
// remove()  delete values
// get()     access values

/**
 * HashMap cannot contain duplicate keys
 * Adding a new item with a key that already exists overwrites the old element
 * HashMap class provides containsKey
 * HashMap class provides containsValue
 * determines the presence of a specified key or value
 * 
 * returns null when the value is not present in the map
 * 
 */
import java.util.HashMap;
public class HashMaps
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Amy", 154);
		points.put("Davie", 42);
		points.put("Rob", 999);
		
		
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("A", "First");
		m.put("B", "Second");		
		
		
		System.out.println(points.get("Dave"));
		System.out.println(points.get("Davie"));
		System.out.println(m.get("B"));
	}
}
