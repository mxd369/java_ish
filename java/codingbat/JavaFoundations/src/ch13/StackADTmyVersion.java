package ch13;

// The Java Program
// implementation size, isEmpty, and toString methods for the LinkedStack<T> class

// Definition of the Stack interface to implement the stack data structure

//Implement the Stack interface
public interface StackADTmyVersion<T>
{
	// Adds one element to the top of this stack.
	public void push (T element);
	
	// Removes and returns the top element from this stack.
	public T pop();
	
	// Returns without removing the top element of this stack.
	public T peek();
	
	// Returns true if this stack contains no elements.
	public boolean isEmpty();
	
	// Returns the number of elements in this stack.
	public int size();
	
	// Returns a string representation of this stack.
	public String toString();
	
} // end interface