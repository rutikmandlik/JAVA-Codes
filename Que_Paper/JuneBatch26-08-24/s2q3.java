import java.util.*;
public class s2q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of first array: ");
		int s1=sc.nextInt();
		int arr1[]=new int[s1];
		System.out.print("Enter input in first array: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter size of second array: ");
		int s2=sc.nextInt();
		int arr2[]=new int[s2];
		System.out.print("Enter input in second array: ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int unionarr[]=new int[s1 + s2];
		int unionindex=0;
		// Add all elements of arr1 to unionarr
		for(int i=0;i<s1;i++)
		{
			unionarr[unionindex++] = arr1[i];
		}
		// Add elements of arr2 to unionarr if not already present
		for(int i=0;i<s2;i++)
		{
			boolean found = false;
			for(int j=0;j<s1;j++)
			{
				if(arr2[i] == arr1[j])
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				unionarr[unionindex++]=arr2[i];
			}
		}
		System.out.println("Union of the two arrays: ");
		for(int i=0;i<unionindex;i++)
		{
			System.out.print(unionarr[i]+" ");
		}
		System.out.println();
		
		int interArr[]=new int[Math.min(s1,s2)];
		int interIndex=0;
		
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				if(arr1[i] == arr2[j])
				{
					boolean duplicate = false;
					for(int k=0;k<interIndex;k++)
					{
						if(interArr[k]==arr1[i])
						{
							duplicate = true;
							break;
						}
					}
					if(!duplicate)
					{
						interArr[interIndex++]=arr1[i];
					}
				}
			}
		}
		
		System.out.println("Intersection of the two arrays: ");
		for(int i=0;i<interIndex;i++)
		{
			System.out.print(interArr[i]+" ");
		}
		System.out.println();
	}
}