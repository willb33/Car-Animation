package animations;

//Will Backscheider
//6/27/2017

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
@SuppressWarnings("serial") 

public class CarAnimationPanel extends JPanel
{
	private int[] xCar = { 220, 370, 430, 500, 500, 450, 450, 370, 370, 230, 230, 150, 150, 100, 100, 180};
	private int[] yCar = { 100, 100, 180, 180, 300, 300, 250, 250, 300, 300, 250, 250, 300, 300, 180, 180};
	private int[] xWindow1 = { 230, 300, 300, 190};
	private int[] yWindow1 = { 110, 110, 180, 180};
	private int[] xWindow2 = { 320, 355, 410, 320};
	private int[] yWindow2 = { 110, 110, 180, 180};
	private int xTire1 = 150;
	private int yTire1 = 250;
	private int xTire2 = 370;
	private int yTire2 = 250;
	
	private final int WIDTH = 1200, HEIGHT = 600;
	private final int DELAY = 50;
	private Timer timer;
	private int moveX;
	
	
	public CarAnimationPanel()
	{
		timer = new Timer(DELAY, new MoveListener());
		moveX = 2;
		setBackground(Color.white);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		timer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.orange);
		page.fillPolygon(xCar, yCar, xCar.length);
		page.setColor(Color.black);
		page.fillOval(xTire1, yTire1, 80, 80);
		page.fillOval(xTire2, yTire2, 80, 80);
		page.setColor(Color.white);
		page.fillPolygon(xWindow1, yWindow1, xWindow1.length);
		page.fillPolygon(xWindow2, yWindow2, xWindow2.length);
	}
	
	private class MoveListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			for (int x = 0; x < xCar.length; x++)
			{
				xCar[x] += moveX;
			}
			for (int x = 0; x < xWindow1.length; x++)
			{
				xWindow1[x] += moveX;
			}
			for (int x = 0; x < xWindow2.length; x++)
			{
				xWindow2[x] += moveX;
			}
			
			xTire1 += moveX;
			xTire2 += moveX;
			
			repaint();
			
		}
	}

}
