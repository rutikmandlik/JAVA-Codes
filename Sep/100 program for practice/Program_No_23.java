import java.util.*;
public class Program_No_23
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the no. of Rows (R): ");
	int R=sc.nextInt();
	System.out.print("Enter the no. of Columns (C): ");
	int C=sc.nextInt();

	int arr[][]=new int[R][C];
	System.out.println("Enter the elements of the parking lot (0 for empty, 1 for full): ");
	for(int i=0;i<R;i++)
	{
	   for(int j=0;j<C;j++)
	   {
		arr[i][j]=sc.nextInt();
	   }
	}
	int maxOnes = 0;
        int rowIndexWithMaxOnes = -1;
	for(int i=0;i<R;i++)
	{
	   int count=0;
	   for(int j=0;j<C;j++)
	   {
		if(arr[i][j] == 1)
		{
		   count++;               //count number of 1's
		}
	   }
	   if(count > maxOnes)
	   {
	   	maxOnes=count;
	   	rowIndexWithMaxOnes = i+1;
	   }
	}
	System.out.println(rowIndexWithMaxOnes + " -> Row " + rowIndexWithMaxOnes + " has the maximum number of 1's");
   }
}