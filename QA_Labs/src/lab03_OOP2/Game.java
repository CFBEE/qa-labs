package lab03_OOP2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Game extends Canvas {

// create an array of 3 balls 
	private Ball[] balls = new Ball[3];

// call this array balls
	Game() {
		balls[0] = new Ball(12, 11, 50, 50, 5, 5, Color.RED);
		balls[1] = new Ball(40, 100, 30, 30, 10, 5, Color.GREEN);
		balls[2] = new Ball(40, 100, 80, 30, 7, 15, Color.BLUE);
		Ball.setWorld(300, 300);

		JFrame frame = new JFrame("Bouncing Balls");
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
		for (Ball b : balls) {
			b.move();
		}
		repaint();
	}

	public void paint(Graphics g) {
		// Background fill
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, Ball.worldW, Ball.worldH);

		// Border
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);

		// Delegate drawing to each ball
		for (Ball b : balls) {
			b.draw(g);
		}
	}

	public static void main(String[] args) {
		new Game();
	}

}
