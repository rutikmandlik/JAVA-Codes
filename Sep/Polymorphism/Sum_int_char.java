import java.util.*;
public class Sum_int_char
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	char b[]=new char[5];
	System.out.print("Enter 5 integer input: ");
	for(int i=0;i<a.length;i++)
	   a[i]=sc.nextInt();
	System.out.print("Enter 5 char + integer input: ");
	for(int i=0;i<b.length;i++)
	   b[i]=sc.next().charAt(0);
	
	sum(a);
	sum(b);
   }
   public static void sum(int a[])
   {
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	   sum += a[i];
	}
	System.out.print("Sum of integers are: "+sum);
   }
   public static void sum(char b[])
   {
	int sum=0;
	for(int i=0;i<b.length;i++)
	{
	   if(b[i] >= 48 && b[i] <= 57 )
	   {
		sum += b[i] - 48;
	   }
	}
	System.out.print("\nSum of integers of char array: "+sum);
   }
} 