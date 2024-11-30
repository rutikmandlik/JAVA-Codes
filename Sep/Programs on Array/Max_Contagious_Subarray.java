import java.util.*;
public class Max_Contagious_Subarray
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.print("Enter input of array: ");
	for(int i=0;i<size;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter the length of the subarray : ");
	int k=sc.nextInt();
	System.out.println("\nThe contiguous subarrays of length " + k + " and their maximum values are:");
	for(int i=0;i<size - k;i++)
	{
	   int max = arr[i];
	   for(int j=i;j<i+k;j++)
	   {
		if(arr[j] > max)
		{
		   max = arr[j];
		}
		System.out.print(arr[j]+" ");
	   }
	   System.out.println("----> "+max);
	}
   }
}