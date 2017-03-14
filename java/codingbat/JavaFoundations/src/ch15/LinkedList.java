package ch15;
// LinkedList class represents a linked implementation of a list
import java.util.*;

public class LinkedList<T> implements ListADT<T>, Iterable<T>
{
    // variable declaration
    protected int count;
    protected LinearNode<T> head, tail;
    
    // default constructor creates an empty list
    public LinkedList()
    {
        count = 0;
        head = tail = null;
    } // end of default constructor

// Create addFirst method so that adds the specified element at beginning of the list
    // addFirst method adds the specified element at beginning of the list
    public void addFirst(T element)
    {
        // create a temporary node with the specified element
        LinearNode<T> temp = new LinearNode<T>(element);
        
        // verify whether the size of the list is zero
        if(size() == 0)
            head = tail = temp;
        else
        {
            // insert the node at beginning of the list
            temp.setNext(head);
            
            // change the head position
            head = temp;
        }
        
        // increment the number of elements in the list
        count ++;
    }// end of addFirst method
    
/* Create addLast method so that adds the specified element at the end of the list.*/
    
    /* addLast method adds the specified element at the end of the list */
    public void addLast(T element)
    {
        /* Create a temporary node with the specified element */
        LinearNode<T> temp = new LinearNode<T>(element);
        
        // verify whether the size of the list is zero
        if(size()==0)
            head = tail = temp;
        else
        {
            // insert the node at the end of the list
            tail.setNext(temp);
            
            // change the tail position
            tail = tail.getNext();
        }
        
        // increment the number of elements in the list
        count++;
    }// end of addLast method

/* Create add method so that adds the specified element at the specified position of the list.*/
    
    /* This add method adds the specified element at the specified position of the list */
    public void add(int index, T element) throws IndexOutOfBoundsException
    {
        // verify whether the specified index is valid
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        
        // verify whether the specified index is zero
        if(index == 0)
            addFirst(element);
        /* verify whether the specified index is size of the list */
        else if (index == size())
            addLast(element);
        else
        {
            /* create a temporary node with the specified element */
            LinearNode<T> temp = new LinearNode<T> (element);
            LinearNode<T> current = head;
            LinearNode<T> afterCurrent = head.getNext();
            
            // determine the node at the specified index
            for(int i = 0; i < index - 1; i++)
            {
                current = current.getNext();
                afterCurrent = afterCurrent.getNext();
            }
            
            // insert the specified element at the specified index
            current.setNext(temp);
            temp.setNext(afterCurrent);

            // increment the number of elements in the list
            count++;
        }
    } // end of add method

// Create another add method so that adds the specified element at the end of the list.
    // add method adds the specified element at the end of the list
    public void add(T element)
    {
        addLast(element);
    } // end of add method
    
/*
Create remove method so that removes and returns the first occurrence of the specified
element from the list and throws an EmptyCollectionException if the list is empty and
throws a NoSuchElementException if the specified element is not found in the list
*/
    /* remove method removes and returns the first occurrence
     * of the specified element from the list
     * and throws an EmptyColelctionException if the list is
     * empty and throws a NoSuchElementException if the specified
     * element is not found in the list
     */
    public T remove(T targetElement) throws EmptyCollectionException, ElementNotFoundException
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        // local variables
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;
        /* repeat the loop until end of the list or element is found */
        while (current != null && !found)
        {
            // verify whether the specified element is found
            if(targetElement.equals(current.getElement()))
                found = true;
            else
            {
                // go for the next nodes in the list
                previous = current;
                current = current.getNext();
            }
        } // end while
        
        // throw the exception if element is not found
        if(!found)
            throw new ElementNotFoundException("List");
        
        // verify whether the size of the list is one
        if(size() == 1)
            head = tail = null;
        /* verify whether the specified element found at head */
        else if(current.equals(head))
            head = current.getNext();
        /* verify whether the specified element found at tail */
        else if(current.equals(tail))
        {
            tail = previous;
            tail.setNext(null);
        }
        else
            previous.setNext(current.getNext());
        
