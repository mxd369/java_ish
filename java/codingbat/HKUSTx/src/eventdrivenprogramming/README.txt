===================================
===================================Example: interface
Shape
Rectangle
Circle


Let me side track a little bit because the event listener is a Java interface.
Interface is beyond the scope of this course.
So I'll only discuss the topic very briefly.
Basically, an interface is a group of related methods with empty bodies.
And these methods must be defined by any class which implements this interface.
An interface declaration using the keyword interface. It is similar to a class declaration,
except that the methods are declared without the method bodies.
It also doesn't contain any instance or statics variables, except that static final constants are allowed.
Here is an example showing the declaration for the interface ActionListener.
As you can see, the method actionPerfomed is declared with one parameter of type ActionEvent.
but the method body is missing.
Notice that there's not even the pair of curly braces after the method.
Let's take a look at another example on interface.
In this example, a Shape interface which describes features that are common to all shapes.
The interface defines two abstract methods, namely, area and perimeter.
These methods are supposed to compute the features common to all shapes.
But the method body is missing because the implementation
of the actual computation could be different for different shapes.
Here, the computation for the rectangular shape is implemented.
As you can see, the body of the methods, area and perimeter provides the actual computation.
In the case of area, you are simply multiplying the width with height.
When you compute the perimeter, you are adding width and height together, and then multiplying that by 2.
Similarly, the implementation of circles is also provided here.
In this case, the area of a circle is pi times radius squared.
That could also be implementation for other shapes.
You can see from this example that the methods area and perimeter can take on different meanings
depending on what object they are dealing with.
That is, interfaces can be used to achieve polymorphism,
an important concept that we discussed when we introduced the fundamental principles of Object oriented Programming.


====================================
