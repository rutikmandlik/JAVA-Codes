//0
//1 1
//0 0 0
//1 1 1 1
//0 0 0 0 0

public class ZeroOneOnRowsHalfPyramid
{
   public  static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j)
		{
			if(i==1 || i==3 || i==5)
			{
			   System.out.print("0 ");
			}
			else
			{
			   System.out.print("1 ");
			}
		}
	   }
	   System.out.print("\n");
	}
   }
}