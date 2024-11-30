import java.util.*;
public class Delete_Element
{
   public static  void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter a input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter element want to be Delete: ");
	int delement=sc.nextInt();
	int count=0;
	for(int i=0;i<5;i++)
	{
	   if(arr[i]==delement)
	   {
		count++;
		for(int j=i;j<arr.length-1;j++)
		{
		   arr[j]=arr[j+1];
		}
	      i--;
	   }
	}
	System.out.print("Array After Deletion: ");
	for(int i=0;i<arr.length-count;i++)
	{
	   System.out.print(" "+arr[i]);
	}
   }
}