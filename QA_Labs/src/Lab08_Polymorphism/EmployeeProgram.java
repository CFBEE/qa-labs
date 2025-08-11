package Lab08_Polymorphism;

public class EmployeeProgram {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "Project Manager");

        Employee dev1 = new Employee("Bob", "Developer");
        SkilledWorker dev2 = new SkilledWorker("Carol", "QA Engineer");
        dev2.addSkill("Automation");
        dev2.addSkill("DevOps");

        mgr.addEmployee(dev1);
        mgr.addEmployee(dev2);

        System.out.println(mgr.getInfo());
    }

}
