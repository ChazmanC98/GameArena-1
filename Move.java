public class Move
{
	String col;
	GameArena test;
	Ball b = new Ball(500,500,20, "RED"); 
	void run()
	{
		test.addBall(b);
	while (b.getXPosition() > -1)
	{
		double x = b.getXPosition(); 
			double y = b.getYPosition(); 
			if(test.downPressed() == true)
			{
				b.setYPosition(y+3);
			}
			else if(test.upPressed() == true)
			{
				b.setYPosition(y-3);
			}			
			else if(test.leftPressed() == true)
			{
				b.setXPosition(x-3);
			}			
			else if(test.rightPressed()== true)
			{
				b.setXPosition(x+3);
			}			
			else
			{
				
			}
			
			test.pause(); // CPUs are fast… wait a while.
	}
	}
}