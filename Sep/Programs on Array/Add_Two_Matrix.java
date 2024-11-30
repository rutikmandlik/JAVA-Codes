import java.util.*;
public class Add_Two_Matrix
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Input the size of the square matrix (less than 5): ");
	int s=sc.nextInt();
	int arr[][]=new int[s][s];
	int arr2[][]=new int[s][s];
	System.out.print("Enter input in first matrix: \n");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print("element - ["+i+"],["+j+"] : ");
		arr[i][j]=sc.nextInt();
	   }
	}
	System.out.print("Enter input in second matrix: \n");
	for(int i=0;i<arr2.length;i++)
	{
	   for(int j=0;j<arr2.length;j++)
	   {
		System.out.print("element - ["+i+"],["+j+"] : ");
		arr2[i][j]=sc.nextInt();
	   }
	}
	System.out.println("The first matrix is: ");
	for(int i=0;i<s;i++)
	{
	   for(int j=0;j<s;j++)
	   {
		System.out.print(arr[i][j]+" ");
	   }
	   System.out.print("\n");
	}
	System.out.println("The second matrix is: ");
	for(int i=0;i<s;i++)
	{
	   for(int j=0;j<s;j++)
	   {
		System.out.print(arr2[i][j]+" ");
	   }
	   System.out.print("\n");
	}
	
	int add[][]=new int[s][s];
	
	for(int i=0;i<s;i++)
	{
	   for(int j=0;j<s;j++)
	   {
		add[i][j]=arr[i][j]+arr2[i][j];
	   }
	}
	System.out.print("Addition of matrix are: \n");
	for(int i=0;i<s;i++)
	{
	   for(int j=0;j<s;j++)
	   {
		System.out.print(add[i][j]+" ");
	   }
	   System.out.print("\n");
	}
   }
}