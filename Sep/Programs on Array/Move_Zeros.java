import java.util.*;
public class Move_Zeros
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int count=0;                    //counter for non-zero elements
	for(int i=0;i<arr.length;i++)
	{
	   if(arr[i]!=0)
	   {
		arr[count]=arr[i];      //Moving non-zero elements to th forward
		count++;
	   }
	}
	
	//filling remaining positions with the zeros
	while(count < arr.length)
	{
	   arr[count]=0;
	   count++;
	}
	System.out.print("Final array is: ");
	for(int i=0;i<arr.length;i++)
	{
	   System.out.print(arr[i]+" ");
	}
   }
}