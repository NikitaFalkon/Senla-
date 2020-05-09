package First;
import java.util.Scanner;
import java.io.*;
import java.util.*;

class Main {
public static int Count(String word, String Str) 
{
	word = word.substring(0, 1).toUpperCase() + word.substring(1);
	int counter=0;
	for (String retval : Str.split(" ")) {
	retval = retval.substring(0, 1).toUpperCase() + retval.substring(1);
	if(retval.equals(word)){counter++;}
	}
	return counter;
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Write a text");
String Str = in.nextLine();
System.out.println("Write a word");
String word = in.nextLine();
int counter = Count(word, Str);
System.out.println(counter + " times");
}
}