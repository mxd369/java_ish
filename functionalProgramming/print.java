/**
 * println() definition
 */
public void println(String x) {
    // check that the String exists
    if (x== null) {
        x = "null";
    } 
    try {
        ensure();
        // write String to screen
        textOut,write(x);
    } catch(IOException e) {
        trouble = true;
    }
    newLine();
} // execute function call
