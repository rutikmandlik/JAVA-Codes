import java.util.*;
public class WhileStrongNumber
{
   public static void main(String args[])
   {
      	Scanner sc=new Scanner(System.in);
	int num,i=1,fact=1,sum=0,temp;
	System.out.println("Enter a Number: ");
	num=sc.nextInt();
	temp=num;
	while(num>0)
	{
		int rem=num%10;
		i=1;fact=1;
		while(i<=rem)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(sum==temp)
	{
	   System.out.println("Number is Strong");
	}
	else
	{
	   System.out.println("Number is Not Strong");
	}
   }
}