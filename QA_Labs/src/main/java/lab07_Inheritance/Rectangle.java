package main.java.lab07_Inheritance;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    // Construct a Rectangle with its colour, position, and side lengths.
    public Rectangle(Color colour, Point position, double sideA, double sideB) {
        super(colour, position);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Return the area of the rectangle: sideA * sideB.
    public double getArea() {
        return sideA * sideB;
    }

    // Return the perimeter (circumference) of the rectangle: 2*(sideA + sideB).
    public double getCircumference() {
        return 2 * (sideA + sideB);
    }

    //  Return a String with all characteristics:
    //  delegates colour & position to super, then adds sides, area, and perimeter.
    @Override
    public String getCharacteristics() {
        String base = super.getCharacteristics();
        return String.format("%s, sideA: %.2f, sideB: %.2f, area: %.2f, perimeter: %.2f", base, sideA, sideB, getArea(), getCircumference());
    }
}