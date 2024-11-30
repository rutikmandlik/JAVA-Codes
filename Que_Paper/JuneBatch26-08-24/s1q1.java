//1
//1*2
//1*2*3
//1*2*3*4
//4*3*2*1
//3*2*1
//2*1
//1

public class s1q1
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=8;i++)
		{
			int n=1;
			int k=9-i;
			boolean flag = true;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i && j<=3+i && i<=4)
				{
					if(flag)
					{
						System.out.print(n++);
						flag = false;
					}
					else
					{
						System.out.print("*");
						flag = true;
					}
				}
				else if(j>=i-4 && j<=12-i && i>4)
				{
					if(flag)
					{
						System.out.print(k--);
						flag = false;
					}
					else
					{
						System.out.print("*");
						flag = true;
					}
				}
				
			}
			System.out.println();
		}
	}
}