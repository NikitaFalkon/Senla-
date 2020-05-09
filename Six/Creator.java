package First;

import java.util.Scanner;

public class Creator {
	Scanner scan = new Scanner(System.in);
	public void Creating(ListOfThings lis)
{
		
		System.out.println("How many  things you want to create?");
		int i = scan.nextInt();
		for(int i1 = 0; i1 < i; i1++)
		{
			System.out.println("Write the cost of this thing");
			int mass = scan.nextInt();
			System.out.println("Write the mass of this thing");
			int cost= scan.nextInt();
			lis.AddThing(cost, mass);
		}
}
	public void CreateBack(BackPack back)
	{
		System.out.println("Write the mass of a backpack?");
		int i = scan.nextInt();
		back.SetMass(i);
	}

}
