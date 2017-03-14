package ch5;
// 10632263-1.png
//******************************************************************
// MultiSphere.java
//
// Main Class
//******************************************************************
public class MultiSphere
{

	//--------------------------------------------------------------
	// Main Method updates several Sphere objects
	//--------------------------------------------------------------
	public static void main(String[] args)
	{
		// creating the sphere objects
		Sphere sphere1 = new Sphere (12);
		Sphere sphere2 = new Sphere (14);
		Sphere sphere3 = new Sphere (16);
		Sphere sphere4 = new Sphere (18);
		Sphere sphere5 = new Sphere (20);
		
		// updating and printing the sphere
		System.out.println("Sphere 1 :");
		System.out.println(sphere1);
		System.out.println("Sphere 2 :");
		System.out.println(sphere2);
		System.out.println("Sphere 3 :");
		System.out.println(sphere3);
		System.out.println("Sphere 4 :");
		System.out.println(sphere4);
		System.out.println("Sphere 5 :");
		System.out.println(sphere5);
	}
	
}


/*

PP 5.4
Design and implement a class called Sphere that contains instance data that represents
the sphere's diameter.

Define the Sphere constructor to accept and initialize the diameter,
and include getter and setter methods for the diameter.

Include methods that calculate
and return the volume and surface area of the sphere
(see Programming Project 3.5 for the formulas).
Include a toString method that returns a one-line description of the sphere.

Create a driver class called MultiSphere,
whose main method instantiates and updates several Sphere objects.

Program Plan
  - Implement two classes "Sphere" and "MultiSphere"
  - Class "Sphere" contains constructor to initialize parameter,
    setDiameter and getDiameter methods.
  - Implement methods to calculate volume and area of the sphere.
  - Class "MultiSphere" updates of the Sphere with parameters.

volume = (4/3) pi r ^ 3
surface area = 4 pi r ^ 2


*/