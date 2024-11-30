import java.util.*;
public  class Program_No_48
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.print("Enter 6 inputs: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	//System.out.print("Enter a number: ");
	//int n=sc.nextInt();
	
	for(int i=0;i<arr.length;i++)
	{
	   for(int j=i+1;j<arr.length;j++)
	   {
	 	if(arr[i]>arr[j])
		{
	 	   int temp=arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
		}
	   }
	}
     for(int n=0;n<=10;n++)
     {
	int ceiling=-1;
	int floor=-1;
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]>n)
	   {
		floor=-1;
		ceiling=arr[i];
		break;
	   }
	   else if(arr[arr.length-1]<n)
	   {
		floor=arr[arr.length-1];
		ceiling=-1;
		break;
	   }
	   else if(arr[i]==n)
	   {
		floor=arr[i];
		ceiling=arr[i];
		break;
	   }
	   else if(arr[i]<n && arr[i+1]>n)
	   {
		floor=arr[i];
		ceiling=arr[i+1];
		break;
	   }
	}
	System.out.print("\nNumber: "+n+" ceiling is: "+ceiling+" floor is: "+floor);
	//System.out.print("\nFloor of "+n+" is: "+floor);
     }
   }
}