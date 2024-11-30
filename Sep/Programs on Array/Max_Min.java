import java.util.*;
public class Max_Min
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter a input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int Max=arr[0];
	int Min=arr[0];
	for(int j=0;j<arr.length;j++)
	{
	    if(arr[j]>Max)
	    {
	    	Max=arr[j];
	    }
	}
	System.out.print("\nMaximum element is: "+Max);
	for(int j=0;j<arr.length;j++)
	{
	   if(arr[j]<Min)
	   {
	 	Min=arr[j];
	   }
	}
	System.out.print("Minimum element is: "+Min);
   }
}