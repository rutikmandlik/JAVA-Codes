import java.util.*;
public class Program_No_74
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the size of square Matrix:");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        System.out.print("Enter elements in the array: \n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("element - ["+i+"],["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("The Matrix is: \n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

        int rowSum[]=new int[size];
        int colSum[]=new int[size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                rowSum[i] += arr[i][j];          //sum of each row
                colSum[j] += arr[i][j];          //sum of each column
            }
        }
        System.out.print("The sum of rows and columns of the matrix is: \n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print(rowSum[i]);
            System.out.print("\n");
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(colSum[i]+" ");
        }
        int totalSum = 0;
        for(int i=0;i<size;i++)
        {
            totalSum += rowSum[i];
        }
        System.out.print(totalSum);
    }
}        