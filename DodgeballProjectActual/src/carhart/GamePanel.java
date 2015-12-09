package carhart;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener {
	int width = 1000;
	int height = 600;

	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 30;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	AsteroidObjects[] ball = new AsteroidObjects[numBalls];
	int[] ballX = new int[numBalls];
	int[] ballY = new int[numBalls];
    /**
     * the position at which the last mouse down event happened
     **/
    int x = -1; 
    int y = -1;
    /**
     * Activate the mouse listener
     **/
    
    
    
	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Asteroid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();


	}

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.BLACK);
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new AsteroidObjects(50, 50, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));			
		}
		addMouseMotionListener (this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 15, 15);
	}
	


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// tracks the movement of the mouse and determines whether it has collided with one of the balls
		// triggers change in background colour to denote collision and therefore failure
		 x = e.getX ();
		 y = e.getY ();
		 for (int i = 0; i < numBalls; i++) {
			 ballX[i] = (int) ball[i].getX();
			 ballY[i] = (int) ball[i].getY();
				 if (x-15 <= ballX[i] && x+15 >= ballX[i] && y-15 <=ballY[i] && y+15 >= ballY[i]) {
					 this.setBackground(Color.RED);
				 }
			 }
		 repaint();
		 }
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX ();
		y = e.getY ();
		for (int i = 0; i < numBalls; i++) {
			 ballX[i] = (int) ball[i].getX();
			 ballY[i] = (int) ball[i].getY();
				 if (x-15 <= ballX[i] && x+15 >= ballX[i] && y-15 <=ballY[i] && y+15 >= ballY[i]) {
					 this.setBackground(Color.RED);
				 }
			 }
		repaint ();
	}		
}
	
