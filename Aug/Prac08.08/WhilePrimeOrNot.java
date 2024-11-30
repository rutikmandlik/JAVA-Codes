import java.util.*;
public class WhilePrimeOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,i=2;
	boolean flag = false;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();
	
	while(i<=no/2)
	{
		if(no % i == 0)
		{
			flag=true;
    			break;
		}
		i++;
	}
	if(!flag)
	{
		System.out.println("Number is Prime");
	}
	else
	{
		System.out.println("Number is Not Prime");
	}
   }
}