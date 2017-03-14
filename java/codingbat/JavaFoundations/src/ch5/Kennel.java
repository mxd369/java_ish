package ch5;
// 10632264-1.png

//******************************************************************
// Kennel.java
//
// Main Program
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

public class Kennel
{

	public static void main(String[] args)
	{
		// creating the dog object
		Dog dog1 = new Dog ("Lad",1);
		Dog dog2 = new Dog ("Rad",2);
		Dog dog3 = new Dog ("Bob",3);
		Dog dog4 = new Dog ("Mat",4);
		Dog dog5 = new Dog ("Pat",5);
		
		// updating and printing dog
		System.out.println("Dog 1: ");
		System.out.println(dog1);
		System.out.println("Dog 2: ");
		System.out.println(dog2);
		System.out.println("Dog 3: ");
		System.out.println(dog3);
		System.out.println("Dog 4: ");
		System.out.println(dog4);
		System.out.println("Dog 5: ");
		System.out.println(dog5);
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


/*
Output

Dog 1: 
Name              : Lad
Age (Dog years)   : 1
Age (Person years): 7

Dog 2: 
Name              : Rad
Age (Dog years)   : 2
Age (Person years): 14

Dog 3: 
Name              : Bob
Age (Dog years)   : 3
Age (Person years): 21


Dog 4: 
Name              : Mat
Age (Dog years)   : 4
Age (Person years): 28


Dog 5: 
Name              : Pat
Age (Dog years)   : 5
Age (Person years): 35

*/