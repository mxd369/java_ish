/*
Linked Implementation of a List

Program Plan:
-Create addFirst method so that adds the specified element at beginning of the list.
-Create addList method so that adds the specified element at the end of the list.
-Create add method so that adds the specified element at the specified position of the list.
-Create another add method so that adds the specified element at the end of the list.
-Create remove method so that removes and returns the first occurrence of the specified element from the list
and throws and EmptyCollectionException if the list is empty and throws a NoSuchElementException if the
specified element is not found in the list.
-Create removeFirst method so that removes and returns the first element from the list and throws an
EmptyCollectionException if the list is empty.
-Create removeLast method so that removes and returns the last element from the list
and throws an EmptyCollectionException if the list is empty.
-Create first method so that returns the first element in the list.
-Create last method so that returns the last element in this list.
-Create contains method so that returns true if the specified element is found
in the list and false otherwise and it throws an EmptyCollectionException if the list has no elements.
-Create isEmpty method so that returns true if this is empty and false otherwise.
-Create size method so that returns the number of elements in this list.
-Create iterator method so that returns an iterator for the elements currently in the list.
-Create toString method so that returns a string representation of the list.
-Create an object for LinkedList class of integers.
-Add elements at the beginning of the list by calling addFirst method and display the list.
-Add elements at the end of the list by calling addLast method and display the list.
-Add elements at the specified location of the list by calling add method and display the list.
-Call remove, removeLast, removeFirst, first, last, isEmpty, and size methods and then display the list
of elements after each operation.

*/

// 11PP
package ch15;
/*
LinkedListDemo class demonstrates the LinkedList class
that represents a linked implementation of a list of elements and its operations
*/
// LinkedListDemo class
public class LinkedListDemo
{
    // start main method
    public static void main(String[] args)
    {
// Create an object for LinkedList class of integers
        // create an object for LinkedList class
        LinkedList<Integer> list = new LinkedList<Integer>();

        
// Add elements at the beginning of the list by calling addFirst method and display the list.
        // add elements at the first of the list
        list.addFirst(25);
        list.addFirst(12);
        list.addFirst(46);
        list.addFirst(40);
        
        // display the elements in the list
        System.out.println("Elements in the list adding at beginning: " + list);

        // add elements at the end of the list
        list.addLast(60);
        list.addLast(55);
        list.addLast(30);
        list.addLast(29);
    
        // display the elements in the list
        System.out.println("Elements in the list after adding at the end: " + list);

// Add elements at the specified location of the list by calling add method and display the list
        // add the elements at the specified location in the list
        list.add(2, 41);
        list.add(5, 33);
        
        // display the elements in the list
        System.out.println("All the elements in the list after inserting two more elements: " + list.toString());

// Call remove, removeLast, removeFirst, first, last, isEmpty, and size methods and then display the list of elements after each operation
        //display the element that is removed from list
        list.remove(60);
        System.out.println("List after removing 60: " + list);
        
        // Removing last element and displaying list
        list.removeLast();
        System.out.println("List after removing last: " + list);
        
        // Removing first element and displaying list
        list.removeFirst();
        System.out.println("List after removing first: " + list);
        
        // calling first method to display first element
        System.out.println("List first element: " + list.first());
        
        // calling last method to display last element
        System.out.println("List first element: " + list.last());
        
        // calling isEmpty method and displaying its result
        System.out.println("List is empty?(T/F): " + list.isEmpty());
        
        // calling size method and displaying its result
        System.out.println("Number of elements in the list: " + list.size());
    } // end of main method
}     // end of LinkedListDemo class














