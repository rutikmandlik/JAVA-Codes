import java.util.*;
public class Max_Min
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	
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
	int Min=a[0];
        for(int j=0;j<a.length;j++)
	{
	   
	   if(a[j]<Min)
	   {
	 	Min=a[j];
	   }
	}
	
        System.out.print("\nMin Value is: "+Min);
	
   }
}
