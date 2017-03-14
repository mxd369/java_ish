import java.util.HashSet;
import java.util.Set;


public class Combinations {
    /**
     * Finds all subsets of a string.
     *
     * @return all subsets of the characters in s.  
     * The characters in a subset are in any order with no repeats. 
     * For example, combinations("cbc") might return 
     * { "", "b", "c", "cb" } or it might return { "", "b", "c", "bc" }.
     */
    public static Set<String> combinations(String s) {
        Set<String> subsets = new HashSet<String>();
        if (s.length() == 0) {
            // base case: the only subset of the empty string is the empty set
            subsets.add(""); 
        } else {
            // recursive step: peel off first character and combine it with 
            // the combinations of the rest of string
            char firstCharacter = s.charAt(0);
            Set<String> subsetsOfRestOfString = combinations(s.substring(1));
            for (String subset : subsetsOfRestOfString) {
                // each subset in the result can be formed by either 
                // omitting or including firstCharacter

                // subset without firstCharacter
                subsets.add(subset);

                // subset with firstCharacter (but only if it's not already in it)
                if (subset.indexOf(firstCharacter) == -1) { 
                    subsets.add(subset + firstCharacter);
                }
            }
        }
        return subsets;
    }
    
}