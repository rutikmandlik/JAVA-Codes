//Write a program that performs bitwise AND, OR, and XOR operations on two integers and prints the results.


import java.util.*;
public class BitwiseANDnORnXOR
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Enter First Number: ");
      a=sc.nextInt();
      System.out.print("Enter Second Number: ");
      b=sc.nextInt();

      int x=a & b;
      int y=a | b;
      int z=a ^ b;
  
      System.out.print("After Applying Bitwise AND: "+x);
      System.out.print("\nAfter Applying Bitwise OR: "+y);
      System.out.print("\nAfter Applying Bitwise XOR: "+z);
   }
}