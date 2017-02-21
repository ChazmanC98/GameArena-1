public class Game
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(1000,500);
		Multi b = new Multi();
		b.test = a;
		b.run();
	}
}