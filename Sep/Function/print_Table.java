import java.util.*;
public class print_Table
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int no=sc.nextInt();
	showTable(no);
   }
   public static void showTable(int x)
   {
	for(int i=1;i<=10;i++)
	{
	   System.out.println(x*i);
	}
   }
}