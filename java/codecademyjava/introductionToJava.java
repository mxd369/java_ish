// Introduction to Java

// Learn the fundamentals of the Java programming language

/*
#######################################################
*/

// Print A String

/*
Java is a programming language designed to build secure,
powerful applications that run across multiple operating systems,
including Linux, Mac OS X, and Windows.
The Java language is known to be flexible, scalable, and maintainable.

We will begin with the fundamentals of Java programming:
data types, arithmetic, and operators.
We’ll learn a few concepts that you can apply to the programs you create.
By the end of the course,
you’ll be familiar with the basic building blocks of a Java program.
Instructions

1.
Let's get started by getting to know each other.

On line 4, type your name within double quotes between the parentheses like this:

System.out.println("Gilberto");

Click Run to run the code.
*/

YourName.java

public class YourName {
	public static void main(String[] args) {
		
		System.out.println("Larry");

	}
}

//Output
Larry
	
/*
#######################################################
*/

// Data Types I: int

/*
Great job! You've already learned how to print text.

Creating more useful Java programs will likely require you to work with
several additional types of data. Let's explore a few of them.

The first data type we will use is int.

int is short for integer, which are all positive and negative numbers, including zero.
This number could represent the number of visits a website has received or
the number of programming languages you know.
The int data type only allows values between -2,147,483,648 and 2,147,483,647.
Instructions
1.
Type any whole number in between the parentheses of System.out.println();

int data types do not need to be typed within quotes,
so you can avoid using quotes this time.
*/

DataTypes.java

public class DataTypes {
	public static void main(String[] args) {

		System.out.println(888);
	}
}

//Output
888
/*
#######################################################
*/

// Data Types II: boolean

/*
Fantastic! You just printed an int data type.

The next data type we will use is the boolean.

A boolean is a data type that can only be either true or false.
Instructions
1.
Type either true or false between the parentheses of System.out.println();
to print a boolean value.
*/

DataTypesB.java

public class DataTypesB {
    public static void main(String[] args) {
    	System.out.println(true);
    }
}

//Output
true
/*
#######################################################
*/

// Data Types III: char

/*
Perfect. Let's look at one more Java data type: char.

The char data type is used to represent single characters.
That includes the keys on a keyboard that are used to produce text.

char is short for character and can represent a single character.
All char values must be enclosed in single quotes, like this: 'G'.
Instructions
1.
In between the parentheses of System.out.println();
type any single character of your choice.
Make sure it's enclosed in single quotes!
*/

DataTypesC.java

public class DataTypesC {
	public static void main(String[] args) {
		System.out.println('X');
	}
}

//Output
X

/*
#######################################################
*/

// Variables

/*
The int, boolean, and char are fundamental data types of Java that
we will see again later in the course.

Another important feature of Java (and of many programming languages)
is the ability to store values using variables.

1. A variable stores a value.
2. In Java, all variables must have a specified data type.
We can assign a variable to a specified data type, like this:

int myLuckyNumber = 7;

The variable myLuckyNumber now stores the value 7 as an int type.

A semicolon ; is also used to end all Java single code statements.
We will cover statements that should not end in a semicolon later in this course.
Instructions
1.
Set the int variable myNumber equal to the value 42.
2.
Set the boolean variable isFun equal to true.
3.
Set the char variable movieRating equal to 'A'.
*/

Variables.java

public class Variables{
	public static void main(String[] args) {
		int myNumber = 42;
		boolean isFun = true;
		char movieRating = 'A';
	}
}

//Output


/*
#######################################################
*/

// Whitespace

/*
Before we explore what we can do with variables,
let’s learn how to keep code organized in Java.

Whitespace is one or more characters (such as a space, tab, enter, or return)
that do not produce a visible mark or text.
Whitespace is often used to make code visually presentable.

Java will ignore whitespace in code,
but it is important to know how to use whitespace to structure code well.
If you use whitespace correctly,
code will be easier for you and other programmers to read and understand.
Instructions
1.
The given code is poorly formatted. Place System.out.println(isFormatted);
on line 5 so that it is easier to read.
*/

WhiteSpace.java

public class WhiteSpace {
	public static void main(String[] args) {
		boolean isFormatted = false;
		System.out.println(isFormatted);
	}
}

//Output
false

/*
#######################################################
*/

// Comments

