import java.util.*;
public class Digit_Search
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	boolean flag=false;
	int a[]=new int[5];
	System.out.println("Enter a Array Values");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.print("Enter a Value You want to search: ");
	int skey=sc.nextInt();
	System.out.println("Display input Values: "); 
	for(int j=0;j<a.length;j++)
	{
	   System.out.printf("%d\t",a[j]);
	   if(a[j]==skey)
	   {
	      	flag=true;
		//break;
	   }
	}
	if(flag)
	{
	   System.out.print("\nValue Found");
	}
	else
	{
	   System.out.print("\nValue Not Found");
	}
	
   }
}
