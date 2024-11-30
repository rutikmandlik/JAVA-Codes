import java.util.*;
public class Find_Subarray
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[8];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("The Given array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
	System.out.print("\nEnter sum you want: ");
	int targetsum=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
	   int sum=0;
	   for(int j=i;j<arr.length;j++)
	   {
		sum=sum+arr[j];
		if(sum==targetsum)
		{
		   System.out.print("["+ i +".."+ j + "] -- { ");
		   
		   for(int k=i;k<=j;k++)
		   {
			System.out.print(arr[k]+" ");
		   }
		   System.out.println("}");
		}
	   }
	}
   }
}