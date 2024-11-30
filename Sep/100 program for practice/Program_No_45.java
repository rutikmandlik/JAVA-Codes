import java.util.*;
public class Program_No_45
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[8];
	System.out.print("Enter 8 elements in array: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int count=0;
	int candidate=-1;
	for (int i = 0; i < arr.length; i++) 
	{
            if (count == 0) 
	    {
                candidate = arr[i];       // Set current element as candidate
                count = 1;                // Start counting the candidate
            } 
	    else if (arr[i] == candidate) 
	    {
                count++;                  // If same as candidate, increment count
            } 
	    else 
	    {
                count--;                  // If different from candidate, decrement count
            }
        }
	count = 0;                        // Reset the count to count actual occurrences
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i] == candidate)
	   {
		count++;
	   }
	}
	
	if(candidate > arr.length/2)
	{
	   System.out.print("Majority elements is: "+candidate);
	}
	else
	{
	   System.out.print("There are no majority element in array.");
	}
   }
}