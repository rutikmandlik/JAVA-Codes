import java.util.*;
public class EvenNoOnetoNth
{
   public static void main(String args[])
   {
	int i=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Nth Number:");
	int no=sc.nextInt();
	while(i<=no)
	{
	   if(i%2==0)
	   {
		System.out.println(i);
	   }
	   i++;
	}
   }
}