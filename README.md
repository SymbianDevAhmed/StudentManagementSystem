# Student Management System

A simple Java application for managing students, courses, grades, and attendance.

## Features

- Add students
- Edit student information
- Delete students
- Add courses
- Edit course information
- Delete courses
- Record student grades
- Calculate student average grade
- Record student attendance
- Display attendance records

## OOP Concepts

This project demonstrates the following Object-Oriented Programming concepts:

- Encapsulation
- Inheritance
- Polymorphism

## Classes

- `Person` - Base class containing common student and instructor information.
- `Student` - Represents a student and extends `Person`.
- `Instructor` - Represents an instructor and extends `Person`.
- `Course` - Represents a course.
- `Grade` - Stores a student's grade for a course.
- `StudentManagementSystem` - Contains the main application logic and management methods.

## Technologies

- Java
- NetBeans
- Git
- GitHub

## How to Run

1. Open the project in NetBeans.
2. Build the project.
3. Run `StudentManagementSystem.java`.
4. The program will demonstrate student, course, grade, and attendance management.

## Project Structure

```text
StudentManagementSystem
├── nbproject
├── src
│   └── studentmanagementsystem
│       ├── Course.java
│       ├── Grade.java
│       ├── Instructor.java
│       ├── Person.java
│       ├── Student.java
│       └── StudentManagementSystem.java
├── build.xml
└── manifest.mf