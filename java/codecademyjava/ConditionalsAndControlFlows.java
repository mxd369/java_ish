//Conditionals And Control Flows

// Learn how to use control flow and conditional statements in Java.

// Decisions

/*
So far, we've explored primitive data types and Java syntax.
As we've seen, Java programs follow the instructions we provide them,
such as printing values to the console.

We can also write Java programs that can follow different sets of
instructions depending on the values that we provide to them.
This is called control flow. In this lesson,
we'll learn how to use control flow in our programs.
Instructions
1.
Take a look at the code in the editor.
If it looks confusing to you right now, don't worry!
After this lesson, you'll be able to read and write Java programs
that use control flow.

Click Run to run the code.
*/

Conditionals.java

public class Conditionals {
	public static void main(String[] args) {
		if (1 < 4 && 0 > 5) {
			System.out.println("You ordered a cup of hot, mint tea");
		} else if (21 <= 19 || 17 >= 28) {
			System.out.println("You ordered freshly squeezed orange juice!");
		} else if (!(true = true) ) {
			System.out.println("You ordered hot cocoa!");
		} else {
			System.out.println("You ordered a cup of Java!");
		}
		char answerChoice = 'C';
		switch (answerChoice) {
			case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
			    break;
			case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
				break;
			case 'C': System.out.println("You answered: " + answerChoice + ". Please try again.");
				break;
			case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
				break;
			default:
			System.out.println("Please select a valid answer choice.");	
		}
	}
}


//output
You ordered a cup of Java!
You answered: C. That is correct!

/*
#######################################################
*/

// Boolean Operators: &&

/*
Let's look at a set of operators that let us use control flow in our programs.
These operators are called Boolean operators.

There are three Boolean operators that we will explore.
Let's start with the first one: and.

The and operator is represented in Java by &&.
It returns a boolean value of true only when the
expressions on both sides of && are true.
For example, the code below shows one outcome of the Boolean operator &&:

// The following expression uses the "and" Boolean operator
System.out.println(true && true); // prints true

The code below shows the rest of the possible outcomes of the Boolean operators: &&:

// The following expressions use the "and" Boolean operator
System.out.println(false && false); // prints false
System.out.println(false && true); // prints false
System.out.println(true && false); // prints false

We can also use the Boolean operator && with Boolean expressions such as the following:

System.out.println(2 < 3 && 4 < 5);

The example above will print out true because
the statements "2 is less than 3" and "4 is less than 5" are both true.

Instructions
1.
Use the && operator and any two Boolean expressions of your choice
between the parentheses of System.out.println();
in order to print out a value of true or false to the console.
*/

And.java

public class And {
	public static void main(String[] args) {
		System.out.println(false && true);
	}
}

//output
false

/*
#######################################################
*/

// Boolean Operators: ||

/*
Great! The second Boolean operator that we will explore is called or.

The or operator is represented in Java by ||.
It returns a Boolean value of true when
at least one expression on either side of || is true.
The code below shows all the outcomes of the Boolean operator ||:

//The "or" Boolean operator:

System.out.println(false || false); // prints false
System.out.println(false || true); // prints true
System.out.println(true || false); // prints true
System.out.println(true || true); // prints true

We can also use the Boolean operator || with Boolean expressions such as the following:

System.out.println(2 > 1 || 3 > 4);

The example above will print out true
because at least one statement — "2 is greater than 1" — is true even though
the other statement — "3 is greater than 4" — is false.

Instructions
1.
Use the || operator and any two Boolean expressions of your choice
between the parentheses of System.out.println();
in order to print out a value of true or false to the console.
*/

Or.java

public class Or {
	public static void main(String[] args) {
		System.out.println( 3 > 6 || 12 >= 9 );
	}
}

//output
true

/*
#######################################################
*/

// Boolean Operators:!

/*
Fantastic! The final Boolean operator we will explore is called not.

The not operator is represented in Java by !.
It will return the opposite of the expression immediately after it.
It will return false if the expression is true,
and true if the expression is false.
The code below shows all the outcomes of the Boolean operator !:

//The "not" Boolean operator:

System.out.println(!false); // prints true
System.out.println(!true); // prints false

We can also use the Boolean operator ! with Boolean expressions such as the following:

System.out.println( !(4 <= 10) );

The example above will print out false
because the statement "4 is
less than or equal to 10" is true,
but the ! operator will return the opposite value,
which is false.

Instructions
1.
Use the ! operator to return a value of true for the code on line 4.
2.
Use the ! operator to return a value of false for the code on line 5.
*/

Not.java

public class Not {
	public static void main(String[] args) {
		System.out.println(!false);
		System.out.println( !(5>=1) );
	}
}
//output
true
false

