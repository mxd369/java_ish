package ch15;
// ListADT interface defines a general list collection.
import java.util.Iterator;
public interface ListADT<T>
{
    // removeFirst method removes and returns the first element from the list.
    public T removeFirst();
    
    // removeLast method removes and returns the last element from the list.
    public T removeLast();
    
    // remove method removes and returns the specified element from the list.
    public T remove(T element);
    
    // first method returns a reference to the first element in the list.
    public T first();
    
    // last method returns a reference to the last element in the list.
    public T last();
    
    // contains method returns true if the list contains the specified target element.
    public boolean contains(T target);
    
    // isEmpty method returns true if the list contains no element and false otherwise.
    public boolean isEmpty();
    
    // size method returns the number of elements in this list.
    public int size();
    
    // iterator method returns an iterator for the elements in the list.
    public Iterator<T> iterator();
    
    // toString method returns a string representation of the list.
    public String toString();
    
}// end of ListADT interface
