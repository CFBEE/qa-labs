package main.java.week1_recap;

public class Student extends Person {
    private String studentId;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDetails() {
        return "ID: " + studentId + " " + super.getDetails();
    }
}
