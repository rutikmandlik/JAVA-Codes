//A B C D E
//B C D E F
//C D E F G
//D E F G H
//E F G H I

public class AlphaSquare
{
   public static void main(String args[])
   {
	int i,j,a=63;
	for(i=1;i<=5;i++)
	{
 	   for(j=1;j<=5;j++)
	   {   
	       System.out.print((char)(a+j+i)+" ");
	   }
	   System.out.print("\n");
	}
   }
}