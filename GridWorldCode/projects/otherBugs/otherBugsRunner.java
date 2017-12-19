import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class otherBugsRunner
{
	public otherBugsRunner()
	{
		ActorWorld world = new ActorWorld();
		world.add(new CircleBug());
		world.add(new CircleSpiralBug());
		world.show();
	}
	public static void main(String args[])
	{
		otherBugsRunner app = new otherBugsRunner();
	}
}