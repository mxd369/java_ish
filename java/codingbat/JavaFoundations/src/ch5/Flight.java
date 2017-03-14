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
class Flight
{
	private String airlineName;
	private String flightOrigin;
	private String destinationCities;
	private int flightNumber;
	
	
	// constructor accepts and initializes the data of the flight
	public Flight(String aName, String fOrigin, String dCities, int fNum)
	{
		airlineName = aName;
		flightOrigin = fOrigin;
		destinationCities = dCities;
		flightNumber = fNum;
	}
	
	// ***************************
	// returns the flight name
	public String getName()
	{
		return airlineName;
	}
	
	// updates the flight name
	public void setName(String aName)
	{
		airlineName = aName;
	}
	
	
	// ***************************
	// returns the flight origin
	public String getOrigin()
	{
		return flightOrigin;
	}
	
	// updates the flight origin
	public void setFlightOrigin(String fOrigin)
	{
		flightOrigin = fOrigin;
	}
	
	
	// ***************************
	// returns the flight destination Cities
	public String getDesinatationCities()
	{
		return destinationCities;
	}
	
	// updates the flight destination Cities
	public void setFlightDestination(String dCities)
	{
		destinationCities = dCities;
	}
	
	// ***************************
	// returns the flight number
	public int getFlightNum()
	{
		return flightNumber;
	}
	
	// updates the flight number
	public void setFlightNum(int fNum)
	{
		flightNumber = fNum;
	}
	
	// ***************************
	// formats the output
	public String toString()
	{
		String result = "";
		result += "AirLine Name: " + airlineName + '\n' + "Flight Origin: " + flightOrigin + '\n' + "Destination Cities: " + destinationCities + '\n' + "Flight Number: "+ flightNumber + '\n';
		return result;
	}
	
	
	

}