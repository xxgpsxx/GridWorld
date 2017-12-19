import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
	private int size = 3;
	private int steps = 1;
	private Boolean finished = false;
	private int turns = 0;
	public ZBug()
	{
		setDirection(90);
		size = (int)(Math.random() * 5) + 4;
	}
	public ZBug(int size)
	{
		setDirection(90);
		this.size = size;
	}
	public void act()
	{
		if(!finished)
		{
			if(canMove() && steps < size)
			{
				move();
				steps++;
			}
			else if(turns == 0)
			{
				setDirection(225);
				turns++;
				steps = 1;
			}
			else if(turns == 1)
			{
				setDirection(90);
				turns++;
				steps = 1;
			}
			else if(turns == 2)
				finished = true;
		}
	}
}
