
import java.util.Scanner;
import java.util.*;
class Main {
    public static void counting(int N)
    {
     if(N<=100){
      for(int i=0; i+i<=N; i++)
      {
        if(i>11&&(i%10)*10+i/10<=N&&i/10!=i%10&&(i%10!=0))
        {
          System.out.println(i + " " + (i%10*10+i/10));
        }
      }
      }
      else System.out.print("Error");
    }
    public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Write a number");
      try {
      int N = scan.nextInt();
      counting(N);
      }
      catch (InputMismatchException number)
      {
      System.out.print("Error");
      }
			
    }
}