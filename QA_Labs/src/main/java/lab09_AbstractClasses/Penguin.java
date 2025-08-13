package main.java.lab09_AbstractClasses;

public class Penguin extends Bird implements Swimmable{

    public Penguin(String name) {
        super(name);
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
        System.out.println(getName() + " the penguin arranges a pebble nest on the shore.");
    }
}
