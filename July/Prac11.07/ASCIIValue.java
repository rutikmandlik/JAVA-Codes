import java.util.*;
public class ASCIIValue
{
   public static void main(String args[])
   {
      Scanner x=new Scanner(System.in);
      
      System.out.println("Enter character");
      char r=x.next().charAt(0);
      /*int ascii=(int)r;*/
      System.out.println("ASCII is: "+(int)r);
   }
}