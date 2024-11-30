import java.util.*;
public class Program_No_61
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter 5 input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]>arr[j])
		{
		   int temp=arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
		}
	   }
	}
	System.out.print("Enter Given Diff: ");
	int n=sc.nextInt();
	
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]<arr[j])
		{
		   int diff=arr[j]-arr[i];
		   if(diff==n)
		   {
			System.out.print("\nThe Pair are: ("+arr[i]+" , "+arr[j]+")");
			//break;
		   }
		   
		}
	   }
	}
   }
}