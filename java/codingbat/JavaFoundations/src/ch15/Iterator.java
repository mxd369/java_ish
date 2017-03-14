
/*
 * Returns an iterator for the elements currently in this list
 * @return an iterator over the elements currently in the list
 */
package ch15;
public Iterator<T> iterator()
{
	return new DoubleIterator<T> (front, count);
}

/*
 * Returns a string representation of this list.
 * @return a string representation of this list.
 */
public String toString()
{
	String result = "";
	DoubleNode<T> traverse = front;
	
	while (traverse != null)
	{
		result = result + (traverse.getElement()).toString() + "\n";
		traverse = traverse.getNext();
	}
	return result;
	}
}
