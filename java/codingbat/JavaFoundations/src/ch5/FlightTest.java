/*
===================PP 5.8

Design and implement a class called 'Flight' that represents an airline flight.
It should contain instance data that represent the airline name, the 
flight number, and the flight's origin and destination cities.

Define
the Flight constructor to accept and initialize all instance data. 
Include getter and setter methods for all instance data. Include a toString
method that returns a one-line description of the flight.
Create a driver class called FlightTest, whose main method
instantiates and updates several Flight objects. 
===================
*/

/*
11507847-1

class:
  FlightTest: main method instantiates and updates several FLight objects
  Flight: // represents an airline flight
  
  instance data: // data defined at the class level and created in memory for every object
    airline name,
    flight number
    flights origin
    destination cities.
    
    constructor: // special method that has the same name as the class,
    // invoked when an object is instantiated, used to initialize the object
    
    define the class constructor to accept and initialize all instance data
    
    getter and setter methods for all instance data
    
    include a toString method that returns a one-line description of the flight
*/

/*
Program Plan 11507847-1
Create a flight class that includes airline name, flight number, and destination cities
Define a constructor that accepts all instance data.
Using setters and getters for the class to update the data
Create a driver class for updating the Flight objects
*/
package ch5;
public class FlightTest
{
	public static void main(String[] args)
	{
		// create Flight objects
		Flight flight1 = new Flight("Southwestern","Atlanta","Portland",134);
		Flight flight2 = new Flight("Delta","New York","Texas",278);
		Flight flight3 = new Flight("VN","Korea","Vietnam",367);
		Flight flight4 = new Flight("Korea Airlines","Korea","Los Angeles",6462);
		Flight flight5 = new Flight("Emirates","Dubai","Hyderbad",455);
	
		// update and print Flights
		System.out.println("Flight 1:");
		System.out.println(flight1);
		System.out.println("Flight 2:");
		System.out.println(flight2);
		System.out.println("Flight 3:");
		System.out.println(flight3);
		System.out.println("Flight 4:");
		System.out.println(flight4);
		System.out.println("Flight 5:");
		System.out.println(flight5);
	}
}