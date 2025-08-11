package Lab08_Polymorphism;

import java.util.ArrayList;

public class Manager extends Employee {
    // Field - employees as an ArrayList
    private ArrayList<Employee> employees = new ArrayList<>();

    // Constructor for 'Manager'
    public Manager(String name, String jobTitle) {
        super(name, jobTitle);
    }

    // Create 'addEmployee' method
    public void addEmployee(Employee emp) {
        if (emp == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        employees.add(emp);
    }

    // Getter for the employees list
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // Builds a string with manager info followed by each employee's info
    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        // Manager's details
        sb.append(super.getInfo());

        // Team details
        sb.append("Team Members:\n");
        if (employees.isEmpty()) {
            sb.append("  None\n");
        } else {
            for (Employee e : employees) {
                sb.append(e.getInfo());
            }
        }
        return sb.toString();
    }

}
