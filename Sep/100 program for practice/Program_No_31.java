import java.util.*;
public class Program_No_31
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Nth term: ");
	int N=sc.nextInt();
	
	if(N % 2 == 1)
	{
	   System.out.println(N-1);
	}
	else
	{
	   System.out.println((N-2)/2);
	}
   }
}