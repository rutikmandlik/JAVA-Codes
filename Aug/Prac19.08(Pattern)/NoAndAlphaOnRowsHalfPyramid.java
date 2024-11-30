//1
//A B
//2 3 4
//C D E F
//5 6 7 8 9

public class NoAndAlphaOnRowsHalfPyramid
{
   public static void main(String args[])
   {
	int i,j,k=1,a=65;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j)
		{
		   if(i==1 || i==3 || i==5)
		   {
		 	System.out.printf("%d ",k++);
		   }
		   else
		   {
			System.out.print((char)(a+j)+" ");
		   }	
		}
	   }
	   System.out.print("\n");
	}
   }
}