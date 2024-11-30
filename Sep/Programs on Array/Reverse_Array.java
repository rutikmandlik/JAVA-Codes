import java.util.*;
public  class Reverse_Array
{
   public static void  main(String args[])
   {
      	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter 5 Input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int start=0;
	//int mid=arr.length/2;
	int end=arr.length-1;
	while(start<end)
	{
	   int temp=arr[start];
	   arr[start]=arr[end];
	   arr[end]=temp;
	   ++start;
	   --end;
	}
	System.out.print("Reversed Array is: ");
	for(int i=0;i<arr.length;i++)
	{
	  System.out.print(arr[i]);
 	}
   }
}