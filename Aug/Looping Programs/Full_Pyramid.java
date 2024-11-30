//     *
//    * *
//   * * * 
//  * * * *
// * * * * *
//* * * * * *

public class Full_Pyramid
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=6;i++)
	{
	   boolean flag=true;
	   for(j=1;j<=11;j++)
	   {
		if((j>=7-i && j<=5+i) && flag)
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
	   //System.out.print("\n");
	}
   }
}
