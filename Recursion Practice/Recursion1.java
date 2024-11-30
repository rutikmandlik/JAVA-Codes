public class Recursion1
{
	public static void main(String args[])
	{
		int n=5;
		/*
		for(int i=5;i>0;i--)
		{
			System.out.println(i);
		}
		*/
		printNo(n);
	}
	public static void printNo(int no)
	{
		if(no == 0)
			return;
		
		System.out.println(no);
		printNo(no-1);
	}
}