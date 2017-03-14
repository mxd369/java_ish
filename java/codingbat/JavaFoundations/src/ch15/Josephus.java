// form a circle, kill every third person until no one was left
// Josephus calculated where he needed to stand so he would be the last one to be alive
// Josephus are problems that involve finding the order of events
// when events in a list are not taken in order
// but rather are taken every ith element in a cycle until none remains



// the elements are thought of being in a continuous cycle, so when we reach the end
// we continue counting at the beginning
// suppose we have a list of seven elements numbered from 1 to 7:
// list:
// 1 2 3 4 5 6 7
// remove either third element from the list
// first to be removed is 3
// list:
// 1 2 4 5 6 7
// the next element to be removed would be 6
// list:
// 1 2 4 5 7
// the next element to be removed would be 2
// list:
// 1 4 5 7
// the next element to be removed would be 7
// list:
// 1 4 5
// the next element to be removed would be 5
// list:
// 1 4
// the next element to be removed would be 1
// list:
// 1



// Listing 15.4 illustrates a generic implementation of the Josephus problem
// allowing the user to input the number of items in the list
// and the gap between elements
// integers represent soldiers
// each element is then removed from the list one at a time computing the
// next position in the list to be removed.
// the one complication in this process is computation of the next index position
// to be removed.
// this is particularly interesting because the list collapses on itself
// as elements are removed.
// for example, the element number 6 from our previous example
// should be the second element in the list.
// however once element 3 has been removed from the list
// element 6 is no longer in its original position
// instead of being at index position 5 in the list,
// it is now at index position 4.



package ch15;
import java.util.*;

/**
 * Demonstrates the use of an indexed list to solve the Josephus problem
 */
public class Josephus
{
    /**
     * Continue around the circle eliminating every nth soldier
     * until all of the soldiers have been eliminated
     */
    public static void main(String[] args)
    {
        int numPeople, skip, targetIndex;
        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        
        // get the initial number of soldiers
        System.out.println("Enter the number of soldiers: ");
        numPeople = in.nextInt();
        in.nextLine();
        
        // get the number of soldiers to skip
        System.out.print("Enter the number of soldiers to skip: ");
        skip = in.nextInt();
        
        // load the initial list of soldiers
        for (int count = 1; count <= numPeople; count++)
        {
            list.add("Soldier " + count);
        }
        targetIndex = skip;
        System.out.println("The order is: ");
        
        // Treating the list as circular,
        // remove every nth element, until the list is empty
        while (!list.isEmpty())
        {
            System.out.println(list.remove(targetIndex));
            if (list.size() > 0)
                targetIndex = (targetIndex + skip) % list.size();
        }
        
    }
}




