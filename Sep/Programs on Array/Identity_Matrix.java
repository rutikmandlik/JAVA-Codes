import java.util.*;
public class Identity_Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int size=sc.nextInt();
        int  arr[][]=new int[size][size];
        System.out.print("Input elements: \n");
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
            System.out.println();
        }

        boolean flag=true;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i == j && arr[i][j] != 1)     //Diagonal elements must be 1
                {
                    flag = false;
                    break;
                }
                else if(i != j && arr[i][j] != 0)     //Non Diagonal elements must be 0
                {
                    flag = false;
                    break;
                }
            }
            if(!flag)         
            {
                break;                    //loop breaks early to avoid unnecessary further checks.
            }
        }
        if(flag)
            System.out.print("The matrix is an identity matrix.");
        else
            System.out.print("The matrix is not an identity matrix.");
    }
}