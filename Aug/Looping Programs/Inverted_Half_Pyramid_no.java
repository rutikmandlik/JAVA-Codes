//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class Inverted_Half_Pyramid_no
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(j<=6-i)
		{
		   System.out.print(j+" ");
		}
	   }
	   System.out.print("\n");
	}
   }
}