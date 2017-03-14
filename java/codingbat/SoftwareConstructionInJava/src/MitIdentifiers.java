import java.util.Random;

import MitIdentifiers.NoSuchUserException;

public class MitIdentifiers {

    /**
     * @param username username of person to look up
     * @return the 9-digit MIT identifier for username.
     * @throws NoSuchUserException if nobody with username is in MIT's database
     */
    public static char[] getMitId(String username) throws NoSuchUserException {        
        // look up username in MIT's database and return the 9-digit ID.
        // for now, let's just randomly generate it.
        Random random = new Random();
        char[] id = new char[9];
        for (int i = 0; i < 9; ++i) {
            id[i] = (char) ('0' + random.nextInt(10));           
        }
        return id;
    }
    
    public static class NoSuchUserException extends Exception {        
    }
    
    public static void main(String[] args) {
        for (String username : args) {
            try {
                char[] id = getMitId(username);
                System.out.println(id);
            } catch (NoSuchUserException e) {
                System.err.println("? unknown user " + username);
            }//end of try catch
        }
    }
    
    /**
     * Replaces the first five digits of an MIT identifier with asterisks,
     * for privacy.
     * @param id a 9-digit MIT identifier.  Requires id.length == 9.
     */
    public static void obscureId(char[] id) {
        for (int i = 0; i < 5; ++i) {
            id[i] = '*';
        }
    }

}