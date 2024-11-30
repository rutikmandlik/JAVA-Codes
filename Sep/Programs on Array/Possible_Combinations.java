import java.util.*;
public class Possible_Combinations
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
	int n=arr.length;
	System.out.print("The combination form by the number of elements are: ");
	int r=sc.nextInt();
	System.out.print("Possible Combinations are: ");
	
	
	generateCombinations(arr, new int[r], 0, 0, r);
   }
   public static void generateCombinations(int arr[], int data[], int start, int index,int r)
   {
	if(index == r)
	{
	   for(int j=0;j<r;j++)
	   {
		System.out.print(data[j]+" ");
	   }
	   System.out.println();
	   return;
	}
	for(int i=start; i<arr.length;i++)
	{
	   data[index]=arr[i];
	   generateCombinations(arr, data, i+1, index+1, r);
	}
   }
}