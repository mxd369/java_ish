package ch5;
// 10632263-1.png
//******************************************************************
// Sphere.java
//
// Represents a coin with two sides that can be flipped.
//******************************************************************

// Program Code
/*******************************************************************
 * Implementing the Sphere class                                   *
 * Sphere constructor to initialize the diameter                   *
 * implement set and get methods                                   *
 * Calculate volume, surfaceArea of sphere                         *
 * Implement toString method to give description of sphere         *
 *******************************************************************/

import java.text.*;

public class Sphere
{
	
	//int diameter;
	//int SphereDiameter;
	//int sphereVolume;
	
	//DecimalFormat method used from NumberFormat library
	// to specified representation
	DecimalFormat df=new DecimalFormat("##.##");
	double diameter;
	
	
	//--------------------------------------------------------------
	// constructor
	// constructor to initialize diameter
	//--------------------------------------------------------------
	// constructor to initialize diameter
	//Sphere sphere = new Sphere();
	public Sphere (double num)
	{
		// what goes here
		diameter = num;
	}
	
	//--------------------------------------------------------------
	// setter
	// accessor function to set the diameter
	//--------------------------------------------------------------
	//setSphereDiameter();
	public void setDiameter(double dia)
	{
		// what goes here
		diameter = dia;
	}
	
	//--------------------------------------------------------------
	// getter
	// returns the diameter
	//--------------------------------------------------------------
	//getSphereDiameter();
	public double getDiameter()
	{
		return diameter;
	}
	

	// Calculate volume and area of the sphere
	
	
	
	//--------------------------------------------------------------
	// calculate Volume
	// (4/3) * pi * r^3
	//--------------------------------------------------------------
	//sphereVolume(){
	//	return volume = (4/3) pi r ^ 3;
	//}
	
	// calculating the volume
	public double volume()
	{
		// calculate radius
		double rad=diameter/2;
		double s=4/3;
		// volume = 4/3 * (pi) * (radius) ^ 3
		double vol = s * Math.PI * rad*rad*rad;
		return vol;
	}
	
	//--------------------------------------------------------------
	// calculate SurfaceArea
	// 4 * pi * r^2
	//--------------------------------------------------------------
	//sphereSurfaceArea(){
	//	return surface area = 4 pi r ^ 2;
	//}
	
	// calculating the surface area
	public double SurfaceArea()
	{
		//calculate radius
		double rad = diameter/2;
		double sa = 4 * Math.PI * rad*rad;
		return sa;
	}
	
	//--------------------------------------------------------------
	// toString
	// Use toString method to give description of the sphere.
	//--------------------------------------------------------------
	// formatting the output
	/**
	 * toString method
	 * @param none
	 * @return String Description
	 */
	
	// formatting the output
	public String toString()
	{
		// string description
		String desp = "";
		desp+="Diameter    :"+diameter + "\n";
		desp+="Volume      :"+ df.format(volume())+ "\n";
		desp+="SurfaceArea :"+ df.format(SurfaceArea())+"\n";
		return desp;
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