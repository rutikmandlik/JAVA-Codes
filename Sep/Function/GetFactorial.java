import java.util.*;
public class GetFactorial
{
   public static void main(String args[])
   {
 	int no;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Nubmber:");
	no=sc.nextInt();
	int result= getFactorial(no);
	System.out.print("Factorial is: "+result); 
   }
   public static int getFactorial(int x)
   {
	int f=1;
	for(int i=1;i<=x;i++)
	{
	   f=f*i;
	}
	return f;
   }
}