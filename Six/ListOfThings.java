package First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListOfThings {
ArrayList<Thing> things = new ArrayList<Thing>();
public void AddThing(int cos, int mas)
{
	Thing thing = new Thing(cos, mas);
	things.add(thing);
}
public void ReturnThings()
{
	for(Thing thing : things)
	{
		thing.ReturnThing();
	}
}
public void Sorting() 
{
	for (int i = things.size() - 1; i >= 1; i--){  
        for (int i1 = 0; i1 < things.size(); i1++){      
            if(things.get(i1).GetCoff() <= things.get(i1).GetCoff())  
            {
               if(things.get(i1).GetCost() < things.get(i1).GetCost())
               {
            	   Thing th = new Thing(1,1);
            	   th.Replace(things.get(i1));
            	   things.get(i1).Replace(things.get(i1+1));
            	   things.get(i1+1).Replace(th);
               }
            }
        }
    }	
}
}
