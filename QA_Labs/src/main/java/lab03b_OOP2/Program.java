package main.java.lab03b_OOP2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        try {
            log("Program started");
        } catch (IOException ioe) {
            System.err.println("Log failed: " + ioe.getMessage());
        }

        List<Vehicle> vehicles = new ArrayList<>();

        try {
            vehicles.add(new Vehicle(50, 1));
            vehicles.add(new Vehicle(80, 2));
            vehicles.add(new Vehicle(120, 3));
        } catch (OutOfPlatesException ex) {
            System.err.println("Cannot create vehicle: " + ex.getMessage());
            return;
        }

        List<String> drivers = Arrays.asList("Conor", "Dave", "Mike");

        Random rand = new Random();
        boolean winnerFound = false;

        while (!winnerFound) {
            for (int i = 0; i < vehicles.size(); i++) {
                Vehicle v = vehicles.get(i);
                int n = rand.nextInt(10) + 1;
                v.accelerate(n);

                System.out.printf("%s: %s%n", drivers.get(i), v.getDetails());

                if (v.getDistanceTravelled() >= 1000) {
                    String msg = String.format("Winner: %s (lane %d) – travelled %d m%n", drivers.get(i), v.getLane(),
                            v.getDistanceTravelled());
                    System.out.println(msg);
                    try {
                        log(msg);
                    } catch (IOException ioe) {
                        System.err.println("Log failed: " + ioe.getMessage());
                    }
                    winnerFound = true;
                    break;
                }
            }

        }

        // Print out each vehicle's details
        for (Vehicle v : vehicles) {
            System.out.println(v.getDetails());
        }
        String summary = "Total vehicles created: " + Vehicle.getCount();
        System.out.println(summary);

        try {
            log(summary);
        } catch (IOException ioe) {
            System.err.println("Log failed: " + ioe.getMessage());
        }
    }

    private static void log(String msg) throws IOException {
        File file = new File("log.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(msg + "\r\n");
        br.close();
        fr.close();
    }
}