/*
A comment is text you want Java to ignore.
Comments allow you to describe code or keep notes.

By using comments in the Java code,
you may help yourself and even other programmers understand the purpose of code
that a comment refers to.

In Java, there are two styles of comments: single line comments
and multi-line comments.

Single line comments are one line comments that begin with two forward slashes:
// I'm a single line comment!

Multi-line comments are generally longer comments that can span multiple lines.


Instructions
1.
The statement on line 4 prints out Noise!. Ask Java to ignore it by commenting it out.
Place two forward slashes (//) at the beginning of line 4.
2.
Write a multi-line comment that begins anywhere after the single line comment you just wrote.
Again, the comment can say anything you like.
*/

Comments.java

public class Comments {
	public static void main(String[] arg){
//		System.out.println("Noise!");
/*
A
Multiline
comment
*/
	}
}

//Output

/*
#######################################################
*/

/*
Now let's try arithmetic in Java.
You can add, subtract, multiply, and divide numbers and store them in variables:

int sum = 34 + 113;
int difference = 91 - 205;
int product = 2 * 8; 
int quotient = 45 / 3;

Instructions
1.
Set the int variable myNumber equal to the product of two numbers.
*/

Arthimetic.java

public class Arthimetic {
	public static void main(String[] args) {
		int myNumber = 64 * 108;
		System.out.println(myNumber);
	}
}

//Output
6912

/*
#######################################################
*/

/*
Good work! Let's explore one more special math operator known as modulo.

The modulo operator - represented in Java by the % symbol - 
returns the remainder of dividing two numbers.
For example, 15 % 6 will return the value of 3,
because that is the remainder left over after dividing 15 by 6.
Instructions
1.
Use the modulo operator to set the variable myRemainder equal to 2.
You can use any two numbers that return a remainder value of 2.
*/

Modulo.java

public class Modulo {
	public static void main(String[] args) {
		int myRemainder = 16 % 7;
		System.out.println(myRemainder);
	}
}

//Output
2

/*
#######################################################
*/

/*
It looks like you're getting the hang of this!
Let's explore another set of useful operators available in Java known as
relational operators.

Relational operators compare data types that have a defined ordering,
like numbers (since numbers are either smaller or larger than other numbers).

Relational operators will always return a boolean value of true or false.

Here are a few relational operators:

< : less than.
<=: less than or equal to.
>: greater than.
>=: greater than or equal to.
A relational operator is placed between the two operands
(the terms that you want to compare using the relational operator).
The result of a relational operation is printed out in the following statement:

System.out.println(5 < 7);

The example above will print out true because the statement "5 is less than 7" is true.
Instructions
1.
Use one of the relational operators above to compare any two integers.
*/

RelationalOperators.java

public class RelationalOperators {
	public Static void main(String[] args) {
		System.out.println(20 < 21);
	}
}

//Output
true
/*
#######################################################
*/
	
/*
You may have noticed that the relational operators did not include an operator
for testing "equals to". In Java, equality operators are used to test equality.

The equality operators are:

==: equal to.
!=: not equal to.
Equality operators do not require that operands share the same ordering.
For example, you can test equality across boolean, char, or int data types.
The example below combines assigning variables and using an equality operator:

char myChar = 'A';
int myInt = -2;
System.out.println(myChar == myInt);

The example above will print out false because the value of myChar ('A')
is not the same value as myInt ('-2').
Instructions
1.
Use any equality operator to directly compare two Boolean values.
Do not declare any variables.
*/
	
EqualityOperators.java

public class EqualityOperators {
	public Static void main(String[] args) {
		System.out.println(true == true);
	}
}

//Output
true
/*
#######################################################
*/

/*
Congratulations! You've learned some of the building blocks of Java programming.
What can we generalize so far?

Data Types are int, boolean, and char.
Variables are used to store values.
Whitespace helps make code easy to read for you and others.
Comments describe code and its purpose.
Arithmetic Operators include +, -, *, /, and %.
Relational Operators include <, <=, >, and >=.
Equality Operators include == and !=.
A full understanding of these concepts is key to understanding the remainder of
the Java course. Let's keep going!
Instructions
1.
Write a single line comment anywhere you want. It can be anything!
(Make sure it starts with //)
2.
Set the boolean variable isComplete to true.
3.
Set the int variable awesomeLevel equal to 121.
4.
Set the int variable epicLevel equal to awesomeLevel multiplied by 2.
5.
Uncomment the last line so that the console prints out the value of epicLevel.
*/
	
Generalizations.java

public class Generalizations {
	public Static void main(String[] args) {
		//boolean isComplete;
		//int awesomeLevel;
		//int epicLevel;
		/*System.out.println(epicLevel);*/
		// A comment
		boolean isComplete = true;
		int awesomeLevel = 121;
		int epicLevel = awesomeLevel * 2;
		System.out.println(epicLevel);
	}
}

//Output
242
/*
#######################################################
*/