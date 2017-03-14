/*

In this challenge,
I've tried to include several of the concepts we reviewed in this section.
We've been contacted by a friend who owns a pizza shop.
She wants an application that supports online ordering.
After talking to the owner, we decide to create the following.
A pizza class that implements the comparable interface.
Again, this is for a pizza shop, and this particular pizza shop offers
two types of pizza Regular and Sicilian. The Regular is circular,
but the Sicilian is formed in the shape of a rectangle.

We will have a super class for pizza with two sub-classes,
Regular and Sicilian.
The comparison will be used to sort the pizzas based on
size, small, medium, large, and extra large.
The pizza class needs to include the size of the pizza,
the type of pizza, toppings, we'll include an ArrayList of strings to
allow for multiple toppings, and the cost of the pizza.
The main program will ask the user for the customer name,
the type and size of the pizza they would like to order,
the number of toppings, we're going to allow up to four toppings
for a regular pizza but only two for Sicilian.

Finally, we'll print out the total for the order including a description
of the pizza they ordered. It will be nice to allow the user to enter
multiple pizza at one time. Try that for a little extra challenge.
I'm estimating that this activity might take about 30 minutes,
so don't be discouraged if it takes you a little while.


Objectives:
  Create an online ordering application
  Requires the comparable interface
  This is for a pizza shop
  Two types of pizza: Regular(circular)/Sicilian(rectangular)
  Super class for pizza with subcalsses regular and sicilian
  
  
  Use compareTo based on size
  Instance data should be
    Size
    Type
    Toppings(ArrayList of Strings)
    Cost
 

  Main Program:
    Customer name
    type and size
    number of toppings( up to 4 for regular)
    only two toppings for sicilian
    print out the total for the order
    
  
  nice to allow the user to enter multiple pizza at one time.
  
  
*/