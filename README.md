# 🎓 Java OOP - Student Management System

> A Java Object-Oriented Programming project that simulates a simple student management system for managing students, courses, grades, and attendance through an interactive console menu.

---

## 📌 Project Overview

The project demonstrates how Java and **Object-Oriented Programming (OOP)** concepts can be used to build a simple management system.

The application allows the user to:

- Add students.
- Edit student information.
- Delete students.
- Add courses.
- Edit course information.
- Delete courses.
- Record student grades.
- Record student attendance.
- Display student information.
- Calculate student average grades.

---

## ✨ Features

### 👨‍🎓 **Student Management**

The system provides functionality for managing student information.

The available operations are:

- Adding a new student.
- Editing student name and age.
- Deleting a student.
- Searching for a student by ID.
- Preventing duplicate student IDs.

---

### 📚 **Course Management**

The system allows courses to be created and managed.

The available operations are:

- Adding a new course.
- Editing course name and hours.
- Deleting a course.
- Searching for a course by ID.
- Preventing duplicate course IDs.

---

### 📝 **Grade Management**

The system allows grades to be recorded for students and courses.

The available operations are:

- Selecting a student by ID.
- Selecting a course by ID.
- Recording a grade.
- Validating grades between 0 and 100.
- Calculating the student's average grade.
- Displaying courses and grades for each student.

---

### 🕒 **Attendance Management**

The system provides basic attendance tracking for students.

The available operations are:

- Selecting a student by ID.
- Recording whether the student is present.
- Tracking the number of recorded attendances.
- Displaying the attendance count for each student.

---

### 📊 **Student Display**

The system provides a summary of each student's information.

The displayed information includes:

- Student ID.
- Student name.
- Student age.
- Courses and grades.
- Attendance count.
- Average grade.

---

## 🧠 OOP Concepts Demonstrated

This project demonstrates the following Object-Oriented Programming concepts:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Constructors
- Getters and Setters
- Method Overriding

---

### 🔹 **Encapsulation**

Student, course, and grade data are stored in private fields and accessed through getters and setters.

---

### 🔹 **Inheritance**

The `Student` and `Instructor` classes extend the `Person` class.

```text
Person
├── Student
└── Instructor
```

---

### 🔹 **Polymorphism**

The project demonstrates polymorphism by using a `Person` reference to work with `Student` and `Instructor` objects.

---

### 🔹 **Method Overriding**

The `Student` and `Instructor` classes override the `displayInfo()` method inherited from `Person`.

---

## 🧠 Java Concepts Demonstrated

- `ArrayList` Collections
- `HashMap`
- `Scanner`
- CRUD-style operations
- User input handling
- Data validation
- Object relationships
- Collection management

---

## 🛠️ Technologies Used

<div align="center">

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Java%20Collections-5382A1?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Collections">
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
<img src="https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA">
<img src="https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white" alt="NetBeans">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git">
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">

</div>

---

## 🏗️ Project Structure

```text
StudentManagementSystem/
├── src/
│   └── studentmanagementsystem/
│       ├── Course.java
│       ├── Grade.java
│       ├── Instructor.java
│       ├── Person.java
│       ├── Student.java
│       └── StudentManagementSystem.java
├── nbproject/
├── build.xml
├── manifest.mf
├── README.md
└── .gitignore
```

---

## ▶️ How to Run

1. Open the project in NetBeans.
2. Open `StudentManagementSystem.java`.
3. Run the Java application.
4. Use the interactive menu to manage students, courses, grades, and attendance.

---

## 📋 Main Menu

```text
===== Student Management System =====

1. Add Student
2. Edit Student
3. Delete Student
4. Add Course
5. Edit Course
6. Delete Course
7. Record Grade
8. Record Attendance
9. Display Students
10. Exit
```

---

## 🔐 Data Validation

The application includes basic validation to improve data consistency.

The system:

- Prevents duplicate student IDs.
- Prevents duplicate course IDs.
- Checks whether a student exists before editing or deleting.
- Checks whether a course exists before editing or deleting.
- Checks whether a student exists before recording grades.
- Checks whether a course exists before recording grades.
- Validates grades between 0 and 100.

---

## 🎯 Learning Objective

The purpose of this project is to strengthen practical understanding of **Java Object-Oriented Programming** by building a simple interactive management system.

The project provides practical experience with:

- Managing collections of objects.
- Working with classes and objects.
- Applying inheritance and polymorphism.
- Using `ArrayList` to manage data.
- Using `HashMap` for attendance tracking.
- Handling user input with `Scanner`.
- Implementing CRUD-style operations.
- Using Git and GitHub for version control.

---

## 📖 Project Summary

This project combines Java fundamentals, Object-Oriented Programming, and Java Collections to create a simple console-based **Student Management System**.

It demonstrates how multiple classes can work together to manage students, courses, grades, and attendance through a single interactive application.

---

## 👨‍💻 Author

**Ahmed Gaber**