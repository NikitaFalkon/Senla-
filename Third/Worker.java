

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Worker{
	public static void sorting (ArrayList<String> words)
	  {
        Collections.sort(words);
	    for(String word : words)
	    {
	     System.out.print(word + " ");
	    }
	    System.out.println("");
	  }
	   public static void upper (ArrayList<String> words)
	   {
		   int i=0;
	    for (String word : words) {
	    word = word.substring(0, 1).toUpperCase() + word.substring(1);
	    System.out.print(word + " ");
	    i++;
	   }
	    System.out.println("");
	   } 
	  
}
