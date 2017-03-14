/**
 * Program modifies class Task so that implements a
 * Comparable interface and implemented the interface
 * such that tasks are ranked by priority
 */

/**
 * Class: Task
 * Methods: setPriority(), getPriority(), toString(), compareTo()
 * Input: task, priority
 * Output: displays numeric priority among objects
 */

//Program:
//Represents the interface Priority includes two methods
package ch9;
public interface Priority
{
    // abstract methods
    public void setPriority(int priority);
    public int getPriority();
}