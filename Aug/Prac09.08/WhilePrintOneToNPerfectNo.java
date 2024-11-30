import java.util.*;
public class WhilePrintOneToNPerfectNo
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nth Number: ");
	int n=sc.nextInt();

	int Count= 0;
	int Num= 1;
	while(Count < n)
	{
	   int sum=0;
	   int k=1;
	   while(k <= Num/2)
	   {
		if(Num % k == 0)
		{
		   sum=sum + k;
		}
		k++;
	   }
	   if(sum == Num)
	   
		System.out.print(Num+" ");
		Count++;
	   
	   Num++;
	}
   }
}