import java.util.*;
public class SecondLargest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter input in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int secondMax=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != max)
			{
				secondMax=arr[i];
			}
		}
		System.out.println("Second Max value is: "+secondMax);
	}
}