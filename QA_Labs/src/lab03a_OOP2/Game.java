package lab03a_OOP2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Game extends Canvas {

// create an array of 3 Shapes 
	private Shape[] shapes = new Shape[4];

// call this array balls
	Game() {
		// using full constructor
		shapes[0] = new Shape(12, 11, 50, 50, 5, 5, Color.RED, ShapeType.Rectangle);
		// using overloaded constructor (default blue oval)
		shapes[1] = new Shape(40, 100, 30, 30);
		// using new chaining constructor (black circle with specified speed)
		shapes[2] = new Shape(100, 150, 40, 3, 7);
		// another example
		shapes[3] = new Shape(200, 60, 80, 15, 5);

		Shape.setWorld(300, 300);

		JFrame frame = new JFrame("Bouncing Shapes");
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				updateAndRepaint();
			}
		}, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				timer.cancel();
			}
		});
	}

	private void updateAndRepaint() {
		for (Shape s : shapes) {
			s.move();
		}
		repaint();
	}

	public void paint(Graphics g) {
		// Background fill
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, Shape.worldW, Shape.worldH);

		// Border
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);

		// Delegate drawing to each ball
		for (Shape s : shapes) {
			s.draw(g);
		}
	}

	public static void main(String[] args) {
		// Lab 03 - Ball Bouncing Game
		System.out.println("Outputs for Lab03 - Bouncing Balls - opens in Canvas");
		new Game();

		// Lab 04 - Part 2 - Using String

		System.out.println("\nOutputs for Lab04 - Part 2 - Using String");
		String name = "Conor";
		System.out.println("Third Character: " + name.charAt(2));
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Characters:\t");
		for (char c : name.toCharArray()) {
			System.out.print(c + "\t");
		}
		System.out.println();

		String prefix = "Co";
		System.out.println("Starts with \"" + prefix + "\"? " + name.startsWith(prefix));

		String suffix = "nor";
		System.out.println("Ends with \"" + suffix + "\"? " + name.endsWith(suffix));
		System.out.println();

		char present = 'C';
		char absent = 'e';
		System.out.println("Index of '" + present + "': " + name.indexOf(present));
		System.out.println("Index of '" + absent + "': " + name.indexOf(absent));
		System.out.println();

		String fullname = name + " Bennett";
		System.out.println("Full name: " + fullname);
		System.out.println("\n");

		// Lab 04 - Part 3 - Using StringBuilder

		System.out.println("\nOutputs for Lab04 - Part 3 - Using StringBuilder");

		StringBuilder sb = new StringBuilder("Bruce Springsteen ");
		System.out.println("Before updates: " + sb);

		sb.append("is the artist ever");
		System.out.println("After append: " + sb.toString());

		int insertPlace = sb.indexOf("artist");
		sb.insert(insertPlace, "best ");
		System.out.println("After insert: " + sb.toString());

		int startPlace = sb.indexOf("artist");
		int endPlace = startPlace + "artist".length();
		sb.replace(startPlace, endPlace, "performer");
		System.out.println("After replace: " + sb.toString());

	}

}
