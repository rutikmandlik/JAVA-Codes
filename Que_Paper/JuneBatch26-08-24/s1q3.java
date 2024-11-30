import java.util.*;
public class s1q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of series(Even Number): ");
		int size=sc.nextInt();
		
		int s=size/2;
		int arr1[]=new int[s];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=2*(i+1);
			
		}
		//for(int i=0;i<arr1.length;i++)
		//{
		//	System.out.print(arr1[i]+" ");
		//}
		int arr2[]=new int[s];
		int temp=s;
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=temp*temp*temp;
			temp--;
		}
		//for(int i=0;i<arr2.length;i++)
		//{
		//	System.out.print(arr2[i]+" ");
		//}
		int finalarr[]=new int[size];
		for(int i=0;i<s;i++)
		{
			finalarr[2*i]=arr1[i];
			finalarr[2*i+1]=arr2[i];
		}
		for(int i=0;i<finalarr.length;i++)
		{
			System.out.print(finalarr[i]+" ");
		}
	}
}

/*
import java.util.Scanner;

public class CombinedSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs in the series: ");
        int pairs = sc.nextInt();

        // Size of the final array
        int size = pairs * 2;
        int[] finalarr = new int[size];

        int startCube = pairs;  // Start with the largest cube number

        // Fill the array with alternating even numbers and cubes
        for (int i = 0; i < pairs; i++) {
            // Even numbers in even indices
            finalarr[2 * i] = 2 * (i + 1);  // 2, 4, 6, ...

            // Cubes in odd indices
            finalarr[2 * i + 1] = (startCube - i) * (startCube - i) * (startCube - i);  // Cubes: 9^3, 8^3, ...
        }

        // Print the combined series
        for (int i = 0; i < size; i++) {
            System.out.print(finalarr[i] + " ");
        }

        sc.close();
    }
}

*/