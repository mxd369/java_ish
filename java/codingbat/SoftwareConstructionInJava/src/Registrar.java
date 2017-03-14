import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registrar {
    private static final Map<String, List<String>> registration = new HashMap<>();
    
    /**
     * Update subject registration according to preregistration.
     */
    public static void loadPreregistration() {
        // unimplemented
        registration.putIfAbsent("alyssa", new ArrayList<>(Arrays.asList("6.005", "7.33", "21W.759")));
        // unimplemented
        registration.putIfAbsent("benbit", Arrays.asList("6.005", "7.33", "21W.759"));
        // unimplemented
    }
    
    /** 
     * @return current subject registration for all MIT students
     */
    public static Map<String, List<String>> getRegistration() {
        return registration;
    }
    
    /**
     * Register a student in a subject,
     *                                  if their credit limit allows,
     *                                  if space is available,
     *                                  if [TODO etc. etc.]
     * @param username student to register
     * @param subject class to register for
     * @return true if and only if the student is now registered for the subject
     */
    public static boolean registerForClass(String username, String subject) {
        return false; // unimplemented
    }
}