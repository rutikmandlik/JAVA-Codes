import java.util.*;
public class Program_No_65
{
   public static void main(String args[])
   {
	Scanner  sc=new Scanner(System.in);
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
	   if(arr[i]==arr[i+1] && arr[i] != 0)
	   {
		arr[i]=arr[i]*2;
		arr[i+1]=0;
	   }
	}
	int tempArr[] = new int[size];
        int index = 0;
	for(int i=0;i<size;i++)
	{
	   if(arr[i] != 0)
	   {
		tempArr[index]=arr[i];
		index++;
	   }
	}
	System.out.print("The new array is: ");
	for(int i=0;i<size;i++)
	{
	   System.out.print(tempArr[i]+" ");
	}
   }
}