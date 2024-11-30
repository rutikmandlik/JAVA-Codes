import java.util.*;
public class SumOfFstAndLstDigit
{
   public static void main(String args[])
   {
	int rem,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int no=sc.nextInt();
	int temp=no;
	rem=no%10;
	no=temp;
	while(no>=10)
	{
	   no=no/10;
	}
	sum=rem+no;
	System.out.print("Sum is: "+sum);
   }
}