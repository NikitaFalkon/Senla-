

public class Nok {
	private int Nok;
	public void nok(int number1, int number2, int digit)
	{
		
		Nok = digit;
		for(int i=digit; i<=number1*number2; i++)
		{
		 if(i%number1==0 && i%number2==0) {Nok = i; break;}
		}
		System.out.println("Naimenshee objee kratnoe "+Nok);
	}
}
