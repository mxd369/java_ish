

public class Subsequences {

    /**
     * @param word consisting only of letters A-Z or a-z
     * @return all subsequences of word,
     * where a subsequence is a string of letters found in word 
     * in the same order that they appear in word.
     * Subsequences are separated by commas.
     */  
    public static String subsequences(String word) {
        if (word.isEmpty()) {
            return ""; // base case
        } else {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);
            
            String subsequencesOfRest = subsequences(restOfWord);
            
            String result = "";
            for (String subsequence : subsequencesOfRest.split(",", -1)) {
                result += "," + subsequence;
                result += "," + firstLetter + subsequence;
            }
            result = result.substring(1); // remove leading comma
            return result;
        }
    }    
}