package lab07_Inheritance;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {
    private double radius;

    // Construct a Circle with its colour, position, and radius.
    public Circle(Color colour, Point position, double radius) {
        super(colour, position);
        this.radius = radius;
    }

    // Return the circle’s radius.
    public double getRadius() {
        return radius;
    }

    // Updates the circle’s radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Return the diameter: 2 * radius.
    public double getDiameter() {
        return 2 * radius;
    }

    // Return the area: PI * r^2.
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Return the circumference: 2 * PI * r.
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Builds a detailed characteristics string including radius, diameter,
    // area, and circumference.
    @Override
    public String getCharacteristics() {
        String base = super.getCharacteristics();
        return String.format(
                "%s, radius: %.2f, diameter: %.2f, area: %.2f, circumference: %.2f",
                base,
                radius,
                getDiameter(),
                getArea(),
                getCircumference()
        );
    }

    // Print the full set of characteristics to the console.
    public void printCharacteristics() {
        System.out.println(getCharacteristics());
    }

}
