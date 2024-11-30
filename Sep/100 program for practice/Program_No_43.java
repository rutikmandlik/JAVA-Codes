import java.util.*;
public class Program_No_43
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
	   System.out.print("\nelement "+ i +" :");  //12345
	   arr[i]=sc.nextInt();
	}
	int secondLargest= findSecondLargest(arr);
	System.out.print("The second largest element in the array is: " + secondLargest);
	System.out.println();
   }
   public static int findSecondLargest(int arr[])
   {
	int largest = arr[0];      //1    
	int secondLargest= -1;     
	
	for(int i=1;i<arr.length;i++)
	{
	   if(arr[i] > largest)       //2>1
	   {
		secondLargest = largest;         //1
		largest = arr[i];                //2
	   }
	   else if(arr[i] > secondLargest && arr[i] != largest)     //2>1 && 2!=2
	   {
		secondLargest = arr[i];
	   }
	}
	return secondLargest;
   }
}