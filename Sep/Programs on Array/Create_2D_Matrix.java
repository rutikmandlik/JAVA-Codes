import java.util.*;
public class Create_2D_Matrix
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	System.out.print("Enter input: \n");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print("element - ["+i+"],["+j+"] : ");
		arr[i][j]=sc.nextInt();
	   }
	}
	System.out.println("Display Matrix: ");
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=0;j<arr.length;j++)
	   {
		System.out.print(arr[i][j]+" ");
	   }
	   System.out.print("\n");
	}
   }
}