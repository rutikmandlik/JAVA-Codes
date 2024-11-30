import java.util.*;
public class Array_Insertion
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter a Input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter Index and Value to insert: ");
	int index=sc.nextInt();
	int value=sc.nextInt();
	for(int i=arr.length-2;i>=index;i--)
	{
	   arr[i+1]=arr[i];
	}
	arr[index]=value;
	System.out.print("\nArray After Insertion: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
   }
}