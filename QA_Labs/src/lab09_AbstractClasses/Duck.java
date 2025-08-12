package lab09_AbstractClasses;

public class Duck extends Bird implements Flyable, Swimmable {

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
