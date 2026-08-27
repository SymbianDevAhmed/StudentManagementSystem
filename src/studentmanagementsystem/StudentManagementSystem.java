package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StudentManagementSystem {

    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<Grade> grades = new ArrayList<>();
    private static Map<Integer, Integer> attendance = new HashMap<>();
    
    public static void main(String[] args) {

        // Create student
        Student student1 = new Student(1, "Ahmed", 20);

        // Polymorphism with Student
        Person person = student1;
        person.displayInfo();

        // Create instructor
        Instructor instructor1 = new Instructor(2, "John", "Java");

        // Polymorphism with Instructor
        Person person2 = instructor1;
        person2.displayInfo();

        // Student management
        addStudent(student1);
        editStudent(1, "Mohamed", 21);

        // Course management
        Course course1 = new Course(101, "Java Programming", 3);
        addCourse(course1);
        editCourse(101, "Advanced Java", 4);

        // Grade management
        recordGrade(student1, course1, 85);
        System.out.println("Student Average: " + calculateGrade(student1));

        // Attendance management
        recordAttendance(student1, true);
        recordAttendance(student1, true);
        System.out.println("Attendance: " + getAttendance(student1));

        // Delete records
        deleteCourse(101);
        deleteStudent(1);
    }
    
    public static void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public static void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    public static void editCourse(int id, String newName, int newHours) {

        for (Course course : courses) {

            if (course.getId() == id) {
                course.setName(newName);
                course.setHours(newHours);

                System.out.println("Course updated successfully.");
                return;
            }
        }

        System.out.println("Course not found.");
    }
    
    public static void deleteCourse(int id) {

        boolean removed = courses.removeIf(course -> course.getId() == id);

        if (removed) {
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }
    
    public static void recordGrade(Student student, Course course, double score) {
        Grade grade = new Grade(student, course, score);
        grades.add(grade);

        System.out.println("Grade recorded successfully.");
    }
    
    public static void recordAttendance(Student student, boolean present) {

        if (present) {
            int studentId = student.getId();

            int currentAttendance = attendance.getOrDefault(studentId, 0);

            attendance.put(studentId, currentAttendance + 1);

            System.out.println(student.getName() + " is present.");
        } else {
            System.out.println(student.getName() + " is absent.");
        }
    }
    
    public static int getAttendance(Student student) {

        return attendance.getOrDefault(student.getId(), 0);
    }
    
    public static double calculateGrade(Student student) {

        double total = 0;
        int count = 0;

        for (Grade grade : grades) {

            if (grade.getStudent() == student) {
                total += grade.getScore();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return total / count;
        }

    public static void editStudent(int id, String newName, int newAge) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    
    public static void deleteStudent(int id) {

        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}