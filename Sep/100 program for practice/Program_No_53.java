import java.util.*;
public class  Program_No_53
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[9];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter the value to check: ");
	int x=sc.nextInt();
	System.out.print("The Given Array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	System.out.println();
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]==x)
	   {
		count++;
	   }
	}
	if(count > arr.length/2)
	   {
		System.out.println(x + " appears more than " + arr.length / 2 + " times in the given array.");
	
	   }
	else
	{
	 	System.out.println(x + " does not appears more than " + arr.length / 2 + " times in the given array.");
	}
   }
}