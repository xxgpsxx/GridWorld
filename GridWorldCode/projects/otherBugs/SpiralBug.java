import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
	private int length = 1;
	private int steps = 1;
	private int turns = 0;
	public SpiralBug()
	{
	}
	public void act()
	{
		if(canMove() && steps < length)
		{
			move();
			steps++;
		}
		else
		{
			turn();
			turn();
			turns++;
			steps = 1;
			length++;
		}
	}
}