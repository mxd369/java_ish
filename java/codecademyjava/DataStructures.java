// Data Structures

Learn to create, manipulate, and store information in data structures.

Data Structures Overview
For Loop
ArrayList
ArrayList: Manipulation
ArrayList: Access
ArrayList: Insertion
Iterating over an ArrayList
For Each Loop
HashMap
HashMap: Manipulation
HashMap: Access
Iterating over a HashMap
Generalization

/*
#######################################################
*/

Data Structures Overview

/*
In the previous lesson,
you learned a few of the object-oriented programming concepts used in Java:
classes, objects, methods, and inheritance.
In this lesson,
you will learn how to use some of the classes and
methods built into Java to write programs to create, manipulate,
and store information in data structures.

Instructions

1.
Take a look at the code in the editor below.
You'll learn how to use them to create, store,
and manipulate data in data structures.

*/

Olympics.java

import java.util.*;

public Class Olympics {
	public static void main(String[] args) {
		
		// Some Olympic sports
		
		ArrayList<String> olympicSports = new ArrayList<String>();
		olympicSports.add("Archery");
		olympicSports.add("Boxing");
		olympicSports.add("Cricket");
		olympicSports.add("Diving");
		
		System.out.println("There are " + olympicSport.size() + " Olympic sports in this list. They are: ");
		
		for (String sport: olympicSports) {
			System.out.println(sport);
		}
		
		// Host cities and the year they hosted the summer Olympics
		
		HashMap<String, Integer> hostCities = new HashMap<String, Integer>();
		
		hostCities.put("Beijing", 2008);
		hostCities.put("London", 2012);
		hostCities.put("Rio de Janeiro", 2016);
		
		for (String city: hostCities.keySet()) {
			
			if (hostCities.get(city) < 2016) {
				System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");
			} else {
				System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");
			}
		}
	}
}

//Output
There are 4 Olympic sports in this list. They are: 
Archery
Boxing
Cricket
Diving
Beijing hosted the summer Olympics in 2008.
London hosted the summer Olympics in 2012.
Rio de Janeiro will host the summer Olympics in 2016.

/*
#######################################################
*/

For Loop

/*
When you provide a set of instructions in a method,
you might find that a common task is to manipulate an
entire set of data.
Java conveniently provides control statements to run a task repeatedly.
The control statement we will explore is called the for loop.

The for loop repeatedly runs a block of code until a specified condition is met.

The example below shows how a for loop is used:

for (int counter = 0; counter < 5; counter++) {

    System.out.println("The counter value is: " + counter);

}

The statements within the parentheses of for loop compose the following parts:

1. Initialization:
the int variable named counter is initialized to the value of 0
before the loop is run.

2. Test condition:
the Boolean expression counter < 5 is a conditional statement that
is evaluated before the code inside the control statement is run every loop.
If the expression evaluates to true, the code in the block will run.
Otherwise, if the expression evalutes to false, the for loop will stop running.

3. Increment:
Each time the loop completes,
the increment statement is run.
The statement counter++ increases the value of counter by 1 after each loop.

In the example above,
the for loop initially executes the code block in the sample code above
because the initial value of counter is less than 5,
which passes the test condition.

The value of counter is then incremented by 1 in the increment.

The code block will execute again because counter is still less than 5.
This cycle will continue until counter is no longer less than 5.

Please note that similar to the if-then statement, no semicolon is necessary.

Instructions
1.
The for loop in the code editor is currently missing the three statements
required to execute the code in the block. Finish the for loop by typing:

for (int waterLevel = 0; waterLevel < 7; waterLevel++) {

}

Leave the rest of the code inside the for loop as is.

*/

For.java

public class For {
	public static void main(String[] args) {
		
		for (int waterLevel = 0; waterLevel < 7; waterLevel++) {
			
			System.out.println("The pool water level is at " + waterLevel + " feet.");
		}
	}
}

