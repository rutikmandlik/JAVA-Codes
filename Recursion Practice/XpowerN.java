public class XpowerN
{
	public static int calcPower(int x,int n)
	{	if(n == 0)
		{
			return 1;
		}
		if(x == 0)
		{
			return 0;
		}
		int xPow_nm1=calcPower(x, n-1);
		int xpow_n= x * xPow_nm1;
		return xpow_n;
	}
	public static void main(String args[])
	{
		int x=2, n=5;
		int ans=calcPower(x, n);
		System.out.println(ans);
	}
}