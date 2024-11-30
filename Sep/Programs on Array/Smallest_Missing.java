import java.util.*;
public class Smallest_Missing
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[8];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Sorted array is: ");
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
	   System.out.print(arr[i]+" ");
	}
	System.out.print("\nSmallest missing element is: ");
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=arr[i]+1;j<arr[i+1];j++)
	   {
		System.out.println(j+" ");
		count++;
		break;
	   }
	   if(count!=0)
	   break;
	}
	
   }
}