//Output
The pool water level is at 0 feet
The pool water level is at 1 feet
The pool water level is at 2 feet
The pool water level is at 3 feet
The pool water level is at 4 feet
The pool water level is at 5 feet
The pool water level is at 6 feet

/*
#######################################################
*/

ArrayList

/*
Fantastic!
For loops will be useful when reading and manipulating Java data structures.
Let's talk about a few data structures that are built into Java.
The first data structure we will explore is called the ArrayList.

The ArrayList stores a list of data of a specified type.
Let's go through an example of how to create, or declare, an ArrayList of type Integer.

ArrayList<Integer> quizGrades = new ArrayList<Integer>();

ArrayList is a pre-defined Java class.
To use it, we must first create an ArrayList object.

In the example above,
we create an ArrayList object called quizGrades that will store data types
belonging to the <Integer> class (whole numbers).

Instructions
1.
Inside of the main method,
create an ArrayList object called weeklyTemperatures that will store Integer data types.
*/

Temperatures.java

import java.util.ArrayList;

public class Temperatures {
	
	public static void main(String[] args) {
		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
    }
}

//Output


/*
#######################################################
*/

ArrayList: Manipulation

/*
You created an ArrayList in the last exercise to store temperature data,
but it does not contain any values yet.

Let's add some values of type Integer to the ArrayList, one by one, like this:

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
quizGrades.add(87);
quizGrades.add(83);

In the example above, we call the add method on quizGrades.
The add method adds integers to the ArrayList.
The values 95, 87, and 83 are added to the list.

Instructions
1.
Add some temperatures to weeklyTemperatures. First, add a temperature value of 78.
2.
Next, add a temperature of 67.
3.
Add another temperature of 89.
4.
Finally, add a temperature of 94.
*/

Temperatures.java

import java.util.ArrayList;

public class Temperatures {
	public static void main(String[] args) {
		
		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
	    weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
	}
}

//Output


/*
#######################################################
*/

ArrayList: Access

/*
Great! Now we can start accessing the temperatures that our ArrayList stores.

We can access the elements of weeklyTemperatures by using an element's index,
or position, in the list.

An element's index refers to its location within an ArrayList.
ArrayLists in Java are zero-indexed,
which means that the first element in an ArrayList is at a position of 0.

Here is an example of accessing the element in the first position of the list:

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
quizGrades.add(87);
quizGrades.add(73);

System.out.println( quizGrades.get(0) );

The example above will print out the grade value of 95.

The index of the element containing the value 95 is at position 0 in the ArrayList.
We access the value by providing its index to the get method.
	
Instructions
1.
Use the get method to print out the lowest temperature contained in weeklyTemperatures.
*/

Temperatures.java

	import java.util.ArrayList;

	public class Temperatures {
	
		public static void main(String[] args) {

	    ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
	    weeklyTemperatures.add(78);
	    weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		
		System.out.println( weeklyTemperatures.get(1) );
		}
	}

//Output


/*
#######################################################
*/

ArrayList: Insertion

/*
We can also insert new elements into an ArrayList.

To insert new elements into an ArrayList,
we can use a slightly different version of the add method that you previously used:

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
quizGrades.add(87);
quizGrades.add(73);

quizGrades.add(0, 100);
System.out.println( quizGrades.get(0) );

The example above will print out the grade 100.

The add method will insert the grade 100 at the first position (0) into the list.
Since it inserts a new element into the beginning of the ArrayList,
all other element indices will be shifted one position higher.
The grade 95 is now at index 1.

Instructions
1.
Insert a new temperature of 111 at index 2.
2.
On the next line, use the get method to print out the temperature 89.
*/

TemperaturesB.java

	import java.util.ArrayList;

	public class TemperaturesB {
	
		public static void main(String[] args) {

			ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
			weeklyTemperatures.add(78);
			weeklyTemperatures.add(67);
			weeklyTemperatures.add(89);
			weeklyTemperatures.add(94);

            weeklyTemperatures.add(2, 111);
			System.out.println( weeklyTemperatures.get(3) );
		}
	}

