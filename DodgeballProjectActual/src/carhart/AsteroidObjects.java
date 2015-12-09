package carhart;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author 322084039
 *
 */
public class AsteroidObjects extends MovingObject {
	private int radius;

	/**
	 * @param x
	 * @param y
	 * @param left
	 * @param right
	 * @param top
	 * @param bottom
	 */
	public AsteroidObjects(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left + 10, right - 10, top + 10, bottom - 10);
		// declares asteroid objects, sets size
		radius = 20;
		
	}

	/* (non-Javadoc)
	 * @see carhart.MovingObject#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		// sets the parameters for the asteroid objects
		int drawX = (int) getX() - radius;
		int drawY = (int) getY() - radius;

		g.setColor(Color.DARK_GRAY);
		g.fillOval(drawX, drawY, radius * 2, radius * 2);
	}

	/* (non-Javadoc)
	 * @see carhart.MovingObject#animateOneStep()
	 */
	@Override
	public void animateOneStep() {
		
		
	}
	
	/**
	 * @return
	 */
	public int getRadius() {
		return radius;
	}

}
