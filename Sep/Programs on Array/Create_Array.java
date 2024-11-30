import java.util.*;
public class Create_Array
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter a Input: ");
	for(int i=0;i<arr.length; i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Display Array Input: ");
	for(int j=0; j<arr.length; j++)
	{
	   System.out.print(arr[j]+" ");
	}
   }
}