//Write a program that takes two integers and prints whether 
//both numbers are odd using both logical and bitwise operators.


import java.util.*;
public class LogicalBitwiseOperators
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Enter First Number: ");
      a=sc.nextInt();
      System.out.print("Enter Second Number: ");
      b=sc.nextInt();
     
      boolean res1=((a % 2 !=0) && (b % 2 !=0));
      boolean res2=((a & 1) !=0) && ((b & 1) !=0);
      


      String x=res1? "Both Numbers are Odd" : "Both numbers are Not Odd" ;
      String y=res2? "Both Numbers are Odd" : "Both numbers are Not Odd" ;

      System.out.print("Using Logical Operator: "+x);
      System.out.print("\nUsing Bitwise Operator: "+y);
      
   }
}
