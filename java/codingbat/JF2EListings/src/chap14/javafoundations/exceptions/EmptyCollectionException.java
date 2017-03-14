/**
 * @author Lewis, DePasquale, and Chase
 *
 *  Represents the situation in which a collection is empty.
 */
package javafoundations.exceptions;

public class EmptyCollectionException extends RuntimeException
{
  /**
   * Sets up this exception with an appropriate message.
   * @param collection String representing the name of the collection
   */
  public EmptyCollectionException (String collection)
  {
    super ("The " + collection + " is empty.");
  }
}
