import java.util.*;
public class WhileArmstrongNumber
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,temp,rem,rev=0,sum=0,count=0;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();
	temp=no;

 	while(no != 0)
	{
	   no=no/10;
	   ++count;
	}
	no=temp;
	
	while(no != 0)
	{
	   rem=no%10;
	   no=no/10;
	   int p=1;
           int j=1;
	   while(j<=count)
	   {
		p=p*rem;
		j++;
	   }
	   sum=sum+p;
	}
	if(sum == temp)
	{
	   System.out.println("Number is Armstrong Number");
	}
	else
	{
	   System.out.println("Number is Not Armstrong Number");
	}
   }
}