public class RecursionSum
{
	public static void showSum(int i,int n,int sum)
	{
		if(i == n)
		{
			sum += i;
			System.out.println(sum);
			return ;
		}
		sum += i;
		showSum(1+i,n,sum);
		System.out.println(i);
	}
	
	public static void main(String args[])
	{
		showSum(1, 5, 0);
	}
}