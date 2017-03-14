/**
 * A mutable set of characters.
 */
public class CharSet {
    
    private String s = "";
    
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    
    private void checkRep() {
        for (int i = 0; i < s.length(); ++i) {
            assert s.indexOf(s.charAt(i), i+1) == -1;
        }
    }
    
    /**
     * Make a new empty character set.
     */
    public CharSet() {
        checkRep();
    }
    
    /**
     * Get size of the set.
     * @return the number of characters in this set
     */
    public int size() {
        checkRep();
        return s.length();
    }
    
    /**
     * Test for membership.
     * @param c a character
     * @return true iff this set contains c
     */
    public boolean contains(char c) {
        checkRep();
        return s.indexOf(c) != -1;
    }
    
    /**
     * Modifies this set by adding c to the set.
     * @param c character to add
     */
    public void add(char c) {
        if ( ! contains(c)) {
            s += c;
        }
        checkRep();
    }
    
    /**
     * Modifies this set by removing c, if found.
     * If c is not found in the set, has no effect.
     * @param c character to remove
     */
    public void remove(char c) {
        int i = s.indexOf(c);
        if (i != -1) {
            s = s.substring(0, i) + s.substring(i+1, s.length());
        }
        checkRep();
    }
}