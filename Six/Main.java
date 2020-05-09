package First;

import java.util.Scanner;
import java.util.*;
class Main {

public static void main(String[] args) {
ListOfThings lis = new ListOfThings();
Creator create = new Creator();
BackPack back = new BackPack();
create.Creating(lis);
create.CreateBack(back);
lis.Sorting();
lis.ReturnThings();
Counter counting = new Counter();
System.out.println("-----------------");
counting.Count(lis.things, back);
}
}
