import java.util.*;
public class RevApp
{
   public static void main(String args[])
   {    int rem,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int no=sc.nextInt();
	while(no!=0)
	{
	   rem=no%10;        //extract last digit
	   no=no/10;         //Delete last digit
	   rev=rev*10+rem;   //logic for reverse
	} 
	System.out.print("Reverse Number is: "+rev);
   }
}