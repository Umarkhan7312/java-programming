
import java.util.ArrayList;
import java.util.Collections;

public class MyClass 
{
 public static void main(String[ ] args)       
 {
ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.remove("four");
        
        System.out.println(al);
Collections.sort(al);
        System.out.println(al);
Collections.reverse(al);
        System.out.println(al);
    }
}
