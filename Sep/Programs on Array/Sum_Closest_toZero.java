import java.util.*;
public class Sum_Closest_toZero
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
	// Initialize minSum with a large arbitrary value
	int minSum = 999999;         // Start with a large number
	
	int firstelement = 0;
	int secondelement = 0;

	// Loop through each pair of elements
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)         // Avoid summing the same elements
	   {
		int sum=arr[i]+arr[j];

		int absSum= sum<0? -sum: sum;             // If sum is negative, multiply by -1
	                                            //If sum = -10, then absSum = -(-10) = 10
	
		if(absSum<minSum)              // Compare to find the minimum sum closest to zero
		{
		   minSum=absSum;
		   firstelement=arr[i];
		   secondelement=arr[j];
		}
	   }
	}
	System.out.print("The given array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("The pair of element whose sum is minimum are: [" + firstelement + "," + secondelement + "]");
   }
}
