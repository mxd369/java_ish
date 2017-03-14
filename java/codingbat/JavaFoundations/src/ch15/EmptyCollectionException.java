package ch15;
// EmptyCollectionException represents that the collection has no elements
public class EmptyCollectionException extends RuntimeException
{
    public EmptyCollectionException(String str)
    {
        super("The " + str + " is empty.");
    }
} // end of EmptyCollectionException class