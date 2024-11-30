import java.util.*;
class Power
{
   int B,I;
   void setValue(int b,int i)
   {
	B=b;
	I=i;
   }
   int getPower()
   {
	int res = 1;
	for(int i=0;i<I;i++)
	{
	   res *= B;
	}
	return res;
   }
}
public class PowerApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Base value: ");
	int b=sc.nextInt();
	System.out.print("Enter Index Value: ");
	int i=sc.nextInt();
	
	Power pr=new Power();
	pr.setValue(b,i);
	
	int result=pr.getPower();
	System.out.println("Result is: "+result);
   }
}