public class fibApp
{
	public static void printFib(int a,int b,int n)
	{
		if(n == 0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c);
		printFib(b,c,n-1);     //now give b to the a and c to the b and decrese value of nth term
	}
	public static void main(String args[])
	{
		int a=0 , b=1;
		System.out.println(a);
		System.out.println(b);
		int n=10;
		printFib(a,b,n-2);         //n-2 cause we print 1st & 2nd terms already
	}
}