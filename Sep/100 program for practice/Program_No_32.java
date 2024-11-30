import java.util.*;
public class Program_No_32
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Nth term: ");
	int N=sc.nextInt();
	
	if(N % 2 == 1)
	{
	   int a=0,b=1,fibTerm=0;
	   int fibIndex=N/2;
	
	   for(int i=0;i<=fibTerm;i++)
	   {
		if(i == 0)
		{
		   fibTerm = a;
		}
		else if(i == 1)
		{
		   fibTerm = b;
		}
		else 
		{
		   fibTerm=a+b;
		   a=b;
		   b=fibTerm;
		}
	   }
	   System.out.println(fibTerm);
	}
	else
	{
	   int primeIndex= N/2;               // Prime number index for the even position
	   int count=0,num=1,primeTerm=0;
	   
	   while(count < primeIndex)           // Find the nth prime number
	   {
		num++;
		boolean isPrime = true;
		
		for(int i=2;i*i<=num;i++)      // Check if the number is prime
		{
		   if(num % i == 0)
		   {
			isPrime=false;
			break;
		   }
		}
		if(isPrime)
		{
		   count++;
		   primeTerm = num;
		}
	   }
	   System.out.println(primeTerm);
	}
   }
}