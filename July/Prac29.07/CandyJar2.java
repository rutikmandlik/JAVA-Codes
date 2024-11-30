import java.util.*;
public class CandyJar2
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
        int n,k,m;
        System.out.print("Enter Number of Candie's Sold: ");
        m=sc.nextInt();
        n=10;
        k=n-m;

	if(k>=5)
	{
	   System.out.print("Available Candie's: "+k);
	}
	else
	{
	    System.out.print("Wrong Input");	
	}
   }
}