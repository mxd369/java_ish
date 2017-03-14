Challenge Objectives:
  Start with an Event class
    Type of event
    Date of event
    Number of guests
    Default cost per guest set to $40
    Event Number (computer generated)

  Constructors for the Event class
    Only the event name is known
    Event name and date
    Event name, date, and number of guests
    
  Accessor and mutator methods
    Set and get methods for all instance data
    Calculate total method
	Event name, date, and number of guests

  Main
    Contains helper methods for all the data
    Creates an event object
    Prints the event


- It's time for the Challenge on classes.
In this Challenge, we've been hired by Kathie's Catering.
Kathie's Catering has hired us to create an application to help manage her upcoming events. 
The catering company provides meals for Parties and special occasions,
such as Weddings, Birthdays, Bridal Showers, Baby Showers, those types of events.
So, for this challenge, I want you to create an Event class.
The Event class will hold specific information about the event.

The Type of event; make this a string variable so we can hold things like weddings, retirement, birthday.
The date of the event, the number of guests.
Let's set a default cost for each guest to $40 inside of the class.
And finally, I'd like a computer generated event number.
This number will start with the first letter of the event.
So, for example, if it was a wedding, it would start with W.
Define a static variable for the next number, that way it'll automatically add one to our number,
regardless of whether the new event is a wedding, or a birthday, or a shower.

Now that we have all of the instance data defined, 
let's talk about the constructors needed for the Event class.
Let's add at least three constructors. One will be used when only the event name is known.
The second constructor will have the event name and the date of the event and the third constructor
will have the event name, the date, and the number of guests.
In addition to the constructors, we're gonna need Accessor and mutator methods for each piece of instance
data in our event class.

So, go ahead and add Set and get methods for all the instance data.
We also need to have a method that will calculate the total for this event.
We wanna take the number of guests X our price per guest and return that value to the calling method.
And finally, let's add a print method, so we can print out all of the information about the event.
OK, that's it for our class. Now let's get back over to the main program.
In the Java file that contains the Main method,
we were to add helper methods to get all the event information.

In the Main method itself, we're only gonna have two statements.
One, to create an event object and a second one, to print out the information about the event.
The helper methods will be used to prompt the user to enter the information about the event;
the type of event, the number of guests, and the date of the event.
OK, now you have all of the information you need to get started, so give this challenge a try.
I'm estimating that this should take about 30 minutes.

You might be able to get it done sooner, especially if you've already written some classes on your own,
but either way, go ahead and give it a try and have some fun. Good Luck!