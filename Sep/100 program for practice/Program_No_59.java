import java.util.*;
public class Program_No_59
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter input: ");
	//int maxElement = 0;
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	   //if(arr[i] > maxElement)
	   //{
		//maxElement = arr[i];     // Find the maximum element
	   //}
	}
   	
	//int k = maxElement + 1;      
	int k = n;                  // if frequency array size is equal to the number of elements
	
	int freq[]=new int[k];            // This array will store the count of elements
	for(int i=0;i<n;i++)
	{
	   freq[arr[i]]++;             // Counting occurrences of each element
	}

	int maxCount = 0 ;
	int maxRepeatElem = -1 ;
	for(int i=0; i<k; i++)
	{
	   if(freq[i] > maxCount)            // Finding the element with the maximum frequency
	   {
		maxCount = freq[i];
		maxRepeatElem = i;
	   }
	}
	System.out.print("Maximum Repeating Number is: "+maxRepeatElem);
   }
}