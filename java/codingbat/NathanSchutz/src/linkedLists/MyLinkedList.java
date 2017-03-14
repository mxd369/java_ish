package linkedLists;
//***********************************************************************MyLinkedList
public class MyLinkedList<E>
{
  private ListNode<E> head;
  private ListNode<E> current;
  private ListNode<E> previous;
  
  //Method implementation of InsertFirst
  //***********************************************************************Insert First
  //Insert Node (First)::
   MyListNode <String> list = new MyListNode<String>();
   list.insertFirst("Cherry"); // becomes first, will it get moved down list after the next insert
   list.insertFirst("Banana"); // becomes first
   list.insertFirst("Apple");  // becomes first
   /*
   ---------
   head 0x31
   Apple
   MemRef
   ---------
   Node 0x31
   Apple
   MemRef

   Node 0x27
   Banana
   null

   Node 0x13
   Cherry
   null
   ---------
   */
  //********************** insert a value at the beginning 'start'
  /**
   * Method to insert first
   */
  public void insertFirst(E value)
  {
      ListNode<E> newNode = new ListNode<E>(value,null);
      if(head==null)
      {
          head = newNode;
      }
      else
      {
          newNode.setNext(head);
          head = newNode;
      }
  }
  //********************** insert a value at the beginning 'end'
  //***********************************************************************Insert First
  //***********************************************************************Insert Last
  // Insert Node (Last)::
  MyListNode <String> list = new MyListNode<String>();
  list.insertFirst("Cherry"); //
  list.insertFirst("Banana"); //
  list.insertFirst("Apple");  //
  /*
  null
  previous
  ---------
  Node
  Apple
  null
  *head & current*
  ---------
  Node
  Apple
  MemRef

  Node
  Banana
  MemRef
  
  Node
  Cherry
  MemRef
  
  Node
  Date
  null
  ---------
  */
  //********************** insert a value at the end 'start'
  /**
   * Method to insert last
   */
  public void insertLast(E value)
  {
      ListNode<E>newNode = new ListNode<E>(value,null);
      if(head==null)
          head = newNode;
      else
      {
          current = head;
          while(current!=null)
          {
              previous = current;
              current = current.getNext();
          }
          previous.setNext(newNode);
      }
  }
//********************** insert a value at the end 'end'
//***********************************************************************Insert Last
//***********************************************************************Delete Node (First)
  // Delete Node (First)::
  MyLinkedList <String> list = new MyLinkedList<String>();
  list.deleteFirst();
  // code to add Nodes
  list.deleteFirst();
  
  /**
   * Method to delete First
   */
  public void deleteFirst()
  {
      if(head != null)
          head = head.getNext();
  }
  
  
  // Delete Nodes (First):: another way
  // write a method that not only removes the node but sends it back
  // has a return
  MyLinkedList <String> list = new MyLinkedList<String>();
  // code to add Nodes
  public ListNode<E> deleteFirst()
  {
      ListNode<E> remove = head;
      if(head != null)
          head = head.getNext();
      return remove;
  }

//***********************************************************************Delete Node (First)
//***********************************************************************Delete Node (Last) void
  // Delete Node (Last)::
  // create a linkedList
  MyLinkedList <String> list = new MyLinkedList<String>();
  list.deleteLast();
  // code to add Nodes
  list.deleteLast();
  list.deleteLast();
  /*
    Initially
    null
    head & current & previous
   */
  
  /**
   * Method to delete Last
   */
  public void deleteLast()
  {
      if(head != null)
      {
          current = head;
          while(current.getNext() != null)
          {
              previous = current;
              current = current.getNext();
          }
          previous.setNext(null);
      }
  }
//***********************************************************************Delete Node (Last) void
//***********************************************************************Delete Node (Last) return
  // Delete Node (Last)::
  MyLinkedList <String> list = new MyLinkedList<String>();
  list.deleteLast();
  public ListNode<E> deleteLast()
  {
      if(head != null)
      {
          current = head;
          while(current.getNext() != null)
          {
              previous = current;
              current = current.getNext();
          }
          previous.setNext(null);
          return current;
      }
      return null;
  }
//***********************************************************************Delete Node (Last) return
} // end of MyLinkedList Class
//***********************************************************************MyLinkedList