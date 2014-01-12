

Several examples of the best well known design patterns (GoF and J2EE) coded in Java.
All patterns provide a way to let some part of a system vary independently of all other parts.

Next, you can find the design principles followed driving the patterns, as well as an overview of the design patterns currently included and a brief explanation:


*** Design Principles ***

1.-Identify the aspects of your application that vary and separate them from what stays the same.
Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.
2.-Program to an interface, not an implementation
3.-Favor composition over inheritance
4.-Strive for loosely coupled designs between objects that interact




*** Strategy Pattern ***
It defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

It's about pulling out the different behaviors than some classes could have, to a set of classes. It let you encapsulate a family of algorithms into their
own set of classes, as well as CHANGE BEHAVIOR AT RUNTIME.
Example: flying and quacking behaviors of es.islomar.designpatterns.strategy.Duck classes; each behavior get a set of classes.

Problem with inheritance: not all ducks have flying or quacking behavior.
Problem with just using interfaces: duplicate code, there's no code reuse.

GOAL: getting code reuse for behaviors.



*** Observer Pattern ***

It defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
Subjects and observers are loosely coupled.

java.util.Observable:
(+) setChanged() allows to only trigger the change if some condition meets (e.g. the difference of temperature is higher than 0.5 degree).
(-) Observable is a class, not an interface: you can not add the Observable behavior to an existing class that already extends another superclass.
