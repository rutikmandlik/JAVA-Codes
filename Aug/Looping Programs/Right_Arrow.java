//    *
//     *
//      *
//       *
//*********
//       *
//      *
//     *
//    *

public class Right_Arrow
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=9;i++)
	{
	   for(j=1;j<=9;j++)
	   {
		if(j==4+i||j==14-i||i==5)
		{
		   System.out.print("* ");
		}
		else
		{
		   System.out.print("  ");
		}
	   }
	   System.out.println();
	}
   }
}
