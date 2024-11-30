import java.util.*;
public class WhileOneToNStrongNo
{       
   public static void main(String args[])
   {   
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nth Number: ");
	int no=sc.nextInt();
	int Count = 0;
	int Num = 1;
	while(Count < no)
	{
	   int temp = Num;
	   int sum=0;
	   while(temp > 0)
	   {
		int fact= 1;
		int rem= temp % 10;
		int i = 1;
		while(i<=rem)
		{
		   fact=fact*i;
		   i++;
		}
		sum=sum+fact;
		temp=temp/10;
	   }
	   if(sum == Num)
	   		   
		System.out.print(Num+" ");
		Count++;
	   		   
		Num++;
	}
   }
}