package caesar;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author Mehdi
 *
 */
public class CaesarCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String message = "knowledge is power";
		int [] repeatingKey = {3, 1, 7, 4, 2, 5};
		Queue<Integer> encodeQ = new LinkedList<Integer>();
		Queue<Integer> decodeQ = new LinkedList<Integer>();
		String encodedMsg = encodeMessage(message, repeatingKey, encodeQ);
		System.out.println("Original Message: " + message);
		System.out.println("Encoded Message: " + encodedMsg);
		String decodedMsg = decodeMessage(encodedMsg, repeatingKey, decodeQ);
		System.out.println("Decoded Message: " + decodedMsg);
	}
	
	public static String encodeMessage(String message, int[] repeatingKey, Queue<Integer> encodeQ) {
		for (int i = 0; i < repeatingKey.length; i++) {
			encodeQ.add(repeatingKey[i]);
		}
		String encodedMsg = "";
		for (int i = 0; i < message.length(); i++) {
			int key = encodeQ.remove();
			encodedMsg += (char)(message.charAt(i) + key);
			encodeQ.add(key);
		} // end of for
		return encodedMsg;
	} // end of encodeMessage
	
	public static String decodeMessage(String message, int[] repeatingKey, Queue<Integer> decodeQ) {
		for (int i = 0; i < repeatingKey.length; i++) {
			decodeQ.add(repeatingKey[i]);
		}
		String decodedMsg = "";
		for (int i = 0; i < message.length(); i++) {
			int key = decodeQ.remove();
			decodedMsg += (char)(message.charAt(i) - key);
			decodeQ.add(key);
		} // end of for
		return decodedMsg;
	} // end of encodeMessage

}
