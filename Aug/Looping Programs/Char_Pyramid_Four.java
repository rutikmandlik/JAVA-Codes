//A
//ABA
//ABCBA
//ABCDCBA
//ABCDEDCBA

public class Char_Pyramid_Four
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   char k=65;
	   for(j=1;j<=9;j++)
	   {
		if(j>=6-i && j<=4+i)
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