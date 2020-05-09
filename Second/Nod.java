package First;

public class Nod {
private int Nod =1;
public void nod(int number1, int number2, int digit)
{
	
	for(int i=1; i<=digit; i++)
	{
	if(number1%i==0 && number2%i==0) Nod = i;
	}
	System.out.println("Naibolshij objii delitel "+Nod);
}
}
