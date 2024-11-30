//1        1
//12      21
//123    321
//1234  4321
//1234554321

public class No_Pyramid_Two
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   int k=i;
	   for(j=1;j<=10;j++)
	   {
		if(i>=j)
		{
		   System.out.print(j);
		}
		else if(j>=11-i)
		{
		   System.out.print(k--);
		}
		else
		{
		   System.out.print(" ");
		}
	   }
	   System.out.print("\n");
	}
   }
}