package lab05_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    // map and arrays
    private Map<String, Integer> animalMap;
    private String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
    private String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};

    // Default constructor
    public Zoo() {
        // Instantiate HashMap
        animalMap = new HashMap<>();

        // Add animals
        addAnimals(originalAnimals);
        addAnimals(newAnimals);

        // Display animals
        displayAnimalData();


    }

    // Add up each animal in array
    private void addAnimals(String[] animals) {
        for (String name : animals) {
            // if already seen then + 1
            if (animalMap.containsKey(name)) {
                animalMap.put(name, animalMap.get(name) + 1);
            } // If not seen start at 1
            else {
                animalMap.put(name, 1);
            }
        }
    }

    // Print and display animals and count
    private void displayAnimalData() {
        // TODO: Can this line be formatted as well?
        System.out.println("Animal       Count");
        for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
            // Formatting to provide alignment
            System.out.printf("%-12s %d%n", entry.getKey(), entry.getValue());
        }
    }

}
