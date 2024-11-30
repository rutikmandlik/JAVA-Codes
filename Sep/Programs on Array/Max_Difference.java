import java.util.*;
public class Max_Difference
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	
	int maxDiff=0;
	int element1=0;
	int element2=0;
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]<arr[j])
		{
		   int diff=arr[j]-arr[i];
		   if(diff > maxDiff)
		   {
			maxDiff=diff;
			element1=arr[i];
			element2=arr[j];
		   }
		}
	   }
	}
	System.out.print("The elements which provide maximum difference is: " + element1 + "," + element2);
	System.out.print("\nThe Maximum difference between two elements in the array is: "+maxDiff);
   }
}