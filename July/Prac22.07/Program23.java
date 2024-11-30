import java.util.*;
public class Program23
{
	public static void main (String x[])
   {
	Scanner sc=new Scanner (System.in);
	int rem,no,rev=0,temp;
	System.out.println("Enter the number");
	no=sc.nextInt();
	temp=no;
	while(no!=0)
     {
	rem=no%10;
	no=no/10;
	rev=rev*10+rem;
     }

if(rev==temp)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("Not palindrome");

}
   }
}