/*
#######################################################
*/

// Boolean Operators: Precedence

/*
The three Boolean operators &&, ||, and ! can also be used together
and used multiple times to form larger Boolean expressions.

However, just like numerical operators,
Boolean operators follow rules that specify the order in which they are evaluated.
This order is called Boolean operator precedence.

The precedence of each Boolean operator is as follows:

! is evaluated first
&& is evaluated second
|| is evaluated third

Like numerical expressions, every expression within parentheses is evaluated first.
Expressions are also read from left to right.

The following statement demonstrates how Boolean operator precedence works:

System.out.println( !(false) || true && false);

The example above will print out true.
In order, the expression is evaluated as follows:

First, the ! Boolean operator in !(false) returns true.
Second, true && false evaluates to false.
Finally, the remaining expression true || false evaluates to true.

Instructions
1.
Line 4 has a code statement that is incomplete.
Use each Boolean operator no more than once to replace the empty comments.
The code statement should print out false.
*/

Precedence.java

public class Precedence {
	public static void main(String[] args) {
		boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
		System.out.println(riddle);
	}
}

//output
false

/*
#######################################################
*/

// If Statement

/*
Let's get familiar with how relational, equality, and Boolean
operators can be used to control the flow of our code.

We'll start by exploring the if statement.

In Java, the keyword if
is the first part of a conditional expression.
It is followed by a Boolean expression and then a block of code.
If the Boolean expression evaluates to true,
the block of code that follows will be run.
Here's an example of the if statement used with a conditional expression:

if (9 > 2) {
    System.out.println("Control flow rocks!");
}

In the example above, 9 > 2 is the Boolean expression that gets checked.
Since the Boolean expression "9 is greater than 2" is true, Control flow rocks!
will be printed to the console.

The if statement is not followed by a semicolon (;).
Instead it uses curly braces ({ and }) to surround the code block that gets run
when the Boolean expression is true.

Instructions
1.
The if statement in the code editor is missing its Boolean expression.
Provide the if statement with a Boolean expression that evaluates to true.
*/

If.java

public class if {
	public static void main(String[] args) {
		if(true == true) {
			System.out.println("Access granted.");
		}
	}
}
//output
Access granted.

/*
#######################################################
*/

// If-Else Statement

/*
Sometimes we execute one block of code when the Boolean
expression after the if keyword is true.
Other times we may want to execute a different block of
code when the Boolean expression is false.

We could write a second if statement with a Boolean expression
that is opposite the first, but Java provides a shortcut called
the if/else conditional.

The if/else conditional will run the block of code associated
with the if statement if its Boolean expression evaluates to true.
Otherwise, if the Boolean expression evaluates to false,
it will run the block of code after the else keyword.
Here's an example of if/else syntax:

if (1 < 3 && 5 < 4) {
    System.out.println("I defy the Boolean laws!")
} else {
    System.out.println("You can thank George Boole!");
}

In the example above, the Boolean expression
"1 is less than 3" and "5 is less than 4" evaluates to false.
The code within the if block will be skipped and
the code inside the else block will run instead.
The text "You can thank George Boole!" will be printed in the console.

Instructions

1.
The if/else statement in the code editor currently prints
out the code in the if block. Modify the if statement's
Boolean expression so that the code in the else block gets
executed and prints to the console.
*/

IfElse.java

public class IfElse {
	public static void main(String[] args) {
		if (7 != 7) {
			System.out.println("Try again...");
		} else {
			System.out.println("Success!");
		}
	}
}
//output
Success!

/*
#######################################################
*/

// If-ElseIf-Else Statement

/*
Good work!
In some cases,
we need to execute a separate block of code depending on different Boolean expressions.
For that case, we can use the if/else if/else statement in Java.

If the Boolean expression after the if statement evaluates to true,
it will run the code block that directly follows.
Otherwise,
if the Boolean expression after the else if statement evaluates to true,
the code block that directly follows will run.
Finally, if all previous Boolean expressions evaluate to false,
the code within the else block will run.
Here's an example of control flow with the if/else if/else statement:

int shoeSize = 10;

if (shoeSize > 12) {
    System.out.println("Sorry, your shoe size is currently not in stock.");
} else if (shoeSize >= 6) {
    System.out.println("Your shoe size is in stock!");
} else {
    System.out.println("Sorry, this store does not carry shoes smaller than a size 6.");
}

In the example above,
the int variable shoeSize is equal to 10, which is not greater than 12,
but it is greater than or equal to 6.
Therefore, the code block after the else if statement will be run.

Instructions

1.
Set the value of the round variable so that the code in the else if block runs.
*/

IfElseIf.java
	
