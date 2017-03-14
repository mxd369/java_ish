// Implementing stack using array list
// Stack.java
package ch15;
import java.util.ArrayList;
class Stack<T>
{
    private ArrayList<T> list;
    private int front;
    
    // Creates an empty stack.
    public Stack()
    {
        list = new ArrayList<T>();
        front = 0;
    }
    
    // Adds the specified element to the top of this stack and increment the front value by one
    public void push(T item)
    {
        list.add(item);
        front++;
    }
    
    // removes the element at the top of this stack and returns a reference to it.
    public T pop()
    {
        T item;
        if (list.isEmpty())
        {
            System.out.print("Empty!!");
            return null;
        }
        else
        {
            item=list.remove(front-1);
            front--;
        }
        return item;
    }
    
    // returns true if this stack is empty and false otherwise
    public boolean stackEmpty()
    {
        if(list.isEmpty())
            return true;
        else
            return false;
    }
    
    // returns size of the stack
    public int stackSize()
    {
        return list.size();
    }
    
    // the method display all the elements in the array list
    public void stackDisplay()
    {
        System.out.println("Stack elements");
        for(int i=0;i<front;i++)
            System.out.print("\n"+list.get(i));
    }

}