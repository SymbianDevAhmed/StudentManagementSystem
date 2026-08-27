package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {

    private static final List<Student> students = new ArrayList<>();
    private static final List<Course> courses = new ArrayList<>();
    private static final List<Grade> grades = new ArrayList<>();
    private static final Map<Integer, Integer> attendance = new HashMap<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Course");
            System.out.println("5. Edit Course");
            System.out.println("6. Delete Course");
            System.out.println("7. Record Grade");
            System.out.println("8. Record Attendance");
            System.out.println("9. Display Students");
            System.out.println("10. Exit");

            System.out.print("\nChoose an option: ");
            int choice = input.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.print("Enter student ID: ");
                int studentId = input.nextInt();

                input.nextLine();

                System.out.print("Enter student name: ");
                String studentName = input.nextLine();

                System.out.print("Enter student age: ");
                int studentAge = input.nextInt();

                Student student = new Student(studentId, studentName, studentAge);

                addStudent(student);
            }

            case 2 -> {
                System.out.print("Enter student ID: ");
                int editStudentId = input.nextInt();

                input.nextLine();

                System.out.print("Enter new name: ");
                String newName = input.nextLine();

                System.out.print("Enter new age: ");
                int newAge = input.nextInt();

                editStudent(editStudentId, newName, newAge);
            }

            case 3 -> {
                System.out.print("Enter student ID: ");
                int deleteStudentId = input.nextInt();

                deleteStudent(deleteStudentId);
            }

            case 4 -> {
                System.out.print("Enter course ID: ");
                int courseId = input.nextInt();

                input.nextLine();

                System.out.print("Enter course name: ");
                String courseName = input.nextLine();

                System.out.print("Enter course hours: ");
                int courseHours = input.nextInt();

                Course course = new Course(courseId, courseName, courseHours);

                addCourse(course);
            }

            case 5 -> {
                System.out.print("Enter course ID: ");
                int editCourseId = input.nextInt();

                input.nextLine();

                System.out.print("Enter new course name: ");
                String newCourseName = input.nextLine();

                System.out.print("Enter new course hours: ");
                int newCourseHours = input.nextInt();

                editCourse(editCourseId, newCourseName, newCourseHours);
            }

            case 6 -> {
                System.out.print("Enter course ID: ");
                int deleteCourseId = input.nextInt();

                deleteCourse(deleteCourseId);
            }

            case 7 -> {
                System.out.print("Enter student ID: ");
                int gradeStudentId = input.nextInt();

                Student gradeStudent = findStudentById(gradeStudentId);

                if (gradeStudent == null) {
                    System.out.println("Student not found.");
                    break;
                }

                System.out.print("Enter course ID: ");
                int gradeCourseId = input.nextInt();

                Course gradeCourse = findCourseById(gradeCourseId);

                if (gradeCourse == null) {
                    System.out.println("Course not found.");
                    break;
                }

                System.out.print("Enter score: ");
                double score = input.nextDouble();

                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Score must be between 0 and 100.");
                    break;
                }

                recordGrade(gradeStudent, gradeCourse, score);
            }

            case 8 -> {
                System.out.print("Enter student ID: ");
                int attendanceStudentId = input.nextInt();

                Student attendanceStudent = findStudentById(attendanceStudentId);

                if (attendanceStudent == null) {
                    System.out.println("Student not found.");
                    break;
                }

                System.out.print("Is the student present? (true/false): ");
                boolean present = input.nextBoolean();

                recordAttendance(attendanceStudent, present);
            }

            case 9 -> {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                    break;
                }

                System.out.println("\n===== Students =====");

                for (Student student : students) {

                    student.displayInfo();

                    System.out.println("Courses and Grades:");

                    boolean hasGrades = false;

                    for (Grade grade : grades) {

                        if (grade.getStudent() == student) {

                            System.out.println(
                                    "- " + grade.getCourse().getName()
                                    + ": " + grade.getScore()
                            );

                            hasGrades = true;
                        }
                    }

                    if (!hasGrades) {
                        System.out.println("- No courses or grades recorded.");
                    }

                    System.out.println("Attendance: " + getAttendance(student));
                    System.out.println("Average Grade: " + calculateGrade(student));
                    System.out.println("--------------------");
                }
            }

            case 10 -> {
                System.out.println("Exiting program...");
                input.close();
                return;
            }

            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}
        
    public static void addStudent(Student student) {

        if (findStudentById(student.getId()) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    public static Student findStudentById(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

    return null;
    }
    
    public static void addCourse(Course course) {

        if (findCourseById(course.getId()) != null) {
            System.out.println("Course ID already exists.");
            return;
        }

        courses.add(course);
        System.out.println("Course added successfully.");
    }
    public static Course findCourseById(int id) {

        for (Course course : courses) {

            if (course.getId() == id) {
                return course;
            }
        }

        return null;
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