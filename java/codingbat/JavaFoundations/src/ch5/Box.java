package ch5;

/*
Design and implement a class called Box that contains instance data that represent
the height, width, and depth of the box.

Also include a boolean variable called full as instance data that represents whether the box
is full or not.

Define the Box constructor to accept and initialize the height,
width, and depth of the box. Each newly created Box is empty
(the constructor should initialize full to false).

Include getter and setter methods for all instance data. 
Include a toString method that returns a one-line description of the box.
Create a driver class called BoxTest, whose main method instantiates and updates
several Box objects.

*/

/*
10632265-1
Program Plan

Implement two classes "Box" and "BoxTest"
Class "Box" contains all the description of the box.
Class "BoxTest" updates the box.
*/

public class Box 
{
	//private String boxIdentity;
	private double height;
	private double width;
	private double depth;
	private boolean full;
	
	// Box constructor, initialize parameters
	public Box(double ht, double wt, double dp)
	{
		// variable declaration representing height width and depth
		//boxIdentity = identity;
		height = ht;
		width = wt;
		depth = dp;
		full = false;
	}
	

	// returns the box content
	// instance data that represents if the box is full or not
	public boolean getFull()
	{
		if(full)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	// update the content of box
	public void setFull(boolean f)
	{
		full = true;
	}

	
	// returns the height
	public double getHeight()
	{
		return height;
	}
	
	// returns the width
	public double getWidth()
	{
		return width;
	}
	
	// returns the depth
	public double getDepth()
	{
		return depth;
	}
	
	// updates the box dimensions
	public void setValues(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	// implement toString method
	// returns the output in ordered format
	public String toString()
	{
		String descrip = "";
		descrip += ("height is: " + getHeight() + "\n");
		descrip += ("width is: " + getWidth() + "\n");
		descrip += ("depth is: " + getDepth() + "\n");
		descrip += ("is full? " + getFull() + "\n");
		return descrip;
	}
	
}