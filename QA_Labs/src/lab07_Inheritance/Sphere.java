package lab07_Inheritance;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {
    //Construct a Sphere with its colour, position, and radius.
    public Sphere(Color colour, Point position, double radius) {
        super(colour, position, radius);
    }

    // Calculate the volume of the sphere: 4/3 * PI * r^3.
    public double getVolume() {
        double r = getRadius();
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    // Return a String summarising all characteristics, including volume.
    @Override
    public String getCharacteristics() {
        String base = super.getCharacteristics();
        return String.format(
                "%s, volume: %.2f",
                base,
                getVolume()
        );
    }

    // Print the full set of characteristics to the console.
    @Override
    public void printCharacteristics() {
        System.out.println(getCharacteristics());
    }

}
