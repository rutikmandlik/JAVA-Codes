import java.util.*;
public class Sparse_Matrix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int row=sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.print("Enter input: \n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print("element - ["+i+"],["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
        }

        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j] == 0)
                {
                    count++;
                }
                else 
                {
                    temp++;
                }
            }
        }
        if(count > temp)
        {
            System.out.print("The given matrix is sparse matrix");
        }
        else
        {
            System.out.print("The given matrix not a sparse matrix");
        }
        System.out.print("\nThere are "+count+" number of zeros in the matrix");
    }
}