/**
 * EmptyCollectionException represents the situation in which a collection 
 * is empty.
 *
 * @author Dr. Lewis
 * @author Dr. DePasqaule
 * @author Dr. Chase
 * @version 1.0, 08/12/08
 */

package javafoundations.exceptions;

public class EmptyCollectionException extends RuntimeException
{
   /**
    * Sets up this exception with an appropriate message.
    */
   public EmptyCollectionException (String collection)
   {
      super ("The " + collection + " is empty.");
   }
}
