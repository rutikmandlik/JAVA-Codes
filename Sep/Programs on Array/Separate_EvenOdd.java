import java.util.*;
public class Separate_EvenOdd
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	int even[]=new int[5];
	int odd[]=new int[5];
	System.out.print("Enter a Input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int evencount=0;
	int oddcount=0;
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]%2==0)
	   {
		even[evencount++]=arr[i];
	   }
	   else if(arr[i]%2!=0)
	   {
		odd[oddcount++]=arr[i];
	   }
	  
   	}
	
	System.out.print("Even elements are: ");
	for(int j=0; j<evencount; j++)
	{
	   System.out.print(even[j]+" ");
	}
	
	System.out.print("\nOdd elements are: ");
	for(int j=0; j<oddcount; j++)
	{
	   System.out.print(odd[j]+" ");
	}
   }
	
}