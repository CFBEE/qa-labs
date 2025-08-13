package main.java.lab12_AccessingFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Program {
    public static void main(String[] args) throws IOException {
        String[] courses = readCSV("course.txt");
        String[] trainers = readCSV("trainer.txt");

        String output =
                String.join(",", courses) + "\n" + String.join(",", trainers) + "\n";

        Files.write(Paths.get("trainersAndCourses.txt"), output.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

    private static String[] readCSV(String inFile) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(inFile))) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new String[0];
            }
            return line.split(",");
        }

    }

}
