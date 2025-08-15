package main.java.lab09_AbstractClasses;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
        this.animalType = AnimalType.Bird;
    }

    public abstract void move();

    public abstract void makeNest();
}
