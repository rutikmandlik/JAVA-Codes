import java.util.*;
public class MaxNumApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter Two Numbers: ");
      System.out.printf("A= ");
      a=sc.nextInt();
      System.out.printf("B= ");
      b=sc.nextInt();
      
      String result=a>b? "A is Grater" : "B is Grater" ;
      System.out.println(result);
   }
}