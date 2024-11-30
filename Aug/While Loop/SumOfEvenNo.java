import java.util.*;
public class SumOfEvenNo
{
   public static void main(String args[])
   {
	int i=1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Nth no: ");
	int no=sc.nextInt();
	while(i<=no)
	{
	   if(i%2==0)
	   {
		sum=sum+i;
	   }
	   i++;
	}
	System.out.print("Sum is: "+sum);
   }  
}