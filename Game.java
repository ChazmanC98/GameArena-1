public class Game
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(1000,500);
		Assignment b = new Assignment();
		b.test = a;
		b.run();
	}
}