package First;

public class Thing  implements Comparable<Thing>{
	private int cost;
	private int mass;
	private int coff;
	Thing(int cos, int mas)
	{
	this.cost=cos;
	this.mass = mas;
	this.coff=mas/cos;
	}
	public void ReturnThing()
	{
		System.out.println("Mass - " +mass+" Cost - "+cost);
	}
	public int GetMass()
	{
		return mass;
	}
	public int GetCost()
	{
		return cost;
	}
	public int GetCoff()
	{
		return coff;
	}
	public void Replace(Thing th)
	{
		this.mass=th.GetMass();
		this.cost=th.GetCost();
		this.coff=th.GetCoff();
	}
	public int compareTo(Thing compareThing) {

        int compareCoff = ((Thing) compareThing).GetCoff();
       return compareCoff - this.GetCoff();

    }
}
