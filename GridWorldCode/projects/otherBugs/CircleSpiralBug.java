import info.gridworld.actor.Bug;

public class CircleSpiralBug extends Bug
{
	private int length = 1;
	private int steps = 1;
	private int turns = 0;
	public CircleSpiralBug()
	{
	}
	public void act()
	{
		if(canMove() && steps < length)
		{
			move();
			steps++;
		}
		else if(turns %4 == 0)
		{
			turn();
			turns++;
			steps = 1;
			length++;
		}
		else
		{
			turn();
			turns++;
			steps = 1;
		}
	}
}