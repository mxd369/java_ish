// StringLiteral: https://www.youtube.com/watch?v=IuiyhgFN-vg
// http://java.about.com/od/understandingdatatypes/a/The-String-Literal.htm

public class StringValue {

    /**
     * @param n integer to convert to string
     * @param base base for the representation. Requires 2<=base<=10.
     * @return n represented as a string of digits in the specified base, with 
     *           a minus sign if n<0.
     */
    public static String stringValue(int n, int base) {
        if (n < 0) {
            return "- " + stringValue(-n, base);
        } else if (n < base) {
            return "" + n;
        } else {
            return stringValue(n/base, base) + (n%base);
        }
    }
}