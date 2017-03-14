import java.util.*;
import java.util.regex.Pattern;

public class WordExtractor {
    
    // use this main method to test ExtractWords
    public static void main(String args[]) {
        //throw new RuntimeException("tests not yet implemented");
        String text = "Takes in a block of English text with standard punctuation, and returns a list of " +
                "all the \"words\" which appear in the text; \"words\" are contiguous blocks of letters " +
                "with no other symbols in them.";
        List<String> list = extractWords(text);
        for (String s: list){
            System.out.format("Word:<%s>%n", s);
        }
    }
    
    /**
     * Takes in a block of English text with standard punctuation, and returns a list of 
     * all the "words" which appear in the text.
     * "words" are contiguous blocks of letters with no other symbols in them.
     * 
     * @param text: String including 0 or more U.S. English dictionary words and standard punctuation.
     * @return words: List of words from the paragraph
     */
    public static List<String> extractWords(String text) {
        //throw new RuntimeException("ExtractWords not yet implemented");
        List<String> list = new ArrayList<String>();
        String REGEXP = "\\W"; // "[^a-zA-Z]";
        String [] strArray = text.split(REGEXP);
        // Another method: Pattern p = Pattern.compile(REGEXP); String [] strArray = p.split(text);
        for (String s: strArray){
            if (!s.isEmpty())
                list.add(s);
        }
        return list;
    }

}