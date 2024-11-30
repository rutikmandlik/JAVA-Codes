//ABCDEDCBA
//ABCD DCBA
//ABC   CBA
//AB     BA
//A       A


public class Char_Pyramid_Two
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{  char k=65;
	   for(j=1;j<=9;j++)
	   {
		if(j<=6-i || j>=4+i)
		{  
		   if(j<=4)
		   {
	 	      System.out.print(k++);
		   }
		   else if(j==5)
		   {
		      	System.out.print(k);
		   }
		   else
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