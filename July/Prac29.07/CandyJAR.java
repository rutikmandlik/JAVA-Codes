import java.util.*;
public class CandyJAR
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
 	int n,k,m;
 	System.out.print("Number of Candie's Sold: ");
        m=sc.nextInt();

        n=10;
        //k=5;
        
 	if(m>n)
 	{
 	    System.out.println("INVALID INPUT");
 	} 
      	else if(m>=0 && m<=5)
 	{
 	     int x=(n-m);
 	    System.out.println("Number of Candie's Available: "+x);
 	}
 	else
 	{
 	    System.out.println("INVALID INPUT");
 	}
   }
}