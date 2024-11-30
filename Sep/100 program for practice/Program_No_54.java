import java.util.*;
public class Program_No_54
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	
	//step: 1
	int totalsum = 0;
	for(int i=0;i<arr.length;i++)
	{
	   totalsum = totalsum + arr[i];
	}

	//step: 2
	int maxCurrent=arr[0];
	int maxGlobal=arr[0];
	for(int i=1;i<arr.length;i++)
	{
	   int temp = maxCurrent+arr[i];
	   if(temp > arr[i])
	   {
		maxCurrent=temp;
	   }
	   else
	   {
		maxCurrent=arr[i];
	   }
	   if(maxCurrent > maxGlobal)
	   {
		maxGlobal=maxCurrent;
	   }
	}
/*
	//step 2 using two for loops
	int maxSum = arr[0];               // Start with the first element of the array
	for (int i = 0; i < arr.length; i++) 
	{
    	   //int currentSum = 0;
    	   for (int j = i+1; j < arr.length; j++)   //int j=i
	   {
        	//currentSum += arr[j];
        	if(arr[i]+arr[j] > maxSum) 
		{
            	   maxSum = arr[i]+arr[j];
        	}
    	   }
	}
*/

	//step: 3
	int minCurrent=arr[0];
	int minGlobal=arr[0];
	for(int i=1;i<arr.length;i++)
	{
	   int temp2=minCurrent+arr[i];
	   if(temp2 < arr[i])
	   {
		minCurrent=temp2;
	   }
	   else
	   {
		minCurrent=arr[i];
	   }
	   if(minCurrent < minGlobal)
	   {
		minGlobal=minCurrent;
	   }
	}
	
	//step: 4
	int maxCircular= totalsum - minGlobal;

	//step: 5
	if(maxCircular == 0)
	{
	   System.out.println("The maximum circular sum in the above array is: "+maxGlobal);
   	}
	else
	{
	   if(maxGlobal > maxCircular)
	   {
		System.out.println("The maximum circular sum in the above array is: "+maxGlobal);
	   }
	   else
	   {
		System.out.println("The maximum circular sum in the above array is: "+maxCircular);
	   }
	}
   }
}