[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Course Registration System using Composite Design Pattern for Course Modules


## Problem Statement (max 150 words)
Educational institutions manage courses that consist of multiple modules, sub-modules, and learning units arranged hierarchically. However, many traditional course registration systems treat courses as flat structures, making it difficult to represent relationships between modules and limiting flexibility in course organization.

This project proposes a Java-based Course Registration System that uses the Composite Design Pattern to model hierarchical course structures. The system allows both individual modules and grouped modules to be treated uniformly, enabling efficient course management. Students can register for courses, view structured module details, and manage their registrations.

The system focuses on applying object-oriented principles such as abstraction, inheritance, and polymorphism to ensure scalability, maintainability, and clean design while supporting file-based data storage and proper exception handling.


## Target User
University students for course registration and module viewing
Academic administrators for managing courses and modules


## Core Features
Student course registration and withdrawal
Display hierarchical course and module structure
Add, remove, and manage course modules
View module details and prerequisites
Store registration data using file handling
Input validation and exception handling


## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:
Abstraction:
A base interface or abstract class (CourseComponent) defines common operations for courses and modules.
Inheritance:
Classes like Course, Module, and SubModule inherit from CourseComponent.
Polymorphism:
Methods like displayDetails() and getCredits() behave differently for courses and modules.
Exception Handling:
Handles invalid inputs, duplicate registrations, and file I/O errors.
Collections / Threads:
Java Collections (ArrayList, HashMap) are used to manage students, courses, and registrations.

## Proposed Architecture Description
The system follows a modular architecture based on the Composite Design Pattern. A common component (CourseComponent) defines shared behavior. Composite classes (Course) contain multiple modules, while leaf classes (Module/SubModule) represent individual units.

A Student class manages user actions, and a RegistrationManager coordinates course enrollment using collections. File handling is used to store registration data persistently.

This architecture ensures scalability, code reuse, and clear separation of responsibilities while maintaining a structured representation of course hierarchies.

## How to Run
How to Run
Install Java Development Kit (JDK 8 or above)
Open the project in any IDE (e.g., Eclipse / IntelliJ) or use terminal
Compile all .java files:   javac *.java 
Run the main class: java Main
Follow the menu options to:
Register for courses
View course structure
Manage modules

## Git Discipline Notes
Minimum 10 meaningful commits required.
Initial commit - added main functionality
Added abstract CourseComponent class for composite pattern
fix: resolve name access issue in Module display method
feat: add Module class with credits and display functionality
Fix SubModule to use getter for name and ensure proper encapsulation
Enhance RegistrationException with default and parameterized constructors
Fix RegistrationManager syntax errors and improve registration logic
Fix FileHandler syntax errors and implement file saving functionality
fix:Added abstract CourseComponent class for composite pattern