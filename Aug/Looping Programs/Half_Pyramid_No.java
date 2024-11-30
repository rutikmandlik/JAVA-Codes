//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

public class Half_Pyramid_No
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j)
		{
		   System.out.print(j+" ");
		}
		
	   }
	   System.out.print("\n");
	}
   }
}