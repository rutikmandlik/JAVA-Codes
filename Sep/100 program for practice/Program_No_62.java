import java.util.*;
public class Program_No_62
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.print("Enter 10 inputs: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	System.out.print("Enter the First Number: ");
	int num1=sc.nextInt();
	System.out.print("Enter the Second Number: ");
	int num2=sc.nextInt();
	
	// Initialize variables to track positions and minimum distance
	int pos1 = -1;
	int pos2 = -1;
	int minDistance = arr.length + 1 ;    // Initialize with a maximum value larger than array size
	
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]==num1)
	   {
		pos1 = i;
	   }
	   if(arr[i]==num2)
	   {
		pos2 = i;
	   }
	   if(pos1 != -1 && pos2 != -1)
	   {
		int distance = 0;
	 	if(pos1 > pos2)
		{
		   distance = pos1 - pos2;
		}
		if(pos1 < pos2)
		{
		   distance = pos2 - pos1;
		}
		if(distance < minDistance)
		{
		   minDistance = distance ;
		}
	   }
	}
	if(pos1 == -1 || pos2 == -1)
	System.out.print("The given numbers are not exist in the array.");
	else
	System.out.print("The minimum distance between "+num1+" & "+num2+" is: " + minDistance);
   }
}