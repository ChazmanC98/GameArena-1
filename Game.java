public class Game
{
	public static void main(String[] args)
	{
		int yPos;
		yPos = 0 + (int)(Math.random() * 500); 
		GameArena a = new GameArena(1000,500);
		Ball b = new Ball(1000,yPos,20, "GREEN");
		a.addBall(b); 
		while (b.getXPosition() > 0)
		{
			double x = b.getXPosition() ; // Get current x co-ordinate
			if (x > 0)
			b.setXPosition(x-3); // Set position one pixel right
			else
			b.setXPosition(0); // reset to zero when end of screen
			a.pause(); // CPUs are fast… wait a while.
		}
	}
}