import java.util.*;
public class IfFindMaxNum
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Enter first number: ");
      a=sc.nextInt();
      System.out.print("Enter Second number: ");
      b=sc.nextInt();

      if(a>b)
      {
         System.out.print("First Number is Maximum");
      }
      else
      {
         System.out.print("Second Number is Maximum");
      }
   }
}