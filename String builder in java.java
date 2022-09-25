public class Program
{
 public static void main(String[] args) 
 {
    String s1 = "Hi";
    String s2 = new String("hye");
    
    StringBuilder s3 = new    StringBuilder("hello");
    
    StringBuffer s4 = new StringBuffer("Helloo");
    
    
   s3.replace(5,5," sir");
   System.out.println(s3);
   
   s4.replace(5,5," sir");
   System.out.println(s4);
   
   
 }
}
