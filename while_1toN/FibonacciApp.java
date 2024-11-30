import java.util.*;
public class FibonacciApp
{
public static void main(String args[])
	{
	Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value");
	int n=sc.nextInt();
	int x=0,y=1,z=0;
		while(z<=n)
		{
		System.out.println(z);
		x=y;
		y=z;
		z=x+y;
		}
	
	}

}