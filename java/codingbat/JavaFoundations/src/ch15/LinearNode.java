package ch15;
// LinearNode class demonstrates a node
public class LinearNode<T>
{
    // variable declaration
    private LinearNode<T> next;
    private T element;
    
    // default constructor creates an empty node
    public LinearNode()
    {
        next = null;
        element = null;
    } // end of default constructor
    
    /* parameterized constructor creates a node to store the specified element */
    public LinearNode(T elem)
    {
        next = null;
        element = elem;
    } // end of constructor
    
    // getNext method returns the node that follows the node
    public LinearNode<T> getNext() {
        // TODO Auto-generated method stub
        return next;
    } // end of getNext method 
    
    /* getNext method returns the node that follows the node */
    public void setNext(LinearNode<T> node)
    {
        next = node;
    } // end of setNext method
    
    /* getElement method returns the element stored in the node */
    public T getElement()
    {
        return element;
    } // end of getElement method
    
    /* setElement method sets the specified element to the element stored in the node */
    public void setElement(T elem)
    {
        element = elem;
    } // end of setElement method

    
    
  
    
    
} // end of LinearNode class