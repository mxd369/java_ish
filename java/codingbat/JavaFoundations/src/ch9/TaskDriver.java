package ch9;
import java.util.*;
import java.util.ArrayList;

public class TaskDriver
{
    public static void main(String[] args)
    {
// Creating list of class Task and adding three task class objects
        List<Task> list = new ArrayList<Task>();
        // adding task objects to a list
        list.add(new Task("Running",3));
        list.add(new Task("Studying",1));
        list.add(new Task("Playing",2));
        
        // sorts the list
        Collections.sort(list);
        // instantiating the list iterator
        Iterator<Task> itr = list.iterator();
        
        // pick up element by element
        while(itr.hasNext())
        {
            Object element = itr.next();
            System.out.println(element + "\n");
        }
    }
}