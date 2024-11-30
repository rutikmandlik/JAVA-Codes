import java.util.*;
public class Program_No_79
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input rows and columns of the first matrix: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.print("Input rows and columns of the second matrix: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];

        System.out.print("Input elements in the first matix: \n");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print("element - ["+i+"],["+j+"] : ");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Input elements in the second matix: \n");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print("element - ["+i+"],["+j+"] : ");
                arr2[i][j]=sc.nextInt();
            }
        }

        int m1=0;
        int m2=0;
        System.out.print("The First Matrix is: \n");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(arr1[i][j]+" ");
                m1=arr1[i][j];
            }
            System.out.println();
        }
        System.out.print("The second Matrix is: \n");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.print(arr2[i][j]+" ");
                m2=arr2[i][j];
            }
            System.out.println();
        }
        System.out.print("The Matrices can be compared: \n");
        if(m1 == m2)
        {
            System.out.print("Two Matrices are Equal");
        }
        else
        {
            System.out.print("Two Matrices are Not Equal");
        }
    }
}