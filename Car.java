package animations;

//Will Backscheider
//6/27/2017

import javax.swing.JFrame;

public class Car 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarAnimationPanel panel = new CarAnimationPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
