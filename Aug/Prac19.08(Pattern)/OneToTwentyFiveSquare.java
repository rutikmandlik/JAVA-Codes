//1  2  3  4  5
//6  7  8  9  10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25

public class OneToTwentyFiveSquare
{
   public static void main(String args[])
   {
	int i,j,k=1;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {    if(i<3)
		{
		   System.out.printf("%d  ",k++);
		}
		else
		{
		   System.out.printf("%d ",k++);
		}
	   }
	   System.out.print("\n");
	}
   }
}