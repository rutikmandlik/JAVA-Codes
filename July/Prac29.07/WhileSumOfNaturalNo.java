import java.util.*;
public class WhileSumOfNaturalNo
{
   public static void main(String args[])
   {
   	Scanner sc=new Scanner(System.in);
	int i=1,sum=0,n;
	System.out.println("Enter the Number: ");
	n=sc.nextInt();

	while(i<=n)
	{
		sum=sum+i;
		
		i++;
	}
	System.out.println("Sum is: "+sum);
   }
}