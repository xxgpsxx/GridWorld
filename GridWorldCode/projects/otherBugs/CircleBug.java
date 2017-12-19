import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
	private int side = 3;
	private int steps = 1;
	public CircleBug()
	{
		side = (int)(Math.random() * 4) + 2;
	}
	public CircleBug(int side)
	{
		this.side = side;
	}
	public void act()
	{
		if(canMove() && steps < side)
		{
			move();
			steps++;
		}
		else
		{
			turn();
			steps = 1;
		}
	}
}