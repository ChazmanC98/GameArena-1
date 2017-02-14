public class Game
{
	public static void main(String[] args)
	{
		int yPos;
		int xPos;
		yPos = 0 + (int)(Math.random() * 500); 
		xPos = 1000 + (int)(Math.random() * 1500); 
		GameArena a = new GameArena(1000,500);
		Ball b = new Ball(xPos,yPos,20, "GREEN");
		a.addBall(b); 
		while (b.getXPosition() > -1)
		{
			double x = b.getXPosition() ; // Get current x co-ordinate
			if (x > 2)
			b.setXPosition(x-3); // Set position one pixel right
			else
			{
				yPos = 0 + (int)(Math.random() * 500); 
				xPos = 1000 + (int)(Math.random() * 1500);
				b.setXPosition(xPos);
				b.setYPosition(yPos);				// reset to zero when end of screen
			}
			a.pause(); // CPUs are fast… wait a while.
		}
	}
}