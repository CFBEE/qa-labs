package main.java.week1_recap;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Course javaCourse = new Course("Java Programming");
        Course dbCourse = new Course("Databases");
        courses.add(javaCourse);
        courses.add(dbCourse);

        Student stu1 = new Student("Alice", "Alice@hotmail.com", "S001");
        Student stu2 = new Student("Bob", "Bob@hotmail.com", "S002");
        Student stu3 = new Student("Conor", "Conor@hotmail.com", "S003");

        javaCourse.addStudent(stu1, 90);
        javaCourse.addStudent(stu2, 60);

        dbCourse.addStudent(stu2, 75);
        dbCourse.addStudent(stu3, 95);

        System.out.println("Students in Each Course");
        for (Course course : courses) {
            course.printStudentList();
        }
    }
}
