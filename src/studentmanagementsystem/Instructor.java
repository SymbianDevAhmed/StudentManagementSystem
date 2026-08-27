package studentmanagementsystem;

public class Instructor extends Person {

    private String specialization;

    public Instructor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}