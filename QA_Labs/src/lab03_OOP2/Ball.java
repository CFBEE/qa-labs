package lab03_OOP2;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	public static int worldW;
	public static int worldH;

	private int x, y, w, h;
	private int dirX, dirY;
	private Color color;

	// Allows for adjusting world size in Game.java

	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}

	public Ball(int x, int y, int w, int h, int dirX, int dirY, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.color = color;
	}

	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, 1, 1, Color.BLUE);
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

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, w, h);
	}
}
