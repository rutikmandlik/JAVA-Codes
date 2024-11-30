import java.util.*;
public class WhileStrongOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,rem,sum=0,temp;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();
	temp=no;

	while(no>0)
	{
	   rem=no % 10;
	   int i=1,fact=1;
	   while(i<=rem)
	   {
		fact=fact * i;
		i++;
	   }
	   sum= sum + fact ;
	   no= no / 10;
	}
	if(sum == temp)
	{
	   System.out.println("Number is Strong");
	}
	else
	{
	   System.out.println("Number is Not Strong");
	}
   }
}