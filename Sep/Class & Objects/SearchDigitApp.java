import java.util.*;
class SearchDigit
{
   int n;
   void setNum(int no)
   {
	n=no;
   }
   boolean isPresent(int skey)
   {
	int temp = n;
	while(temp != 0)
	{
	   int digit = temp % 10;
	   if(digit==skey)
	   {
		return true;
	   }
	   temp = temp/10;
	}
	return false;
   }
}
public class SearchDigitApp
{
   public static void main(String args[])
   {
	SearchDigit sd=new SearchDigit();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number: ");
	int n=sc.nextInt();
	System.out.print("Enter Digit you want to search: ");
	int x=sc.nextInt();
	sd.setNum(n);
	
	if(sd.isPresent(x))
	{
	   System.out.print("Digit Found");
	}
	else
	{
	   System.out.print("Digit Not Found");
	}
	
   }
}