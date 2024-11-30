import java.util.*;
public class Program_No_30
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Nth position: ");
	int N=sc.nextInt();
	
	if(N % 2 == 1)
	{
	   int term= (int) Math.pow(2,(N-1)/2);
	   System.out.println(term);
	}
	else
	{
	   int term=(int) Math.pow(3, N/2-1);
	   System.out.println(term);
	}
   }
}