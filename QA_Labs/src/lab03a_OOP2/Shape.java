package lab03a_OOP2;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	public static int worldW;
	public static int worldH;

	private int x, y, w, h;
	private int dirX, dirY;
	private Color color;

	// Lab 04 - Step 5
	private ShapeType shapeType;

	// Allows for adjusting world size in Game.java

	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}

	public Shape(int x, int y, int w, int h, int dirX, int dirY, Color color, ShapeType shapeType) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.color = color;
		this.shapeType = shapeType;
	}

	public Shape(int x, int y, int w, int h) {
		this(x, y, w, h, 1, 1, Color.BLUE, ShapeType.Arc);
	}

	public Shape(int x, int y, int w, int dirX, int dirY) {
		this(x, y, w, dirX, dirY, dirY, Color.BLACK, ShapeType.Oval);
	}

	public void move() {
		x += dirX;
		y += dirY;

		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}

		if (x > worldW - w) {
			x = worldW - w;
			dirX = -dirX;
		}
		if (y > worldH - h) {
			y = worldH - h;
			dirY = -dirY;
		}

	}

	// Lab 4 - Step 6 - Create a shapeType getter
	public ShapeType getShapeType() {
		return shapeType;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		switch (shapeType) {
		case Rectangle:
			g.fillRect(x, y, w, h);
			break;
		case ThreeDRectangle:
			g.fill3DRect(x, y, w, h, true);
			break;
		case RoundRectangle:
			g.fillRoundRect(x, y, w, h, 20, 20);
			break;
		case Oval:
			g.fillOval(x, y, w, h);
			break;
		case Arc:
			g.fillArc(x, y, w, h, 0, 180);
			break;
		}
	}
}
