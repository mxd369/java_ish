package ch15;
// LinkedIterator class represents an iterator for a linked list of linear nodes
import java.util.*;
public class LinkedIterator<T> implements Iterator<T>
{
    // number of elements in the collection
    private int count;
    private LinearNode<T> current; // current position
    
    // LinkedIterator constructor sets up the iterator using the specified items
    public LinkedIterator(LinearNode<T> collection, int size)
    {
        current = collection;
        count = size;
    } // end of constructor
    
    // hasNext method returns true if the iterator has at least one more element to deliver in the iteration
    public boolean hasNext()
    {
        return (current != null);
    } // end of hasNext method
    
    /* next method returns the next element in the iteration and throws a NoSuchElementException if there
    are no more elements in the iteration
    */
    public T next()
    {
        // verify the next element in the collection
        if(!hasNext())
            throw new NoSuchElementException();
        
        T result = current.getElement();
        current = current.getNext();
        
        return result;
    } // end of next method
    /* remove operation is not supported and throws UnsupportedOperationException if an unsupported
     * operation exception occurs
     */
    public void remove() throws
    UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    } // end of remove method
} // end of LinkedIterator class