public class IfElseIf {
	public static void main(String[] args) {
		int round 11;
		if(round > 12) {
			System.out.println("The match is over!");
		} else if (round > 0) {
			System.out.println("The match is underway!");
		} else {
			System.out.println("The boxing match hasn't started yet.");
		}
	}
}
//output
The match is underway!

/*
#######################################################
*/

// Ternary Conditional

/*
if/else statements can become lengthy even when you simply
want to return a value depending on a Boolean expression.
Fortunately, Java provides a shortcut that allows you to write if/else
statements in a single line of code. It is called the ternary conditional statement.

The term ternary comes from a Latin word that means "composed of three parts".

These three parts are:

A Boolean expression
A single statement that gets executed if the Boolean expression is true
A single statement that gets executed if the Boolean expression is false
Here is an example of a ternary conditional statement:

int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);

In the example above, the int variable called pointsScored is equal to 21.

The Boolean expression is (pointsScored > 20), which evaluates to true.
This will return the value of 'W', which is assigned to the variable gameResult.
The value 'W' is printed to the console.

Instructions
1.
Set the canDrive variable equal to the ternary expression: (fuelLevel > 0) ? 'Y' : 'N';
*/

Ternary.java
	
public class Ternary {
	public static void main(String[] args) {
		int fuelLevel = 3;
		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);
	}
}
//output
Y

/*
#######################################################
*/

// Switch Statement

/*
The conditional statements that we have covered so far require Boolean
expressions to determine which code block to run.
Java also provides a way to execute code blocks based on whether a block
is equal to a specific value.
For those specific cases,
we can use the switch statement,
which helps keep code organized and less wordy.

The switch statement is used as follows:

int restaurantRating = 3;

switch (restaurantRating) {

    case 1: System.out.println("This restaurant is not my favorite.");
      break;

    case 2: System.out.println("This restaurant is good.");
      break;

    case 3: System.out.println("This restaurant is fantastic!");
      break;

    default: System.out.println("I've never dined at this restaurant.");
      break;
}

In the example above,
we assigned the int variable restaurantRating a value of 3.
The code will print a message to console based on the value of restaurantRating.

In this case, This restaurant is fantastic! is printed to the console.

The break statement will exit the switch statement after a condition is met.
Without the break statement,
Java will continue to check whether the value of restaurantRating matches any other cases.

The default case is printed only if restaurantRating is not equal to an int
with the value of 1, 2, or 3.

Instructions

1.
Set the code block under the default case to:

System.out.println("Messi is in position...");

2.
Look at the code in the code editor.
Set the char variable penaltyKick value to L, R, or C.
*/

Switch.java

public class Switch {
	public static void main(String[] args) {
		char penaltyKick = 'L';
		switch (penaltyKick) {
			case 'L': System.out.println("Messi shoots to the left and scores!");
			break;
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
			break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
			break;
			default:
			System.out.println("Messi is in position...");
		}
	}
}
//Output
Messi shoots to the left and scores!
/*
#######################################################
*/

// Generalization
	
/*
Great work!
Control flow allows Java programs to execute code blocks depending on Boolean expressions.
What did we learn about control flow so far?

Boolean Operators: &&, ||, and ! are used to build Boolean expressions
and have a defined order of operations
Statements: if, if/else, and if/else if/else statements are used to
conditionally execute blocks of code

Ternary Conditional: a shortened version of an if/else statement that
returns a value based on the value of a Boolean expression

Switch: allows us to check equality of a variable or expression with
a value that does not need to be a Boolean

Instructions
1.
Use the precedence rules to help you evaluate the Boolean expression in the single line comment above the tricky variable.
Then, set the boolean variable tricky equal to the result (either true or false).
2.
Use a Boolean expression that will print out the code in the else block of the if/else statement.
3.
Set the value of the int variable subwayTrain equal to the case that will print "This is a Brooklyn bound train!" to the console.
*/

GeneralizationsB.java

public class GeneralizationsB {
	public static void main(String[] args) {
		// ( 3 >= 3 && !(true || true) )
		boolean tricky = false;
		if(2015 < 2016) {
			System.out.println("Stuck in the past...");
		} else {
			System.out.println("Upgraded to the future!");
		}
		int subwayTrain = 5;
		switch (subwayTrain){
			case 1: System.out.println("This is a South Ferry bound train!");
			break;
			case 5: System.out.println("This is a Brooklyn bound train!");
			break;
			case 7: System.out.println("This is a Queens bound train!");
			break;
			default:
			System.out.println("I'm not sure where this train goes...");
		}
	}
}
//Output
Upgraded to the future!
This is a Brooklyn bound train!

/*
#######################################################
*/
