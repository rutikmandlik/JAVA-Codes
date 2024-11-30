import java.util.*;
public class WhileOneToNthPrimeNo
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int i=1,n;
	System.out.println("Enter a Nth Number: ");
	n=sc.nextInt();

	while(i<=n)
	{
	   int j=1,count=0;
	   while(j<=i)
	   {
		if(i % j == 0)
		{
		   count++;
		}
		j++;
	   }
	   if(count == 2)
	   
	      System.out.print(i+" ");
	      i++;
	   
	}
   }
}