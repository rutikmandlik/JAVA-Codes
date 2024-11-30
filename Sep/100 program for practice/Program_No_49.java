import java.util.*;
public class Program_No_49
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
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
	   for(int j=[i]+1;j<[i+1];j++)
	   {
		System.out.print(j+" ");
		count++;
	   }
	   if(count != 0)
	   break;
	}
	
   }
}