# Explanation of OOP Principles in UTMS
### (i) Abstraction (Abstract classes/interfaces):

The User abstract class defines a template for all user types, hiding implementation details.

Interfaces like Serviceable, Trackable, and Schedulable define contracts for vehicle behaviors without implementation.

### (ii) Encapsulation (Private data with getters/setters):

All classes keep critical data private (e.g., User credentials, Driver license info).

Access is controlled through public getter/setter methods (e.g., getLicenseNumber(), setEmail()).

### (iii) Inheritance (Base class with subclasses):

User is the base class with common attributes/methods.

Student, Lecturer, and TransportOfficer inherit from User and add specialized features.

### (iv) Polymorphism (Method overriding):

The requestTransport() method is overridden in each subclass to provide specialized behavior.

The processTransportRequest() method in TransportManagementSystem can accept any User subclass.

### (v) Interfaces for common behaviors:

Different vehicle types implement relevant interfaces (Bus implements all three, Van implements two).

This allows for flexible extension of vehicle capabilities.

### (vi) Customized behaviors through overriding:

Each user subclass provides its own implementation of requestTransport() reflecting their specific needs.

### (vii) Method overloading:

The assignDriver() method is overloaded to handle different parameter sets (vehicle object, vehicle type, or shift time).

This implementation demonstrates a clear understanding of OOP principles while addressing the requirements of the University Transport Management System.