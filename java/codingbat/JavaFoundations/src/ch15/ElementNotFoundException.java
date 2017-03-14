package ch15;
// ElementNotFoundException class represents the situation in which a target element is not present in a collection
public class ElementNotFoundException extends RuntimeException
{
    public ElementNotFoundException (String collection)
    {
        super("The target element is not in this " + collection);
    }
} // end of ElementNotFoundException class
