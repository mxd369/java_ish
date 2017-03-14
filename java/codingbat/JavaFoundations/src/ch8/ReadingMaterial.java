// 10641639-2
/*
Program Plan:
  Implement a class ReadingMaterial to store and print values of title, number of pages, published values.
  Implement the classes Book, Novel, Magazine, TechnicalJournal, and TextBook which extends required class.
  Implement a driver class to initiate and exercise several of the classes
*/

/*
Program creates a set of classes that define the various reading material and include data values that
describe various attributes and Include methods that are named appropriately for each class 
and print an appropriate message
*/

package ch8;
public class ReadingMaterial
{
	// Data Members
	protected String title;
	protected int numOfPages;
	protected String publisher;
	
	// constructor will set the title, numOfPages, and publisher with the parameter values
	public ReadingMaterial(String mTitle, int mNumOfPages, String mPublisher)
	{
		// Sets title, numOfPages, publisher to parameter values
		title=mTitle;
		numOfPages=mNumOfPages;
		publisher=mPublisher;
	}
	
	// This method prints the ReadingMaterial information
	public void print()
	{
		System.out.println("Title : " + title);
		System.out.println("Number of Pages :" + numOfPages);
		System.out.println("Publisher :" + publisher);
	}
	
}