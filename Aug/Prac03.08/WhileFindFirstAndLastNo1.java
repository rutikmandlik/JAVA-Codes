import java.util.*;
public class WhileFindFirstAndLastNo1
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int i,no,First,Last;
	System.out.println("Enter a 4 Digit number: ");
	no=sc.nextInt();
	i=0;	

	while(i<=no)
	{
	   First=no/1000;
	   Last=no%10;
	   System.out.println("First Number is: "+First);
	   System.out.println("Last Number is: "+Last);
	   break;
	}
	
   }
}