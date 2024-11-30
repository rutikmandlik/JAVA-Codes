import java.util.*;
public class Program_No_40
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr1[]=new int[3];
	int arr2[]=new int[3];
	int mergedarray[]=new int[6];
	System.out.println("Enter input in first array: ");
	for(int i=0;i<arr1.length;i++)
	{
	   System.out.print("element - " + i + " : ");
	   arr1[i]=sc.nextInt();
	}
	System.out.println("Enter input in second array: ");
	for(int i=0;i<arr2.length;i++)
	{
	   System.out.print("element - " + i + " : ");
	   arr2[i]=sc.nextInt();
	}
	for(int i=0;i<arr1.length;i++)
	{
	   mergedarray[i]=arr1[i];
	   mergedarray[i+ arr1.length]=arr2[i];
	}
	for(int i=0;i<mergedarray.length;i++)
	{
	   for(int j=i+1;j<mergedarray.length;j++)
	   {
		if(mergedarray[i]<mergedarray[j])
		{
		   int temp=mergedarray[i];
	 	   mergedarray[i]=mergedarray[j];
		   mergedarray[j]=temp;
		}
	   }
	}

	System.out.print("Merged array in Descending order: ");
	for(int i=0; i<mergedarray.length ;i++)
	{
	   System.out.print(mergedarray[i]+" ");
	}
	
   }
}