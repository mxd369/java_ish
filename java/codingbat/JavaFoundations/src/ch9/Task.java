package ch9;
public class Task implements Priority, Comparable<Task>
{
    // variable declaration
    private String task;
    private int myPriority;
    
// Constructor will task with the parameter values
    public Task (String work, int i)
    {
        /* sets task to parameter values */
        task = work;
        myPriority = i;
    }
    
// This method sets the numeric priority
    public void setPriority (int priority)
    {
        myPriority = priority;
    }
// This method returns Priority
    public int getPriority()
    {
        return myPriority;
    }
    
// Displays Task object information
    public String toString()
    {
        return ("Task: " + task +"\nPriority: " + myPriority);
    }
    
// This method compares the task object returns the integer
    public int compareTo(Task obj1)
    {
        if(this.myPriority > ((Task)obj1).myPriority)
            return 1;
        else if( this.myPriority == ((Task)obj1).myPriority)
            return 0;
        else
            return -1;
    }

}