
import java.util.*;
public class Display_Lower_Triangular
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

        for(int i=0;i<size;i++)
        {
            for(int j=0;j < i ;j++)
            {
                arr[i][j]=0;
            }
        }
        System.out.print("Matrix after setting lower triangular part to zero: \n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}        