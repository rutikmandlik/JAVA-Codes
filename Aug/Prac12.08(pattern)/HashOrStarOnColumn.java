//*
//* #
//* # *
//* # * #
//* # * # *

public class HashOrStarOnColumn
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j)
		{
		   if(j==2 || j==4)
		   {
			System.out.print("# ");
		   }
		   else
		   {
			System.out.print("* ");
		   }
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