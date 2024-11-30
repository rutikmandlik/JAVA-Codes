import java.util.*;
public class Element_Occurrence
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter 5 elements in array: ");
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
	System.out.print("Sorted Array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	System.out.println();
	int count=1;
	for(int i=0;i<arr.length;i++)
	{
	   if(i == arr.length-1 && arr[i] == arr[i+1])
	   {
		count++;
	   }
	   else
	   {
	 	System.out.println(arr[i]+" ---- "+ count + " times");
		count=1;
	   }
	}
   }
}