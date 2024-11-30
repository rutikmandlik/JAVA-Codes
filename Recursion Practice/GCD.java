public class GCD        //Greatest Common Divisor
{
	public static int getGCD(int i,int g, int a, int b,int hcf)
	{
		  if(i<=g)
		  {
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}				 
			i++;
			return getGCD(i,g,a,b,hcf);
		  }else
		  {
			return hcf;
		  }
	}
	public static void main(String []args)
	{
		int a=48;
		int b=18;
		 int g = a<b?a:b;
         System.out.println(getGCD(1,g,a,b,0));
	}
}