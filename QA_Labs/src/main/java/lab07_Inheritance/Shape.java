package main.java.lab07_Inheritance;

import java.awt.Color;
import java.awt.Point;

public class Shape {
    private Color colour;
    private Point position;

    public Shape(Color colour, Point position) {
        this.colour = colour;
        this.position = position;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    // Return a string summarising colour and position.
    // Subclasses can extend or override for more details.
    public String getCharacteristics() {
        return String.format("Colour: %s, Position: (%d, %d)", colour.toString(), position.x, position.y);
    }
}
