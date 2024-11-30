import java.util.*;
public class Program_No_44
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter input:");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter sum: ");
	int sum=sc.nextInt();
	System.out.println("Pair of elements that generate given sum: ");
	boolean flag=true;
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]+arr[j]==sum)
		{
		   System.out.println("Index "+ i +" and "+ j);
		   flag=false;
		}
	   }
	}
	if(!flag)
	{
	   System.out.println("No pair found with the given sum.");
	}
   }
}