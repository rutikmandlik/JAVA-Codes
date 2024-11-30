import java.util.*;
class Factorial
{
   int n;
   void setNo(int m)
   {
	n=m;
   }
   void showFactorial()
   {
        int mul=1;
	for(int i=n;i>=1;i--)
	{
	  mul=mul*i;  
	}
        System.out.println("Factorial is: "+mul);
   }
}
public class FactorialApp
{
   public static void main(String arg[])
{
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Number: ");
   int val=sc.nextInt();
   Factorial f=new Factorial();
   f.setNo(val);
   f.showFactorial();
}
}