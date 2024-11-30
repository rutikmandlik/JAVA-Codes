import java.util.*;
public class WhileSumOfOddNo
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int i=1,sum=0,n;
	System.out.println("Enter the Number: ");
	n=sc.nextInt();
	
	while(i<=n)
	{
		if(i % 2 == 1)
		{
		   sum=sum+i;
		}
	   i++;
	}
	System.out.println("Sum of Odd Numbers is: "+sum);
   }
}