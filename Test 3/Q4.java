import java.util.*;
class StringApp{
	private char []a;
	void setData(char []a)
	{
		this.a=a;
	}
	void frequencyAlphabet()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int occ=1;
		int maxOcc=1;
		char maxElement=a[0];
		int i;
		//char ch;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i] == a[i+1])
			{
				occ++;
			}
			else
			{
				System.out.println(a[i] +":"+ occ);
				if(occ > maxOcc)
				{
					maxOcc=occ;
					maxElement=a[i];
				}
				occ = 1;
			}
		}
		System.out.println(a[a.length-1] +":"+ occ);
				if(occ > maxOcc)
				{
					maxOcc=occ;
					maxElement=a[a.length-1];
					
				}
		System.out.println("Max Occurence is: "+maxOcc+ " max element is: "+maxElement);		
	}
}
public class Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		System.out.println("Enter input in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		StringApp sa=new StringApp();
		sa.setData(arr);
		sa.frequencyAlphabet();
	}
}