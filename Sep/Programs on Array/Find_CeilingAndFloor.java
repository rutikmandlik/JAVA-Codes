import java.util.*;
public class  Find_CeilingAndFloor
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int[] arr={1,3,5,7,8,9};
	
	System.out.print("Given Sorted Array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<=10;i++)
	{
	   int floor=-1;
	   int ceiling=-1;
	   for(int j=0;j<arr.length;j++)
	   {
		if(arr[j]<=i)
		{
		   floor=arr[j];         //largest number less than or equal  to i
		}
		else if(arr[j]>= i && ceiling == -1)
		{
		   ceiling = arr[j];     // Smallest number greater than or equal to i
		}
	   }
	System.out.println("Number : "+ i +" Ceiling is: "+ ceiling +" Floor is: "+ floor);
	}
   }
}