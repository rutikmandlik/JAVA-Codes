import java.util.*;
public class SwapUsingBitwise
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Before Swapping: ");
      System.out.print("\nA= ");
      a=sc.nextInt();
      System.out.print("B= ");
      b=sc.nextInt();
   
      a=a^b;
      b=a^b;
      a=a^b;
      
      System.out.print("After Swapping: ");
      System.out.print("\nA= "+a);
      System.out.print("\nB= "+b);
      
   }

}