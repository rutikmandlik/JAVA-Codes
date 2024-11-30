import java.util.*;
public class WashingMachine
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int w;
	System.out.println("Enter a Weight of Clothes(in grams): ");
	w=sc.nextInt();

	if(w==0)
	{
	   System.out.println("Estimate time is 0 Minutes");
	}
 	else if(w>0 && w<=2000)
	{
	   System.out.println("Estimate time is 25 Minutes");
	}
 	else if(w>=2001 && w<=4000)
	{
	   System.out.println("Estimate time is 35 Minutes");
	}
	else if(w>4000 && w<7000)
	{
	   System.out.println("Estimate time is 45 Minutes");
	}
	else if(w==7000)
	{
	   System.out.println("Machine is Overloaded");
	}
	else
	{
	   System.out.println("Invalid Input");
	}

   }
}