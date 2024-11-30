import java.util.*;
public class MajorityArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[8];
		System.out.println("Enter 8 inputs in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			x=arr.length/2;
		}
		int s=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					s=arr[i];
				}
			}
		}
		if(count > x)
		{
			System.out.println("Array is Mejority array "+s);
		}
		else
		{
			System.out.println("Array is not mejority");
		}
	}
}