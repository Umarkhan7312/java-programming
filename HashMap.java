import java.util.HashMap;

public class HashMapEx
{
 public static void main(String[] args) 
 {
HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("four", 4);
        hm.put("three", 3);
        hm.put("two", 2);
        hm.put("one", 1);
                System.out.println(hm.get("one"));
System.out.println(hm.get("two"));
System.out.println(hm.get("five"));
    }
}
