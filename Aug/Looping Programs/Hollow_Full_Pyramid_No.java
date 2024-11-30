//    1
//   1 2
//  1   3
// 1     4
//1 2 3 4 5

public class Hollow_Full_Pyramid_No
{
   public static void main(String args[])
   {
	int i,j;
	
	for(i=1;i<=5;i++)
	{  int k = 1;
	   
	   for(j=1;j<=9;j++)
	   {
		if(j == 6-i)
		{
		   System.out.print(k);
		}
		else if(j==4+i)
		{
		   System.out.print(i);
		}
		else if(i==5 && j%2==1)
		{
		   System.out.print(++k);
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