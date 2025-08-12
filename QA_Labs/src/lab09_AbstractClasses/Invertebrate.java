package lab09_AbstractClasses;

public class Invertebrate extends Animal {

    public Invertebrate(String name) {
        super(name);
        this.animalType = AnimalType.Invertebrate;
    }

    public void crawl() {
        System.out.println(getName() + " the invertebrate crawls across the floor");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving.");
    }
}
