//123454321
//1234321
//12321
//121
//1

public class No_pyramid_Three
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{  int k=1;
	   for(j=1;j<=9;j++)
	   {
	     if(j>=i && j<=10-i)
	     {
		if(j<5)
		{
		   System.out.print(k++);
		}
		else
		{
		   System.out.print(k--);
		}
	     }
	   }
	   System.out.print("\n");
	}
   }
}
