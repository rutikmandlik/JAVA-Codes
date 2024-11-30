//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//1 6 15 20 15 6 1

public class Pascals_Triangle
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=7;i++)
	{
	   int k=1;
	   for(j=1;j<=7;j++)
	   {
	   	if(i>=j)
		{
		   System.out.print(k+" ");
		   k=k*(i-j)/j;
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