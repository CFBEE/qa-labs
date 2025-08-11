package lab07_Inheritance;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        // 1. Create individual shape instances
        Rectangle rectangle = new Rectangle(Color.RED, new Point(10, 20), 10.0, 15.0);
        Circle circle = new Circle(Color.BLUE, new Point(30, 40), 12.5);
        Sphere sphere = new Sphere(Color.GREEN, new Point(50, 60), 5.4);

        // 2. Print full characteristics of each shape
        System.out.println("Shape Details");
        System.out.println(rectangle.getCharacteristics());
        System.out.println(circle.getCharacteristics());
        System.out.println(sphere.getCharacteristics());

        // 3. Collect all shapes in a polymorphic list
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(sphere);

        // 4. Iterate and print colour and position
        System.out.println("\nColour & Position");
        for (Shape shape : shapes) {
            Color colour = shape.getColour();
            Point pos = shape.getPosition();
            System.out.printf("Colour: %s, Position: (%d, %d)%n", colour.toString(), pos.x, pos.y);
        }
    }
}