import java.util.*;
public class RotateArray
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter the Position to rotate from: ");
	int N=sc.nextInt();
	if (N < 0 || N >= arr.length) 
	{
            System.out.println("Invalid position! Please enter a valid position.");
        }
	else
	{
	   System.out.print("The Given array is: ");
	   for(int i=0;i<arr.length;i++)
	   {
		System.out.print(arr[i]+" ");
	   }
	   System.out.println("\nFrom " + N + "th position the values of the array are: ");
	   for(int i=N;i<arr.length;i++)
	   {
		System.out.print(arr[i]+" ");
	   }
	   System.out.println("\nBefore " + N + "th position the values of the array are: ");
	   for(int i=0;i<N;i++)
	   {
		System.out.print(arr[i]+" ");
	   }
	   System.out.println("\nAfter rotating from " + N + "th position the array is:");
	   for(int i=N;i<arr.length;i++)
	   {
		System.out.print(arr[i]+" ");
	   }
	   for(int i=0;i<N;i++)
	   {
		System.out.print(arr[i]+" ");
	   }
	}
	
   }
}