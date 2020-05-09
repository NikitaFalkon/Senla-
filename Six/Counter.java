package First;

import java.util.ArrayList;

public class Counter {
public void Count(ArrayList<Thing> things, BackPack backpack)
{
	for(Thing thin : things)
	{
	if(thin.GetMass()<=backpack.GetMass())
	{
		backpack.Put(thin);
		thin.ReturnThing();
	}
	}
	System.out.println("Total cost - "+ backpack.GetCost());
}
}
