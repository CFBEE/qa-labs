package lab09_AbstractClasses;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeNest() {
        System.out.println(getName() + " the penguin arranges a pebble nest on the shore.");
    }
}
