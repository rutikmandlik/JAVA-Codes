import java.util.*;
public class Missing_element
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter a Input: ");
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
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	   }
	}
	System.out.print("Array with Missing Values: ");
	for(int i=0;i<arr.length-1;i++)
	{
 	   for(int j=arr[i]+1;j<arr[i+1];j++)
	   {
	   	 System.out.print(j+" ");  
	   }
	}
   }
}