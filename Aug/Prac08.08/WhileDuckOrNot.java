import java.util.*;
public class WhileDuckOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,rem;
	boolean flag=false; 
	System.out.println("Enter a Number: ");
	no=sc.nextInt();

	while(no>0)
	{
	   rem=no%10;
	   if(rem == 0)
	   {
		flag=true;
		break;
	   }
	   no=no/10;
	}
	if(flag)
	{
	   System.out.println("Number is Duck Number");
	}
	else
	{
	   System.out.println("Number is Not Duck Number");
	}
   }
}