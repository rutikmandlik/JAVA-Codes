import java.util.*;
public class Transpose_Matrix
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Input the rows and columns of the matrix: ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print("element- ["+i+"],["+j+"] : ");
		arr[i][j]=sc.nextInt();
	   }
	}
	System.out.print("The Matrix is: \n");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print(arr[i][j]+" ");
	   }
	   System.out.print("\n");
	}
	System.out.print("The Transpose of matrix is: \n");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print(arr[j][i]+" ");
	   }
	   System.out.print("\n");
	}
   }
}