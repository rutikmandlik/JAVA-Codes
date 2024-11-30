//A        A
//AB      BA
//ABC    CBA
//ABCD  DCBA
//ABCDEEDCBA

public class s1q2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			char k=64;
			for(int j=1;j<=10;j++)
			{
				if(i>=j)
				{
					System.out.print(++k);
				}
				else if(j>=11-i)
				{
					System.out.print(k--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}