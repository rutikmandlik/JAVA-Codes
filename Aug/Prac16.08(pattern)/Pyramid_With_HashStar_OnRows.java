//    #
//   * *
//  # # #
// * * * *
//# # # # #

public class Pyramid_With_HashStar_OnRows
{
   public static void main(String args[])
   {
      	int i,j;
      	for(i=1;i<=5;i++)
      	{
	   boolean flag=true;
	   for(j=1;j<=9;j++)
	   {
		if(i==1 || i==3 || i==5)
		{
		   if((j>=6-i && j<=4+i)&& flag)
		   {
			System.out.print("# ");
			flag=false;
		   }
		   else
		   {
			System.out.print("  ");
			flag=true;
		   }
		}
		else
		{
		   if((j>=6-i && j<=4+i)&& flag)
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
	   }
	   System.out.print("\n");
	}
   }
}