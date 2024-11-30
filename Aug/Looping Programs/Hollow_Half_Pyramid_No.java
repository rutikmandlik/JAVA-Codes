//1
//1 2
//1   3
//1     4
//1 2 3 4 5

public class Hollow_Half_Pyramid_No
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i==5 || j==1 || i==j)
		{
		   System.out.print(j+" ");
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
