=========================================================writeObject readObject


What is the signature of writeObject and readObject methods supposed to be?
So a few questions regarding these methods. I understand how to save and load objects but I am a little confused about the signature of the methods.
 
Should these methods be called save and load?
Should the argument for the writeObject/save method have the file name as its argument in the form of a String?
if the readObject/load method has no arguments how do we know which file to read from?
Should the methods be prompting the user to input a file name?
 
Thank you for the help!



public void save(String filename)
 
public SortedDblList<T> load(String filename)

=================
writeObject and readObject
whenever we create a file with writeObject where should we go look to find it?


You should write your objects to the file you specify in your save method.
Here is a tutorial on serialization that you may find helpful:
https://www.tutorialspoint.com/java/java_serialization.htm 


by save method do you mean the readObject() method?
also What parameters does writeObject(...) take in, the wording of the project description is quite confusing.

I mean the writeObject method.
Both readObject and writeObject will need to take in a String fileName as the parameter,
as that specifies which file to read/write to/from.



=========================================================SortedDblList class

Should the SortedDblList class be generic?


From the project instructions: "Since we are using the compareTo method,
this class should be generic in the sense that it works for ANY T object that implements Comparable<T>.
Do not assume Person or Student will always be used!! Note: I might test against this when grading.
In other words, the class SortedDblList should be defined (as a generic class) such that it is a doubly linked list of elements of type T,
where Tor a superclass of T implements the Comparable interface.
As you may recall, T is called the "type variable" of the SortedDblList generic class.[emphasis added]" So, yes!