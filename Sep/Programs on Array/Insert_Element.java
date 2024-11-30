import java.util.*;
public class Insert_Element
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.print("Enter input: ");
	for(int i=0;i<5;i++)
	{
	   arr[i]=sc.nextInt();
	}
	insertElementInArray(arr);
   }
   public static void insertElementInArray(int m[])
   {
	System.out.print("Enter index And Value to insert: ");
	Scanner sc=new Scanner(System.in);
	int index=sc.nextInt();
	int value=sc.nextInt();
	for(int i=m.length - 2; i>=index; i--)
	{
	   m[i+1]=m[i];
	}
	m[index]=value;
	System.out.print("Array after insertion: ");
	for(int i=0;i<m.length;i++)
	{
	   System.out.printf("%d ",m[i]);
	}
   }
}