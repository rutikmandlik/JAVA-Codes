import java.util.*;
public class Sort_int_char
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	char arr2[]=new char[5];
	System.out.print("Enter 5 integer input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter 5 char input: ");
	for(int i=0;i<arr2.length;i++)
	{
	   arr2[i]=sc.next().charAt(0);
	}
	
	sort(arr);
	sort(arr2);
   }
   public static void sort(int a[])
   {
	for(int i=0;i<a.length;i++)
	{
	   for(int j=i+1;j<a.length;j++)
	   {
		if(a[i]>a[j])
		{
		   int temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		}
	   }
	}
	System.out.print("Sorted integer array is: ");
	for(int i=0;i<a.length;i++)
	{
	   System.out.print(a[i]+" ");
	}
	
   }
   public static void sort(char b[])
   {
	for(int i=0;i<b.length;i++)
	{
	   for(int j=i+1;j<b.length;j++)
	   {
		if(b[i]>b[j])
		{
		   char temp=b[i];
		   b[i]=b[j];
		   b[j]=temp;
		}
	   }
	}
	System.out.print("\nSorted Char array is: ");
	for(int i=0;i<b.length;i++)
	{
	   System.out.print(b[i]+" ");
	}
   }
}