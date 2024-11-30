import java.util.*;
public class s2q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter input in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter index by which to rotate: ");
		int index=sc.nextInt();
		
		rotateArray(arr , index);
		
		System.out.println("Rotated array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void rotateArray(int arr[],int index)
	{	
		// Step 1: Reverse the first part of the array (from 0 to index - 1)
		reverse(arr, 0 , index-1);
		
		// Step 2: Reverse the second part of the array (from index to size - 1)
		reverse(arr, index , arr.length-1);
		
		// Step 3: Reverse the whole array
		reverse(arr, 0 ,arr.length-1);
	}
	public static void reverse(int arr[],int start,int end)
	{
		while(start < end)
		{
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}