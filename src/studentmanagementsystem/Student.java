package studentmanagementsystem;

public class Student extends Person {

    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Age: " + age);
    }
}