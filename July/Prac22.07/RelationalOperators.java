import java.util.*;
public class RelationalOperators
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner (System.in);
      int a,b;
      System.out.print("Enter First Number: ");
      a=sc.nextInt();
      System.out.print("Enter Second Number: ");
      b=sc.nextInt();
    
      boolean x=a>b;
      boolean y=a<b;
      boolean z=a==b; 

      System.out.print("First number is Greater than Second: "+x);
      System.out.print("\nFirst number is Lesser than Second: "+y);
      System.out.print("\nFirst number is Equal to Second Number: "+z);
   }
}