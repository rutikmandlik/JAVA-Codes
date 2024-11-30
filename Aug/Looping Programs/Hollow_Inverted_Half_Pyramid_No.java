//1 2 3 4 5
//2     5 
//3   5
//4 5
//5

public class Hollow_Inverted_Half_Pyramid_No
{
   public  static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
	 	if(i==1)
		{
		   System.out.print(j+" ");
		}
		else if(j==1)
		{
		   System.out.print(i+" ");
		}
		else if(j==6-i)
		{
		   System.out.print("5 ");
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