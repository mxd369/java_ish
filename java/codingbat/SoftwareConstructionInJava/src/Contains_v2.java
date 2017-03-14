

public class Contains_v2 {

    /**
     * @param string
     * @param substring
     * @return true if and only if s contains t as a substring, e.g.
     *         contains("hello world", "world") == true.
     */
    public static boolean contains(String string, String substring) {
        for (int i = 0; i < string.length(); ++i) {
            boolean matched = true;
            for (int j = 0; j < substring.length(); ++j, ++i) {
                if (string.charAt(i) != substring.charAt(j)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return true;
            }
        }
        return false;
    }
    
}