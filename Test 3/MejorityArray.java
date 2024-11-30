import java.util.*;
public class MejorityArray
{
	public static boolean isMejority(int arr[])
	{
		int x=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			x=arr.length / 2;
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
		}
		
		if(count > x)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}
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
		
		//isMejority(arr);
		if(isMejority(arr))
		{
			System.out.println("Array is Mejority array.");
		}
		else
		{
			System.out.println("Array is not Mejority.");
		}
	}
}