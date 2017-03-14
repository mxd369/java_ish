/* Java Map API 
// Make a new empty map
Map<String, String> map = new HashMap<String, String>();
map.get(key) -- retrieves the stored value for a key,
or null if that key is not present in the map.

map.put(key, value) -- stores a new key/value pair in the map.
Overwrites any existing value for that key.

map.containsKey(key) -- returns true if the key is in the map,
false otherwise.

map.remove(key) -- removes the key/value pair for this key if present.
Does nothing if the key is not present.
*/

/* Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "".
Basically "b" is a bully,
taking the value and replacing it with the empty string.

mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}
mapBully({"a": "candy"}) → {"b": "candy", "a": ""}
mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}
*/
package map1;
import java.util.Map;

public class mapBully {
	
	public static Map<String, String> mapBully(Map<String, String> map){
		if (map.containsKey("a")){
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
	
	public static void main(String[] args){
		System.out.println("Hello");
		//System.out.println(mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""});
		//System.out.println(mapBully({"a": "candy"}) → {"b": "candy", "a": ""});
		//System.out.println(mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""});
	}
	
}

/*

Expected	Run		
mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}	{"b": "candy", "a": ""}	OK	
mapBully({"a": "candy"}) → {"b": "candy", "a": ""}	{"b": "candy", "a": ""}	OK	
mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}	{"b": "candy", "c": "meh", "a": ""}	OK	
mapBully({"b": "carrot"}) → {"b": "carrot"}	{"b": "carrot"}	OK	
mapBully({"c": "meh"}) → {"c": "meh"}	{"c": "meh"}	OK	
mapBully({"c": "meh", "a": "sparkle"}) → {"b": "sparkle", "c": "meh", "a": ""}	{"b": "sparkle", "c": "meh", "a": ""}	OK

*/
