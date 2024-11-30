//    1
//   232
//  34543
// 4567654
//567898765


public class Full_Pyramid_No
{
   public static void main(String args[])
   {
	int i,j;
	int k = 0;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=9;j++)
	   {
		if(j>=6-i && j<=4+i)
		{
		   if(j<=5)
		   {
			System.out.print(++k);
		   }
		   else if(j>=6)
		   {
			System.out.print(--k);
		   }
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