import java.util.*;
public class CheckNo
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int no=sc.nextInt();
	if(no==0)   //to check no is Zero or not
	{
	   System.out.print("Number is Zero");
	}
	else if(no<0)    //to check no is negative or not
	{
	   System.out.print("Number is Negative");
	}
	else if(no>0)    //to check no is positive or not
	{
	   System.out.print("Number is Positive");
	}
   }
}