package ch5;
// 10632264-1.png
//******************************************************************
// Dog.java
//
// X
//******************************************************************

// Program Code

/*******************************************************************
 * Program Plan
 * Implement two classes "Dog" and "Kennel"
 * Class "Dog" contains constructor to initialize parameters of dog's name and age.
 * Create set and get methods to update the parameters of dog's name and age.
 * Implement getPerAge method to get person years of dog's age.
 * Implement toString method to given description of the dog.
 * Class "kennel" updates the Dog's description
 *******************************************************************/
public class Dog
{
	// initialize parameters of dog's name and age
	// String name = "";
	// int age = 0;
	private String dname; // dog name
	private int dage;     // dog age

	// constructor, initialize parameters
	public Dog(String str, int num)
	{
		dname = str;
		dage = num;
	}

	// updates the name of the dog
	public void setName(String n)
	{
		dname = n;
	}

	// updates the age of the dog
	public void setAge(int a)
	{
		dage = a;
	}

	// return the name of the dog
	public String getName()
	{
		return dname;
	}

	// Calculate person years of dog's age i.e. seven times of the dog's age
	// returns the dog age in person years
	public int getPerAge()
	{
		int personYears = 0;
		personYears = (dage * 7);
		return personYears;
	}

	// formatting the output
	// dog's description
	// use toString
	// gets description
	public String toString()
	{
		String desp = "";
		desp+="Name              : "+dname+"\n";
		desp+="Age (Dog years)   : "+dage +"\n";
		desp+="Age (Person years): "+getPerAge()+"\n";
		return desp;
	}

}

/*
Program Plan

Implement two classes "Dog" and "Kennel"
Class "Dog" contains constructor to initialize parameters of dog's name and age.
Create set and get methods to update the parameters of dog's name and age.
Implement getPerAge method to get person years of dog's age.
Implement toString method to given description of the dog.
Class "kennel" updates the Dog's description
*/