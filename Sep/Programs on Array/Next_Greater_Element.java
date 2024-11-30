import java.util.*;
public class Next_Greater_Element
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	int newarray[]=new int[6];
	System.out.print("Enter input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}
	int element=0;
	System.out.println("Next Bigger Elements are: ");
	for(int i=0;i<arr.length;i++)
	{
	   boolean flag=false;
	   for(int j=i+1;j<arr.length;j++)
	   {
		if(arr[i]<arr[j])
		{
		   System.out.print("Next Bigger Element of "+arr[i]+" in the array is: "+arr[j]+"\n");
		   newarray[element++]=arr[j];
		   flag=true;
		   break;
		}
		
	   }
	   if(!flag)
	   {
		System.out.print("Next Bigger Element of "+arr[i]+" in the array is: "+"-1"+"\n");
		newarray[element++]= -1;
	   }
	}
	System.out.println("Next Bigger Elements Array: ");
	for(int i=0;i<newarray.length;i++)
	{
	   System.out.print(newarray[i]+" ");
	}
   }
}