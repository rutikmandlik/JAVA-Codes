import java.util.*;
public class EvenOddApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();   //take input number from user

	String result=(no % 2 == 0) ? "Number is Even" : "Number is Odd" ;  //check Even Odd using Conditional Operator
	System.out.println(result);	//print result
   }
}