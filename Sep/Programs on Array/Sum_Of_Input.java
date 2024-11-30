import java.util.*;
public class Sum_Of_Input
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
	int sum=0;
	for(int j=0;j<arr.length;j++)
	{
	   sum=sum+arr[j]; 
	}
	System.out.print("Sum is: "+sum);
   }
}