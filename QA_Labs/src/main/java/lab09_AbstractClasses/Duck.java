package lab09_AbstractClasses;

public class Duck extends main.java.lab09_AbstractClasses.Bird implements main.java.lab09_AbstractClasses.Flyable, main.java.lab09_AbstractClasses.Swimmable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is waddling.");
    }

    @Override
    public void makeNest() {
        System.out.println(getName() + " the duck weaves a reed nest by the water.");
    }

}
