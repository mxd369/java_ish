/*

 
 Code review really has two purposes:

-Improving the code.
Finding bugs, anticipating possible bugs,
checking the clarity of the code,
and checking for consistency with the project's style standards.

-Improving the programmer.
Code review is an important way that programmers learn and teach each other,
about new language features,
changes in the design of the project or its coding standards,
and new techniques.
In open source projects, particularly,
much conversation happens in the context of code reviews.
 

-Rules
Don't Repeat Yourself (DRY)
Comments where needed
Fail fast
Avoid magic numbers
One purpose for each variable
Use good names
No global variables
Return results, don't print them
Use whitespace for readability
 
http://google.github.io/styleguide/javaguide.html
 
Programmers often describe bad code as having a “bad smell” that needs to be removed.
“Code hygiene” is another word for this. Let's start with some smelly code.

DON'T REPEAT YOURSELF


Duplicated code is a risk to safety.
If you have identical or very similar code in two places,
then the fundamental risk is that there's a bug in both copies,
and some maintainer fixes the bug in one place but not the other.

Avoid duplication like you'd avoid crossing the street without looking.
Copy-and-paste is an enormously tempting programming tool,
and you should feel a frisson of danger run down your spine every time you use it.
The longer the block you're copying, the riskier it is.

Don't Repeat Yourself, or DRY for short, has become a programmer's mantra.

The dayOfYear example is full of identical code. How would you DRY it out?
*/
package reading2codeReview;
public class SmellyExampleNumber1 {
	

	// Question1:
	// Some of the repetition in dayOfYear() is repeated values.
	// How many times is the number of days in April written in dayOfYear()?
	
	// Explanation:
	// Each sum of the form 31 + 28 + 31 + 30 + ... is a sum of days in months:
	// 31/*January*/ + 28/*February*/ + 31/*March*/ + 30/*April*/ + ... 
	// There are 8 occurrences of 30 that belong to April.
	// By the way, the fact that this question couldn't be obviously answered
	// from the code is an example of the problem of magic numbers,
	// which will be discussed more in a bit.

	// Question2:
	// One reason why repeated code is bad is because a problem in the repeated
	// code has to be fixed in many places, not just one.
	// Suppose our calendar changed so that February really has 30 days instead of 28.
	// How many numbers in this code have to be changed?
	
	// Explanation:
	// Explanation
	// The eight explicit 28s would have to change,
	// and so would the two numbers 59 and 90, which implicitly depend on the assumption
	// that February has 28 days:
	// 59 = 31/*January*/ + 28/*February*/, and 90 = 31/*January*/ + 28/*February*/ + 31/*March*/.
	// These two surprise numbers are magic numbers, which we'll talk about shortly.

	
	// Question3:
	//  Another kind of repetition in this code is dayOfMonth+=. Assume you have an array:
	/*
		int[] monthLengths = new int[] { 31, 28, 31, 30, ..., 31}
	*/
	// Which of the following code skeletons could be used to DRY the code out enough so that
	// dayOfMonth+= appears only once? Check all that apply.

	// for (int m = 1;m < month;++m){...}
	// while (m < month) {...; m += 1;}
	// if(month == 1){...}else{...daysOfYear(month-1, dayOfMonth, year)...}

	// Explanation:
	/*
	Explanation
	Loop statements like for and while are both good approaches to condensing repetitive code.
	Both loops could work here.
	A switch statement is a more compact way to represent a series of if-else-if statements,
	like we see here, and it does help DRY the code out by eliminating the
	repetitive mentions of month==. But it wouldn't eliminate the repetitions of dayOfMonth+=.
	The fourth skeleton makes dayOfYear into a recursive function.
	It has a base case for January,
	and handles other months by recursively computing the dayOfYear from the previous month,
	then adding the current month to it.
	This approach also works for eliminating the dayOfMonth+= repetition.
	If you're not clear on these skeletons,
	try fleshing them out into actual code, and run it.
	Ask for help on Piazza or at office hours.
	*/
	
	// method
	public static int dayOfYear(int month, int dayOfMonth, int year) {
		// method body
		if (month == 2) {
			dayOfMonth += 31;
		} else if (month == 3) {
			dayOfMonth += 59;
		} else if (month == 4) {
			dayOfMonth += 90;
		} else if (month == 5) {
			dayOfMonth += 31 + 28 + 31 + 30;
		} else if (month == 6) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31;
		} else if (month == 7) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
		} else if (month == 8) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
		} else if (month == 9) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		} else if (month == 10) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		} else if (month == 11) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		} else if (month == 12) {
			dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
		}
		return dayOfMonth;
	}

}