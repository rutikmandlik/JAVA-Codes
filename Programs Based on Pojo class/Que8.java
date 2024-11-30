/*
8.WAP to create the class name as ArrayFeqCount with a following methods
class ArrayFeqCount
{  int c[];
   void setIntArray(int ch[])
   { //here accept the integer array and store in instance variable in integer array
     c=ch;
   }
   void countFeqCount()
   { //here we need to write the manual logics for  Counting frequenci of arr
   }
}
public class ConvertToUpperApp
{
   public static void main(String x[])
   {  //here create the array with 6 six size and store only  value in it using scanner
	 // create the object of ArrayFeqCount
     //call the setIntArray function
     //call the countFeqCount() and write the manual logics
   }
}
*/

import java.util.*;
class ArrayFeqCount
{
	int arr[];
	void setIntArray(int []arr)
	{
		this.arr=arr;
	}
	void countFeqCount()
	{
		int n = arr.length;
        boolean counted[] = new boolean[n]; // To mark elements that are already counted
        
        for (int i = 0; i < n; i++) {
            if (!counted[i])   //If the element has not been counted yet
			{ 
                int count = 1;    // Start count at 1 for the current element
                for (int j = i + 1; j < n; j++)     // Check for the same element in the rest of the array
				{
                    if (arr[i] == arr[j]) 
					{
                        count++;
                        counted[j] = true; // Mark this occurrence as counted
                    }
                }
                
                // Print the frequency of the current element
                System.out.println(arr[i] + " : " + count);
            }
        }
	}
}
public class Que8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter input: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayFeqCount afc=new ArrayFeqCount();
		afc.setIntArray(arr);
		afc.countFeqCount();
		
	}
}