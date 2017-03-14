/*
https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=java%20map%20putifabsent
https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#putIfAbsent-K-V-


"If the specified key is not already associated
with a value (or is mapped to null) associates it with
the given value and returns null,
else returns the current value."

*/
package reading1staticChecking;

import java.util.HashMap;
import java.util.Map;

public class ReadingJavaDocs {
		
	public static void main(String[] args){
		Map<String, Integer> treasures = new HashMap<>();
		treasures.put("beach", 25);
		Integer result = treasures.putIfAbsent("beach", 75);

		System.out.println(result);
	}
	
}