// Linked Lists: Singly Linked Lists
// generics allows for any kind of data
package linkedLists;

public class ListNode <E/*Any Letter to represent an object of any type*/>
{
    // String values for the linked list
    private E/*String*/ value;
    
    // a reference, it is a list-node within a list node
    private ListNode<E>/*ListNode of the E type*/ next;
    
    // start constructor
    public ListNode(E/*String*/ newVal, ListNode<E>/*ListNode*/ newNext)
    {
        value = newVal;
        next = newNext;
    }
    // end constructor
    
    // start getters :  get the values in the list
    public E/*String*/ getValue() { return value; }
    public ListNode<E>/*ListNode*/ getNext() { return next; }
    // end getters
    
    
    // start setters: set the values in the list
      // set the value inside the list
    public void setValue(E/*String*/ newValue) { value = newValue; }
      
      // set the memory reference, and they can only be strings
    public void setNext(ListNode<E>/*ListNode*/ newNext) { next = newNext; }
    // end getters

}