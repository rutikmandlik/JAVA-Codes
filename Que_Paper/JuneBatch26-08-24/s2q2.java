import java.util.*;
public class s2q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of character array: ");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		System.out.println("Enter input in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >= '0' && arr[i]<= '9')
			{
				sum += arr[i] - '0';
			}
		}
		System.out.print("Sum of digit is: "+sum);
	}
}