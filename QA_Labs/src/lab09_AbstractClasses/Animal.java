package lab09_AbstractClasses;

public abstract class Animal {
    public AnimalType animalType;
    private String name;

    public Animal(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return name + " (" + animalType + ")";
    }
}
