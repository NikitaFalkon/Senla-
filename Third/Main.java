import java.util.Scanner;
import java.io.*;
import java.util.*;

class Main {
  public static void sorting (String[] words)
  {
    Arrays.sort(words);
    for(int i = 0; i<words.length; i++)
    {
     System.out.print(words[i] + " ");
    }
    System.out.println("");
  }
   public static void upper (String[] words, String Str )
   {
    int counter=0;
    for (String retval : Str.split(" ")) {
    words[counter] = retval.substring(0, 1).toUpperCase() + retval.substring(1);
    System.out.print(words[counter]);
    counter++;
   }
    System.out.println("");
   } 
  
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
String Str = in.nextLine();
int counter1=0;
for (String retval : Str.split(" ")){counter1++;}
String[] words = new String[counter1];
upper(words, Str);
System.out.println("word count "+counter1);
sorting(words);
}
}