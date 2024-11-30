import java.util.*;
class Duck
{
	
   int n;
   Scanner sc=new Scanner(System.in);
   void acceptNumber()
   {
	System.out.print("Enter a number: ");
	n=sc.nextInt();
   }
   boolean isDuck()
   {
	
	
	
	while(n!=0)
	{
	   int rem = n%10;
	   if(rem==0)
	   {
		return true;		
	   }
	   n = n/10;
	}	

	return false;
   }
}
public class DuckApp
{
   public static void main(String args[])
   {
	Duck dk=new Duck();
	dk.acceptNumber();
	if(dk.isDuck())
	   System.out.print("The number is Duck Number.");
	else
	   System.out.print("The number is not a duck number.");
   }
}
