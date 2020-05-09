
import java.util.Scanner;
import java.io.*;
import java.util.*;

class Main {
public static void Counting(String Str, ArrayList<String> words)
	{
		for (String word : Str.split(" "))
		{
			if(!word.equals("-"))
				{words.add(word);}
		}
	}
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
String Str = in.nextLine();
Worker work = new Worker();
ArrayList<String> words = new ArrayList();
Counting(Str, words);
work.upper(words);
System.out.println("word count "+words.size());
work.sorting(words);
}
}