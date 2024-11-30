import java.util.*;
public class WhileNeonOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,rem,sum=0;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();
	int temp=no;
	no=no*no;

	while(no>0)
	{
	   rem=no%10;
	   no=no/10;
	   sum=sum+rem;
	   
	}
	if(sum == temp)
	{
	   System.out.println("Number is Neon Number");
	}
	else
	{
	   System.out.println("Number is Not a Neon Number");
	}
   }
}