package edu.uga.cs1302.list;
//import linkedLists.ListNode;
//import linkedLists.MyListNode;

/**
 * SortedDblList
 * -an integer size representing the number of items in the list
 * -a reference of type Node for the head (first node) of the list which is initially set to null
 * -a reference of type Node for the tail (last node) of the list which is initially set to null
 * -a writeObject(...) method: should write the value of size and then each element (but not nodes!) of the list to the given stream.
 * -a readObject() method: should read the value of size and then each element of the list from the given stream and add them to the list.
 */        
    
// doubly linked list have the additional ability to point to the previous node
// head value: keeps track of front of the list
// tail value: keeps track of end of the list
// if you know end of list, can traverse the list
/*
public class SortedDblList<T extends Comparable<T>>
{
    // initialize instance variables
    private T value;                   // gets added to constructor
    private SortedDblList<T> next;     // gets added to constructor
    private SortedDblList<T> previous; // gets added to constructor
    // int size;
    // Node head = null;
    // Node tail = null;
    
    //1 writeObject() method
    //2 readObject() method

    // constructor
    public SortedDblList(T newVal, SortedDblList<T>newNext,SortedDblList<T>newPrev)
    {
        value = newVal;
        next = newNext;
        previous = newPrev;
    }

    // get method (aka getter)
    public T getValue() { return value; }
    public SortedDblList<T> getNext() { return next; }
    public SortedDblList<T> getPrevious() { return previous; }

    // set method (aka setter)
    public void setValue(T newValue) { value = newValue; }
    public void setNext(SortedDblList<T> newNext) { next = newNext; }
    // set method (change the previous node)
    public void setPrevious(SortedDblList<T> newPrev) { previous = newPrev;}

*/
    //3 public T get(int index);
    
    //4 public boolean add(T element);
    
    //5 public boolean remove(Object o);
    
    //6 public boolean isEmpty();
    /**
     *The isEmpty method returns whether or not the list is empty (true or false)
     */
/*
    public boolean isEmpty()
    {
        return head == null;
    }
*/    
    //7 public SortedDblList<T> union(SortedDblList<? extends T> otherList);
    //8 public SortedDblList<T> intersection(SortedDblList<? extends T> otherList);
    //9 public void printList();
    //10 public int indexOf(Object o);
//} 
// end of SortedDblList.java



/* load method
public SortedDblList<T> load(String filename) throws IOException, ClassNotFoundException
{
   SortedDblList<T> loadedList = new SortedDblList<T>();
   FileInputStream fileIn = new FileInputStream(filename);
   ObjectInputStream in = new ObjectInputStream (fileIn);
   int iterations = in.readInt();
   for (int i = 0; i < iterations; i++)
   {
       Object temp = in.readObject();
       @SuppressWarnings("unchecked")
       T tempT = (T) temp;
       loadedList.add(tempT);
   }

   in.close();
   fileIn.close();
   return loadedList;

}// end of load
*/
