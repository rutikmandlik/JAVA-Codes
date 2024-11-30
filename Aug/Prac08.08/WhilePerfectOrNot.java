import java.util.*;
public class WhilePerfectOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,rem,sum=0;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();
	int i=1;

	while(i<no)
	{
	   rem=no % i;
	   if(rem==0)
	   {
	      sum=sum + i;
	   }
	   i++;
	}
	if(sum == no)
	{
	   System.out.println("Number is Perfect");
	}
	else
	{
	   System.out.println("Number is Not Perfect");
	}
   }
}