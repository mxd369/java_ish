// Doubly Linked List::

//           Node       Node       Node      Node
// value      Apple      Banana     Cherry    Date  
// next       c      ->  MemRef  -> MemRef -> null
// previous   c      <-  MemRef  <- MemRef <- MemRef

// value
// next

// ListNode
// getValue
// getNext

// setValue
// setNext

public class ListNode <E>
{
    private E value;
    private ListNode<E> next;
    
    public ListNode(E newVal, ListNode<E> newNext)
    {
        value = newVal;
        next = newNext;
    }
    
    public E getValue() { return value; }
    public ListNode<E> getNext() { return next; }
    
    public void setValue(E newValue) { value = newValue; }
    public void setNext(ListNode<E>newNext) { next = newNext; }
        


}