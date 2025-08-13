package main.java.week1_recap;

import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<Student, Integer> studentGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(Student s, int grade) {
        studentGrades.put(s, grade);
    }

    public void printStudentList() {
        System.out.println("Course: " + courseName);
        for (Student s : studentGrades.keySet()) {
            System.out.println(" - " + s.getDetails() + " - Grade: " + studentGrades.get(s));
        }
    }
}
