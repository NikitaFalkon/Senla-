
import java.util.Scanner;
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
try {
int number1 = in.nextInt();
int number2 = in.nextInt();
int digit=1;
if(number1>number2) digit = number2;
else digit = number1;
Nod nod = new Nod();
nod.nod(number1, number2, digit);
Nok nok = new Nok();
nok.nok(number1, number2, digit);
}
catch (InputMismatchException number)
{
System.out.println("Error");
}
}
}