import java.util.*;
public class Max_Value
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	
	int a[]=new int[5];
	System.out.println("Enter a Array Values");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	int max=a[0];
	System.out.println("Display input Values: "); 
	for(int j=0;j<a.length;j++)
	{
	   System.out.printf("%d\t",a[j]);
	   if(a[j]>max)
	   {
	 	max=a[j];
	   }
	}
	System.out.print("\nMax Value is: "+max);
	
   }
}
