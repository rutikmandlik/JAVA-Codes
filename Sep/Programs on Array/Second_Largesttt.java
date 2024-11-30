import java.util.*;
public class Second_Largesttt
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
	System.out.print("Enter array Size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];               //5
	System.out.print("Input "+ size + " elements in the array: ");
	for(int i=0;i<size;i++)
	{
	  // System.out.print("\nelement "+ i +" :");  //12345
	   arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
	   for(int j=i+1;j<size;j++)
	   {
		if(arr[i]<arr[j])
		{
		   int temp=arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
		}
	   }
	}
	System.out.print("Second Largest element is: ");
	int count=1;
	for(int i=0;i<size-1;i++)
	{
	   if(arr[i]!=arr[i+1])
	   {
		count++;
	   }
	   if(count==2)
	   {
		System.out.print(arr[i+1]);
		break;
	   }
	}
   }
}