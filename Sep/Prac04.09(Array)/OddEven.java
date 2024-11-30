import java.util.*;
public class OddEven
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	int odd,even;
	System.out.println("Enter array input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.println("Even Numbers are: ");
	for(int j=0;j<arr.length;j++)
	{
	   if(arr[j]%2==0)
	   {
		System.out.println(arr[j]);
	   }
	}
	System.out.println("\nOdd Numbers are: ");
	for(int j=0;j<arr.length;j++)
	{
	   if(arr[j] % 2 == 1)
	   {
		System.out.println(arr[j]);
	   }
	}
   }
}