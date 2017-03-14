package ch15;

import java.util.Iterator;
import java.util.NoSuchElementException;

// DoubleIterator class implements Iterator interface, which is used to traverse each element of double node
public class DoubleIterator<T> implements Iterator
{
	private int count;
	
	// The number of elements in the collection
	private DoubleNode<T> current; // the current position
	/**
	 * Sets up this iterator using the specified items
	 * @param list the list that the iterator is to be created for
	 * @param size the integer value for the size of the list
	 */
	public DoubleIterator (DoubleNode<T> list, int size)
	{
		current = list;
		count = size;
	}
	
	/**
	 * Returns true if this iterator has at least one more element to deliver in the interation
	 * @return true if this iterator has at least one more element to deliver in the iteration
	 */
	public boolean hasNext()
	{
		return (current != null);
	}
	
	/**
	 * Returns the next element in the iteration
	 * if there are no more elements in this iteration, a NoSuchElementException is thrown
	 * @return the next element in the iteration
	 * @throws NosuchElementException if an element not found exception occurs
	 */
	public T next()
	{
		if (! hasNext())
			throw new NoSuchElementException();
		
		T result = current.getElement();
		current = current.getNext();
		return result;
	}
	
	/**
	 * The remove operation is not supported.
	 * @throws UnsupportedOperationException if an unsupported operation exception occurs
	 */
	public void remove() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException();
	}
}