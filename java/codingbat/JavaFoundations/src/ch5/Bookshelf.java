/*
Design and implement a class called 'Book' that contains instance data
from the 'title, author, publisher, and copyright date'. 

Define the Book constructor to accept and initialize these data.

Include setter and getter methods for all instance data.

Include a toString method that returns a nicely formatted,
multiline description of the book. 

Create a driver called 'Bookshelf', whose main method instantiates and updates several
Book objects.
*/

/* 10632266-1

Implement two classes:
  "Book"
  "Bookshelf"

"Book":
  contains instance data from:
  title,
  author,
  publisher,
  copyright date
  
  setter and getter methods for all instance data
  
  toString method that returns formatted multiline description for the book

"Bookshelf":
  -the tester class
  -main method instantiates and updates several book objects
*/

/*
Program plan

  implement two classes "Book" and "Bookshelf"
  Class "Book" contains constructor to initialize parameters of title, author,
  publisher, and copyright date.
  Create set and get methods to update the parameters all instance data.
  Implement toString method to given description of the book in multiline.
  Driver class "Bookshelf" updates the books.
*/
package ch5;
public class Bookshelf
{
	public static void main(String[] args)
	{
		// create book object
		Book book1 = new Book("How to Win","Motoko Kusa","WorldStar", 1991);
		Book book2 = new Book("Be without Distractions","Jim Worm","BricksLay", 2016);
		Book book3 = new Book("Think Presently Futurely","Bob Tut","Wesley", 2015);
		Book book4 = new Book("It was all Worth it","Jamie Flo","ProPro", 1994);
		
		// update and print books
		System.out.println("Book 1");
		System.out.println(book1);
		System.out.println("Book 2");
		System.out.println(book2);
		System.out.println("Book 3");
		System.out.println(book3);
		System.out.println("Book 4");
		System.out.println(book4);
	}
	
}


/*
Book 1
Title: How to Win
Author: Motoko Kusa
Publisher: WorldStar
Copy Right Date: 1991

Book 2
Title: Be without Distractions
Author: Jim Worm
Publisher: BricksLay
Copy Right Date: 2016

Book 3
Title: Think Presently Futurely
Author: Bob Tut
Publisher: Wesley
Copy Right Date: 2015

Book 4
Title: It was all Worth it
Author: Jamie Flo
Publisher: ProPro
Copy Right Date: 1994
*/


