import java.util.*;
public class Remove_Duplicate
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.print("Enter input: ");
	for(int i=0;i<size;i++)
	{
	   arr[i]=sc.nextInt();
	}
	for(int i=0;i<size-1;i++)
	{
	   boolean flag = false;
	   for(int j=0;j<i;j++)
	   {   
		if(arr[i]==arr[j])
	   	{
		   flag=true;
		   break;
	   	}
	   }
	   if(!flag)
	   {
		System.out.print(arr[i]+" ");
	   }
	}
   }
}