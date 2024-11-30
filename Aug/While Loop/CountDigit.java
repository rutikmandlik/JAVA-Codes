import java.util.*;
public class CountDigit
{
   public static void main(String args[])
   {
	int count=0,rem;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int no=sc.nextInt();
	while(no!=0)
	{
	   rem=no%10;
	   no=no/10;
	   count++;
	}
	System.out.print("Sum of Digits are: "+count);
   }
}