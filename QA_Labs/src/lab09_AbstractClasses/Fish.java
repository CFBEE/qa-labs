package lab09_AbstractClasses;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.animalType = AnimalType.Fish;
    }

    public void swim() {
        System.out.println(getName() + " the fish swims swiftly.");
    }
}
