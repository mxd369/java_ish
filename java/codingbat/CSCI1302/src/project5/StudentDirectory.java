package project5;

import javax.swing.JFrame;

// You must extend the JFrame class to make a frame
// Frames are windows in java 
public class StudentDirectory extends JFrame
{
    
}

/*

StudentDirectory:
The StudentDirectory class is a GUI program that is used
for retrieving/storing an ArrayList of Students from/to the
file named "StudentsList.dat" using the serialization mechanism.
StudentDirectory is a subclass of JFrame.

It has a menu, and a few labels, textboxes, and buttons as described below:

1.
Initially when executed, your program should load the ArrayList
of Students into memory (you should implement a method for this purpose
(i.e. loading) since this functionality is needed later as well).
You can do this in the constructor of StudentDirectory.
Then your program should show the information of the first Student of the
ArrayList as described below. The very first time you run the program,
there is no "StudentsList.dat" file. Your program should start as if the "Append" button is clicked (see below).


2.
Your program should have a "File" menu with three menu-items: "Load", "Save", "Exit".
"Load" loads the ArrayList of Students from the above file into memory.
"Save" saves the ArrayList of Students into the above file.
"Exit" terminates the program.

3.
For each attribute of the Student class,
including the ones that are defined in Person,
you need to have a textbox with an appropriate label preceding it.
For "dob" you can use three comboboxes to let user pick month, day, and year.
You also need a label to show the index of the current Student in the ArrayList.

4.
You also need three buttons at the bottom of your frame: Previous, Next, Append.
The "Previous" button goes back to the preceding Student in the ArrayList.
This button should be disabled if we are at the beginning of the ArrayList.
The "Next" button shows the succeeding Student in the ArrayList.
This button should be disabled if we are at the end of the ArrayList.
Hitting the "Append" button clears all the textboxes and lets user enter
information for a new Student. Also, the text on the "Append" button should change to "Submit".
Once the user entered the information, he can press "Submit" to append the Student to the ArrayList.
If he decided he does not want to do so,
he can simply hit "Previous" to cancel changes and go to the last Student in the list.


5.
Automatically save the ArrayList to file when the frame is closed.



*/