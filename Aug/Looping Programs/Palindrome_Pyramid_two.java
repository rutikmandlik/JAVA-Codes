//A
//A B A
//A B C B A
//A B C D C B A 
//A B C D E D C B A

public class Palindrome_Pyramid_two
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   char ch=64;
	   for(j=1;j<=9;j++)
	   {
		if(j<=i)
		{
		   System.out.print(++ch+" ");
		}
		else if(j<=i+(i-1))
		{
		   System.out.print(--ch+" ");
		}
		else
		{
		   System.out.print("  ");
		}
	   }
	   System.out.print("\n");
	}
   }
}
