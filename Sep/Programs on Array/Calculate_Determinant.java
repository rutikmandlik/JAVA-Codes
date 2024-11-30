import java.util.*;
public class Calculate_Determinant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size = 3;
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
        int det=0;
        for(int i=0;i<size;i++)
        {
            det += (arr[0][i] * (arr[1][(i + 1) % 3] * arr[2][(i + 2) % 3] - arr[1][(i + 2) % 3] * arr[2][(i + 1) % 3]));
        }
        System.out.print("The determinant of matrix is: "+det);
    }
}