        // decrement the number of elements in the list
        count--;
        return current.getElement();
    } // end of remove method
    
/* Create removeFirst method so that removes and returns the first element from the list
and throws and EmptyCollectionException if the list is empty */
    
    /* removeFirst method removes and returns the first element from the list
     * and throws an EmptyCollectionException if the list is empty*/
    public T removeFirst() throws EmptyCollectionException
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        
        // get the value at the head
        T value = head.getElement();
        
        // change the head position
        head = head.getNext();
        
        // verify whether the new head is null
        if(head == null)
            tail = null;
        
        // decrement the number of elements in the list
        count--;
        
        // return the reference of the head
        return value;
    } // end of removeFirst method
/*
Create removeLast method so that removes and returns the last element from the list and throws
an EmptyCollectionException if the list is empty.
*/
    /*
     * removeLast method removes and returns the last element from the list and throws an
     * EmptyCollectionException if the list is empty
     */
    public T removeLast() throws EmptyCollectionException
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        
        // local variables
        LinearNode<T> current = head;
        LinearNode<T> beforeCurrent = null;
        
        // repeat the loop until end of the list
        while(current != tail)
        {
            // go for the next nodes in the list
            beforeCurrent = current;
            current = current.getNext();
        } // end while
        
        // get the value at the tail
        T value = tail.getElement();
        
        // change the tail position
        tail = beforeCurrent;
        
        // verify whether the new tail is null
        if(tail == null)
            head = null;
        else
            tail.setNext(null);
        
        // decrement the number of elements in the list
        count--;
        
        // return the reference of the tail
        return value;
        
    } // end of removeLast method

// Create first method so that returns the first element in the list.
    
    // first method returns the first element in the list
    public T first()
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        return head.getElement();
    }// end of first method

// Create last method so that returns the last element in this list
    // last method returns the last element in this list
    public T last()
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        
        return tail.getElement();
    } // end of last method

/*
Create contains method so that returns true if the specified element is found
in the list and false otherwise and it throws an EmptyCollectionException
if the list has no elements
*/
    /*
     contains method returns true if the specified element is found in the list
     and false otherwise and it throws an EmptyCollectionException if the list
     has no elements
     */ 
    public boolean contains(T targetElement) throws EmptyCollectionException
    {
        // verify whether the list is empty or not
        if(isEmpty())
            throw new EmptyCollectionException("List");
        
        // local variables
        LinearNode<T> current = head;
        
        // repeat the loop until end of the list
        while(current != tail.getNext())
        {
            // verify whether the specified element is found
            if(targetElement.equals(current.getElement()))
                return true; // if found
            
            current = current.getNext();
        } // end while
        
        // return the result
        return false; // if not found
    } // end of contains method

// Create isEmpty method so that returns true if this list is empty and false otherwise
    
    // isEmpty method returns true if this list is empty and false otherwise
    public boolean isEmpty()
    {
        return (count == 0);
    }// end of isEmpty method
    
// Create size method so that returns the number of elements in this list
    
    // size method returns the number of elements in this list
    public int size()
    {
        return count;
    } // end of size method
    
// Create iterator method so that returns an iterator for the elements currently in the list
    /* iterator method returns an iterator for the elements currently in the list */
    public Iterator<T> iterator()
    {
        // create object for LinkedIterator class
        return new LinkedIterator<T>(head, count);
    } // end of iterator method

// Create toString method so that returns a string representation of the list
    /* toString method returns a string representation of the list */
    public String toString()
    {
        // local variables
        String elements = "";
        LinearNode<T> current = head;
        
        // repeat the loop for all elements in the list
        while(current != null)
        {
            elements = elements + current.getElement() + " ";
            current = current.getNext();
        } // end while
        
        // return all elements as a string
        return elements;
    } // end of toString method
} // end of LinkedList class