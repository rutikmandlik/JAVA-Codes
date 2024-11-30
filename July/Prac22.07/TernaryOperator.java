//Write a Java program that takes an integer input and uses the ternary operator 
//to print whether the number is even or odd.

import java.util.*;
public class TernaryOperator
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int no;
       System.out.print("Enter any Number: ");
       no=sc.nextInt();
  
       String result=(no%2==0)? "Given Number is Even" : "Given Number is Odd" ;
       System.out.print(result);
   }
}