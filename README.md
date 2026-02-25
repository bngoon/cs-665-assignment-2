
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | NGOON BOOKER               |
| Date         | 02/25/2026                 |
| Course       | Fall / Spring / Summer     |
| Assignment # | 2                          |

https://github.com/bngoon/cs-665-assignment-2

# Assignment Overview
The objective of this assignment is to design and implement a notification system for a delivery network using proper 
software design principles. In this scenario, a collection of shops must notify multiple freelance drivers when a new 
delivery request is created. The system must broadcast delivery requests to all available drivers without tightly 
coupling the shop to specific driver implementations. 

# GitHub Repository Link:
https://github.com/{YOUR_USERNAME}/cs-665-assignment-{ASSIGNMENT_NUMBER}

# Implementation Description

The implementation is flexible because it follows the Observer design pattern. The Shop class does not depend directly
on the Driver class. It depends on the Observer interface. This means we can easily add new types of observers in the
future without changing the Shop class.


The implementation is simple and easy to follow. Each class has a clear responsibility:
    
    Subject and Observer define contracts.
    Shop manages delivery requests and notifies drivers.
    Driver reacts to updates.
    DeliveryRequest is a simple data object.
    DriverStatus represents driver availability.

Notification logic is centralized inside notifyObservers() method in the Shop class. Notification is not duplicated
logic within each driver.

Avoiding duplicate code is important because it makes the system easier to maintain.
If I need to change how notifications work, I only modify one method instead of multiple locations.

Design Pattern Used
I used the Observer pattern from the Gang of Four design patterns.