//Output
89

/*
#######################################################
*/

Iterating over an ArrayList

/*
Earlier in this lesson, we learned about the for loop.
Since we've also learned how to retrieve the value at a specific index of an ArrayList,
we can now access each of the elements.

for (int i = 0; i < quizGrades.size(); i++) {

    System.out.println( quizGrades.get(i) );

}

In the example above, the for loop above includes the following statements:

1.
Initialization: int variable i is set to 0 which
is the first index of an ArrayList.

2.
Test condition: the code in the block will run as long as i is less
than the size of quizGrades.

3.
Increment: The code in this block will execute after each loop.
In this case,i will increment by 1 with i++ after each loop.
The size method returns an int that represents how many total elements are
stored within quizGrades. The example will print out each element within quizGrades
in order. The process of going through each element in the ArrayList is called iteration.

Instructions

1.
Inside of a for loop, print out the elements of the weeklyTemperatures ArrayList.
Use the get method and the int variable j. You can use the example above as reference.
*/

TemperaturesC.java

import java.util.ArrayList;

public class TemperaturesC {

	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		weeklyTemperatures.add(2, 111);

	    for (int j = 0; j < weeklyTemperatures.get(); j++) {
	    	System.out.println( weeklyTemperatures.get(j));
	    }

	}
}

//Output
78
67
111
89
94


/*
#######################################################
*/

For Each Loop

/*
Since most for loops are very similar,
Java provides a shortcut to reduce the amount of code required
to write the loop called the for each loop.

Here is an example of the concise for each loop:

for (Integer grade : quizGrades){
    System.out.println(grade);
}

In the example above, the colon (:) can be read as "in".
The for each loop altogether can be read as "for each Integer
element (called grade) in quizGrades, print out the value of grade."

The loop will print out the value of each Integer element in quizGrades.

Note: the for each loop does not require a counter.
Instructions
1.
The current block of code in the code editor is incomplete.
Finish the for each loop by typing:

for (Integer temperature : weeklyTemperatures) {
    System.out.println(temperature);
}
*/

TemperaturesForEach.java

import java.util.ArrayList;

public class TemperaturesForEach {
	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89); 
		weeklyTemperatures.add(94);
	
		for (Integer temperature: weeklyTemperatures) {
			System.out.println(temperature);
		}

	}
}

//Output
78
67
89
94

/*
#######################################################
*/

HashMap

/*
Great! Another useful built-in data structure in Java is the HashMap.

Although the name of the data structure might not make sense to you immediately,
think of it as a real-life dictionary.
A dictionary contains a set of words and a definition for each word.
A HashMap contains a set of keys and a value for each key.

If we look up a word in a dictionary, we can get the definition.
If you provide a HashMap with a key that exists,
you can retrieve the value associated with the key.

Declaring a HashMap is shown in the following example:

HashMap<String, Integer> myFriends = new HashMap<String, Integer>();

In the example above, we create a HashMap object called myFriends.
The myFriends HashMap will store keys of String data types and values of type Integer.

Note: the String object allows you to store multiple characters,
such as a word in quotations (e.g. "Rats!").

Instructions
1.
Create a HashMap object called restaurantMenu.
The HashMap should store String keys and Integer values.
Use the syntax in the example above if you need.
*/

Restaurant.java

import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {

    HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

	}
}

//Output


/*
#######################################################
*/

HashMap: Manipulation

/*
Perfect! Now let's fill the HashMap with useful data.

Add keys and values to a HashMap:

HashMap<String, Integer> myFriends = new HashMap<String, Integer>();

myFriends.put("Mark", 24);
myFriends.put("Cassandra", 25);
myFriends.put("Zenas", 21);

In the example above
we used the put method to add a String key and an associated Integer value.
The String key is the text inside double quotes " ".'
The Integer value is represented by the number.

Instructions
1.
Let's add some food items and prices to the our menu.
Use the put method to add a key "Turkey Burger" with the value 13.
2.
Add a key "Naan Pizza" with the value 11.
3.
Finally, add a key "Cranberry Kale Salad" with the value 10.
*/

