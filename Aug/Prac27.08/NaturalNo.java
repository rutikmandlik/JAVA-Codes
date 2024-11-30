//all natural numbers from 1 to n

import java.util.*;
public class NaturalNo
{  static int i=1;
   public static void main(String args[])
   {
  	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Nth Number: ");
	int no=sc.nextInt();
	showNo(no);          //calling
   }
   public static void showNo(int x) //Defination
   {
	if(i<=x)
	{
	   System.out.println(i);
	   ++i;
	   showNo(x);       //Recursion
	}
   }
}