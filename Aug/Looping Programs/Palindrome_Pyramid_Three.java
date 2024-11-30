//    1
//   121
//  12321
// 1234321
//123454321

public class Palindrome_Pyramid_Three
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   int k = 0;
	   for(j=1;j<=9;j++)
	   {
		if(j>=6-i && j<=4+i)
		{
		   if(j<=5)
		   {
		 	System.out.print(++k);
		   }
		   else if(j>=6)
		   {
			System.out.print(--k);
		   }
		}
		else
		{
		   System.out.print(" ");
		}
	   }
	   System.out.print("\n");
	}
   }
}