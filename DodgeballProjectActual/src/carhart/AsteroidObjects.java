package carhart;
import java.awt.Color;
import java.awt.Graphics;

public class AsteroidObjects extends MovingObject {
	private int radius;

	public AsteroidObjects(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left + 10, right - 10, top + 10, bottom - 10);
		radius = 20;
		
	}

	@Override
	public void draw(Graphics g) {
		int drawX = (int) getX() - radius;
		int drawY = (int) getY() - radius;

		g.setColor(Color.DARK_GRAY);
		g.fillOval(drawX, drawY, radius * 2, radius * 2);
	}

	@Override
	public void animateOneStep() {
		
		
	}
	
	public int getRadius() {
		return radius;
	}

}
