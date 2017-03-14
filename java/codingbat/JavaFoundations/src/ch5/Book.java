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

/* Program plan

  implement two classes "Book" and "Bookshelf"
  Class "Book" contains constructor to initialize parameters of title, author,
  publisher, and copyright date.
  Create set and get methods to update the parameters all instance data.
  Implement toString method to given description of the book in multiline.
  Driver class "Bookshelf" updates the books.
*/
package ch5;

class Book
{
	// private data members
	private String title;
	private String author;
	private String publisher;
	private int copyrightdate;

	// add constructor to initialize parameters title, author, publisher, and copyrightdate
	// implement set and get methods to initialize instance variables
	public Book(String ti, String au, String pub, int copyrdate)
	{
		this.title = ti;
		this.author = au;
		this.publisher = pub;
		this.copyrightdate = copyrdate;
	}
	
	//********************************
	
	// returns the title
	public String getTitle()
	{
		return title;
	}
	
	// updates the title
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	//********************************
	
	// returns the author
	public String getAuthor()
	{
		return author;
	}
	
	// updates the author
	public void setAuthor(String au)
	{
		this.author = au;
	}
	
	//********************************
	
	// returns the publisher
	public String getPublisher()
	{
		return publisher;
	}
	
	// updates the publisher
	public void setPub(String pub)
	{
		this.publisher = pub;
	}
	
	//********************************

	// return the Copyrightdate
	public int getCopyRD()
	{
		return copyrightdate;
	}
	
	// update the Copyrightdate
	public void setCopyRD(int copyrdate)
	{
		this.copyrightdate = copyrdate;
	}
	
	//********************************


	public String toString()
	{
		String descrip = "";
		descrip += "Title: " + title + "\n";
		descrip += "Author: " + author + "\n";
		descrip += "Publisher: " + publisher + "\n";
		descrip += "Copy Right Date: " + copyrightdate + "\n";
		return descrip;
	}

}