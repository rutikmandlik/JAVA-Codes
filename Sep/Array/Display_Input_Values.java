import java.util.*;
public class Display_Input_Values
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
	
	System.out.println("Display input Values: "); 
	for(int j=0;j<a.length;j++)
	{
	   System.out.printf("%d\t",a[j]);
	   
	}
	
	
   }
}
