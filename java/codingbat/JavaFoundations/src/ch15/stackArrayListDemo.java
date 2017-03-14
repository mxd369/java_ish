/*
Define Stack class which used predefined ArrayList class to implement.
Define the necessary methods for class stack
stackArrayListDemo class creates instance of class Stack and then test the methods.
*/

/**************************************************
 * This java program demonstrates the class Stack * 
 * Implemented using an array list.               *
 **************************************************/
package ch15;
// StackArrayListDemo.java
public class stackArrayListDemo
{
    // start main method
    public static void main(String[] args)
    {
        // create an object for stack class
        Stack <Integer> lst1 = new Stack <Integer>();

        // Adding elements into the stack by call push method with value passed as input to the function
         
         lst1.push(25);
         lst1.push(52);
         lst1.push(14);
         lst1.push(41);
         lst1.push(89);
         lst1.push(98);
         lst1.push(100);
         
        // Display element in the stack, 1st1.
        lst1.stackDisplay();

        // Remove element from stack object, 1st1.
        Integer i = lst1.pop();
        System.out.println("\nRemoved : "+i);
        
        // display the elements in the stack
        lst1.stackDisplay();
    }// end of main method
} // end of stackDemo class