public class SumOfNum
{
	public static int getSum(int n,int sum)
	{
		if(n == 0)
		{
			return sum;
		}
		int x=n%10;
		sum += x;
		
		return getSum(n/10 , sum);
		
		
	}
	public static void main(String []args)
	{
		int no=1234;
		int sum = 0;
		System.out.println(getSum(no,sum));
	}
}