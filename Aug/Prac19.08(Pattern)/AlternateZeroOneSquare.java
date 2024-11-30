//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0

public class AlternateZeroOneSquare
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i==1 || i==3 || i==5)
		{
		   if(j%2==1)
		   {
			System.out.print("0 ");
		   }
		   else
		   {
			System.out.print("1 ");
		   }
		}
		else if(i==2 || i==4)
		{
		   if(j%2==1)
		   {
			System.out.print("1 ");
		   }
		   else
		   {
			System.out.print("0 ");
		   }
		}
	   }
	   System.out.print("\n");
	}
   }
}
