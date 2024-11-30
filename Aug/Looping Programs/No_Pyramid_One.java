//0        0
//01      01
//010    010
//0101  0101
//0101001010

public class No_Pyramid_One
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=10;j++)
	   {
		if(j<=i)
		{
		   if(j%2==0)
		   {
		      System.out.print("1");
		   }
		   else
		   {
		      System.out.print("0");
		   }
		}
		else if(j>=11-i)
		{
		   System.out.print(((j+i+1)%2));
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
