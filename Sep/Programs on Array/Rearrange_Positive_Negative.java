import java.util.*;
public class Rearrange_Positive_Negative
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.print("Enter inputs: ");
	for(int i=0;i<size;i++)
	{
	   arr[i]=sc.nextInt();
 	}
	int pos[]=new int[size];
	int neg[]=new int[size];
	int pcount=0;
	int ncount=0;

	for(int i=0;i<size;i++)
	{
	   if(arr[i] >= 0)
	      	pos[pcount++] = arr[i];
	   else
	 	neg[ncount++] = arr[i];
	}
	int i = 0;
	int j = 0;
	int k = 0;
	while(i < ncount && j < pcount)
	{
	   arr[k++]=neg[i++];
	   arr[k++]=pos[j++];
	}
	
	// If there are more positive numbers, add them to the end
	while(j < pcount)
	{
	   arr[k++]=pos[j++];
	}
	
	// If there are more negative numbers, add them to the end
	while(i < ncount)
	{
	   arr[k++]=neg[i++];
	}

	System.out.print("Rearranged array is: ");
	for(int x=0;x<size;x++)
	{
	   System.out.print(arr[x]+" ");
	}
   }
}