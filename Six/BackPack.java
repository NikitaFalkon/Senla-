package First;

public class BackPack {
private int mass=0; private int cost=0;
public void SetMass(int mas)
{
	this.mass=mas;
}
public int GetMass()
{
	return this.mass;
}
public void Put(Thing thing)
{
	this.mass=mass-thing.GetMass();
	this.cost=cost+thing.GetCost();
}
public int GetCost()
{
	return this.cost;
}
}
