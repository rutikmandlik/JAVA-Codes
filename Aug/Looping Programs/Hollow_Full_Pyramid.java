//     *
//    * *
//   *   *
//  *     *
// *       *
//* * * * * *

public class Hollow_Full_Pyramid
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=6;i++)
	{
	   boolean flag=true;
	   for(j=1;j<=11;j++)
	   {
		if((i==6 || j==7-i || j==5+i)&& flag)
		{
		   System.out.print("* ");
		   flag=false;
		}
		else
		{
		   System.out.print("  ");
		   flag=true;
		}
	   }
	   System.out.print("\n");
	}
   }
}