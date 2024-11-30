import java.util.*;
class Table
{
   int n;
   Scanner sc=new Scanner(System.in);
   void setNum()
   {
	System.out.print("Enter Number: ");
	n=sc.nextInt();
   }
   void printTable()
   {
	for(int i=1;i<=10;i++)
	{
	   System.out.println(n*i);
	}
   }
}
public class TableApp
{
   public static void main(String args[])
   {
	Table tb=new Table();
	tb.setNum();
	tb.printTable();
   }
}