Restaurant.java

import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {

    HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

    restaurantMenu.put("Turkey Burger", 13);
	restaurantMenu.put("Naan Pizza", 11);
	restaurantMenu.put("Cranberry Kale Salad", 10);

	}
}

//Output


/*
#######################################################
*/

HashMap: Access

/*
To access data in an ArrayList,
we specified the index.
In order to access a value in a HashMap, we specify the key:

HashMap<String, Integer> myFriends = new HashMap<String, Integer>();

myFriends.put("Mark", 24);
myFriends.put("Cassandra", 25);
myFriends.put("Zenas", 21);

System.out.println( myFriends.get("Zenas") );

In the example above,
we call the get method on the myFriends HashMap using the key "Zenas".
The console will print the value associated with "Zenas" which is 21.

Instructions

1.
Use the get method to print out the price of the "Naan Pizza" item.
*/

Restaurant.java

import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {

  HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

    restaurantMenu.put("Turkey Burger", 13);
    restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);

    System.out.println( restaurantMenu.get("Naan Pizza"));
	}
}

//Output
11

/*
#######################################################
*/

Iterating over a HashMap

/*
We can also access properties of a HashMap,
such as the number of entries or the contents of the HashMap.

Let's access the length and print out the contents of the myFriends:

HashMap<String, Integer> myFriends = new HashMap<String, Integer>();

myFriends.put("Mark", 24);
myFriends.put("Cassandra", 25);
myFriends.put("Zenas", 21);

System.out.println( myFriends.size() );

for (String name: myFriends.keySet()) {

    System.out.println(name + " is age: " + myFriends.get(name));

}

In the example above, the size method of HashMap prints out the size of
the myFriends instance.
As a result, the console prints out 3 since there are 3 key-value pairs.

Next, we use a for each loop to iterate over each key in myFriends.
The keySet method of HashMap returns a list of keys.

Inside the loop,
we access the current key name and use the get method of HashMap to access the value.
The console will print out the names and ages of each of my friends.

Instructions

1.
Complete the unfinished code statement on line 12 to print out the size of
restaurantMenu.

2.
Uncomment the code between line 13 and line 19Next,
complete the for each loop by typing:

for (String item : restaurantMenu.keySet()) {

}
*/

RestaurantForEach.java

import java.util.HashMap;

public class RestaurantForEach {
	public static void main(String[] args) {

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println( restaurantMenu.size() );

		for (String item : restaurantMenu.keySet())
        {


			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}

	}
}
//Output
3
A Turkey Burger costs 13 dollars.
A Cranberry Kale Salad costs 10 dollars.
A Naan Pizza costs 11 dollars.

/*
#######################################################
*/

Generalizations

/*
Great work! What did we learn so far?

For Loops: used to repeatedly run a block of code
For Each Loops: a concise version of a for loop
ArrayList: stores a list of data
HashMap: stores keys and associated values like a dictionary

Instructions

1.
Inside of the main method and before the for each loop,
create an ArrayList called sports that stores String types.
	
2.
Add "Football" to sports.
	
3.
Now add "Boxing" to sports.

4.
The first for each loop in the code editor is missing the code that should be run.
Inside of the for each loop, type:

System.out.println(sport);

5.
Uncomment the incomplete for each loop towards the bottom and complete the
loop by typing:

for ( String city : majorCities.keySet() ) {
}
*/

import java.util.*;

public class GeneralizationsD {
	public static void main(String[] args) {

    ArrayList<String> sports = new ArrayList<String>();
    sports.add("Football");
    sports.add("Boxing");

		for(String sport : sports) {
        System.out.println(sport);
		}

		//Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);


		for ( String city : majorCities.keySet() )
        {

			System.out.println(city + " was founded in " + majorCities.get(city));

    	 }

	}
}

//Output


/*
#######################################################
*/

