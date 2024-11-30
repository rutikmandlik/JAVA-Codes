import java.util.*;
public class LeapYearApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int year;
	System.out.println("Enter a Year: ");
	year=sc.nextInt();   //take input year from user

	String res=(year%4==0 && year%100!=0 || year%400==0) ? "It is a Leap Year" :
							       "It is Not a Leap year" ;   //Check using Conditional Operator 
	System.out.println(res);    //print result
   }
}