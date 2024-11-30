import java.util.*;
public class TableUsingWhile
{
   public static void main(String args[])
   {
	int i=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Nth no: ");
	int no=sc.nextInt();
	while(i<=10)
	{
	    System.out.println(no*i);
	    i++;  
	}
   }
}