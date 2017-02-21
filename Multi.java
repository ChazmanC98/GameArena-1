public class Multi
{
	int yPos;
	int xPos;
	int i = 10;
	int[] speed = new int[i];
	String[] col = new String[i];
	GameArena test;
	Ball[] b = new Ball[i]; 
	void run()
	{
		for (i = 0 ; i < b.length; i++)
		{
			if (i%2 == 0)
			{
				col[i] = "GREEN";
			}
			else
			{
				col[i] = "RED";
			}
			b[i] = new Ball(1000+(int)(Math.random() * 100), (int)(Math.random() * 500), 20, col[i] );
			speed[i] = (int)(Math.random() * 10);
			test.addBall(b[i]);
		}
		while(true)
		{
			for(i=0;i<b.length;i++)
			{
				
				double x = b[i].getXPosition() ; // Get current x co-ordinate
				if (x > 2)
					b[i].setXPosition(x-speed[i]); // Set position one pixel right
				else
				{
					yPos = 0 + (int)(Math.random() * 500); 
					xPos = 1000 + (int)(Math.random() * 1500);
					b[i].setXPosition(xPos);
					b[i].setYPosition(yPos);				// reset to zero when end of screen
				}
			}
			test.pause(); // CPUs are fast… wait a while.
		}
	}

}