import java.util.*;
public class Mobile_No
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("Enter array Input: ");
	for(int i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
	}

	System.out.print("Enter Your Choice: ");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	   for(int j=0;j<arr.length;j++)
	   {
	   	if(j<3 ||  j>6)
	   	{
		   System.out.print(" *");
	   	}
	   	else
	   	{
		   System.out.print(" "+ arr[j]);
	   	}	
	   }
	break;
	case 2:
	   for(int j=0;j<arr.length;j++)
	   {
	   	if(j<3 ||  j>6)
	   	{
		   System.out.print(" "+ arr[j]);
	   	}
	   	else
	   	{
		   System.out.print(" #");
	   	}	
	   }
	   break;
	case 3: 
	   for(int j=0;j<arr.length;j++)
	   {
	   	if(arr[j]%2==0)
	   	{
		   System.out.print(" *");
	   	}
	   	else
	   	{
		   System.out.print(" "+ arr[j]);
	   	}	
	   }
	}	
   }
}
