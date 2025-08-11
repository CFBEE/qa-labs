package lab09_AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Daffy"));
        animals.add(new Penguin("Happy Feet"));
        animals.add(new Fish("Nemo"));
        animals.add(new Invertebrate("Colin"));


        for (Animal animal : animals) {
            System.out.println(animal);

            if (animal instanceof Bird b) {
                b.makeNest();
            }
            if (animal instanceof Fish f) {
                f.swim();
            }
            if (animal instanceof Invertebrate i) {
                i.crawl();
            }

            System.out.println("---");
        }
    }
}