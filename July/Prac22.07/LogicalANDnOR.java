//Write a program that checks if a given year is a leap year. 
//Use logical AND and OR operators in the condition.


import java.util.*;
public class LogicalANDnOR
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int year;
      System.out.print("Enter a Year: ");
      year=sc.nextInt();
      
      String res=(year % 4 == 0 &&(year % 100 != 0 || year % 400 ==0))? "Given Year is Leap Year" : "Given Year is not a Leap Year" ;
      System.out.print(res);
   }
}