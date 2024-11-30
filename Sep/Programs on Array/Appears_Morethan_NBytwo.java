import java.util.*;
public class  Appears_Morethan_NBytwo
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
	
	
	/*
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
	 	int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	   }
	}
	
	int count = 1;
	for(int i=0;i<arr.length;i++)        // 1 1 1 2 2 2 3 3 3 3   // 9 
	{
	   if(count > arr.length/2)
	   {
		System.out.print(arr[i]+" appears more than lenght/2 times in the given array[]");
		break;
	   }
	   if(i == arr.length -1)
	   {
		System.out.println("\n no element occurs more than length/2 time");
		break;
	   }
		
	   if(arr[i] == arr[i+1])
	   {
		count++;
	   }
	   else
	   {
		count= 1;	
	   }	
	}
	
	
   }
}

*/