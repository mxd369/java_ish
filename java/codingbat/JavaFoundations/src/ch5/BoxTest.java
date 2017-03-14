package ch5;

/*
Design and implement a class called Box that contains instance data that represent
the height, width, and depth of the box.
Also include a boolean variable called full as instance data that represents whether the box
is full or not. Define the Box constructor to accept and initialize the height,
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

public class BoxTest
{
	
	
	
	public static void main(String[] args)
	{
		Box box1 = new Box(1.1,1.2,1.1);
		System.out.println("Box 1: ");
		System.out.println(box1);
		
		Box box2 = new Box(1.2,1.3,1.4);
		System.out.println("Box 2: ");
		System.out.println(box2);
		box2.setFull(true);
		
		Box box3 = new Box(1.4,1.5,1.7);
		System.out.println("Box 3: ");
		System.out.println(box3);
		box3.setFull(true);
	}
	
}


/*


Box 1: 
height is: 1.1
width is: 1.2
depth is: 1.1
is full? false

Box 2: 
height is: 1.2
width is: 1.3
depth is: 1.4
is full? false

Box 3: 
height is: 1.4
width is: 1.5
depth is: 1.7
is full? false

*/
