
import java.util.Scanner;
import java.util.*;
class Main {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
try {
int number = in.nextInt();
int comp=0;
for (int i = 2; i*i <= number; i++)
if (number % i == 0 && number%2==0) {System.out.println ("Composite"+" Even"); comp=0; break;}
else if (number % i == 0) {System.out.println ("Composite"); comp=0; break;}
else comp=1;
if(comp==1) System.out.println ("Prime");
}
catch (InputMismatchException number)
{
System.out.println("ERROR");
}
}
}