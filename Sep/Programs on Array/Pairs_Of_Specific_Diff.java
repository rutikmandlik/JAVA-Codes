import java.util.*;
public class Pairs_Of_Specific_Diff
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
	System.out.print("Enter Specific Difference: "); 
	int SD=sc.nextInt();
	
	
	int count=0;
	System.out.print("The distinct pairs for difference "+ SD +" are: ");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if((arr[j]-arr[i]==SD) || (arr[i]-arr[j]==SD))
		{
		   System.out.print("["+ arr[j] +","+ arr[i] +"]");
		   count++;
		}
	   }
	}
	
	System.out.print("\nNumber of distinct pairs for difference "+ SD + " are: "+count);
	
	
   }
}