import java.util.*;
public class Head
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[7];
	System.out.print("Enter Input: ");
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
   }
}