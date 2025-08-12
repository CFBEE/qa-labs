package lab09_AbstractClasses;

public class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
        this.animalType = AnimalType.Fish;
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void move() {
        swim();
    }

    public void swim() {
        System.out.println(getName() + " the fish swims swiftly.");
    }
}
