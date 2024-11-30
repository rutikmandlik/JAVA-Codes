import java.util.*;
class CheckArmstrong
{
   int no;
   void setValue(int number)
   {
	no=number;
   }
   boolean isArmstrong()
   {
	int n=no;
	int sum=0;
	int count=0;
	while(n != 0)
	{
	   n=n/10;
	   count++;
	}
	n=no;
	while(n != 0)
	{
	   int digit = n % 10;
	   sum += Math.pow(digit,count);
	   n = n/10;
	}
	return (sum == no);
   }
}
public class CheckArmstrongApp
{
   public static void main(String args[])
   {
	CheckArmstrong ca=new CheckArmstrong();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number: ");
	int no=sc.nextInt();
	ca.setValue(no);
	if(ca.isArmstrong())
	{
	   System.out.print("Number is Armstrong");
	}
	else
	{
	   System.out.print("Number is not a Armstrong");
	}
   }
}