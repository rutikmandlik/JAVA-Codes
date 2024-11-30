import java.util.*;
public class Program_No_72
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
        int sum = 0;
        for(int i=0;i<size;i++)
        {
            sum += arr[i][size - 1 - i];
        }
        System.out.print("Addition of right diagonal is: "+sum);
    }
}