import java.util.*;
public class Program_No_47
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter 5 inputs: ");
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
	System.out.print("Sorted array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	
	
	System.out.print("\nEnter the value of n: ");
	int n=sc.nextInt();
	
	
	int ceiling=-1;
	
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]>n)
	   {
		
		ceiling=arr[i];
		break;
	   }
	   else if(arr[arr.length-1]<n)
	   {
		
		ceiling=-1;
		break;
	   }
	   else if(arr[i]==n)
	   {
		
		ceiling=arr[i];
		break;
	   }
	   else if(arr[i]<n && arr[i+1]>n)
	   {
		
		ceiling=arr[i+1];
		break;
	   }
	}
	
	System.out.print("Ceiling of "+n+" is: "+ceiling);
   }
}