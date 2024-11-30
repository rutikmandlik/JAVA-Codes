//Write a program that takes a boolean input and prints its negation using the logical NOT operator.


import java.util.*;
public class LogicalNOT
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       boolean a;
       System.out.print("Enter a Boolean Value(True/False): ");
       a=sc.nextBoolean();
 
       boolean negation= !a;
       System.out.print("Negation is: "+negation);
 
   }
}