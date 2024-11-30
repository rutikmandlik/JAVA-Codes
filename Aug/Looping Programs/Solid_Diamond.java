//    *
//   * *
//  * * *
// * * * *
//* * * * * 
//* * * * *
// * * * *
//  * * *
//   * *
//    *


public class Solid_Diamond
{
   public static void main(String args[])
   {
 	int i,j;
	for(i=1;i<=10;i++)
	{
	   boolean flag=true;
	   for(j=1;j<=9;j++)
	   {
		if(((j>=6-i && j<=4+i && i<=6) || (i>=7 && j>=i-5 && j<=15-i ))&& flag )
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