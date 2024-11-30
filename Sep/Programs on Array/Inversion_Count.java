import java.util.*;
public class Inversion_Count
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter innput: ");
	for(int i=0;i<arr.length;i++)	
	{
	   arr[i]=sc.nextInt();
	}
	int count=0;
	System.out.print("The inversions are: ");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]>arr[j])
		{
		   System.out.print("("+ arr[i] +","+ arr[j] +")");
		   count++;
		}
	   }
	}
	System.out.print("\nThe number of inversion can be formed from the array is: "+count);
   }
}