import java.util.*;
public class Subject_Percentage
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	double sum=0;
	System.out.println("Enter array input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	for(int j=0;j<arr.length;j++)
	{
	   sum=sum+arr[j];
	}
	System.out.println("Total Marks are: "+sum);
	double p=(sum/600)*100;		
	System.out.println("Percentage are: "+p);
   }
}