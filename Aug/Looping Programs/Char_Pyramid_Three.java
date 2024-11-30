//A
//BAB
//CBABC
//DCBABCD
//EDCBABCDE

public class Char_Pyramid_Three
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   char k=(char)(64+i);
	   for(j=1;j<=9;j++)
	   {
		if(j>=6-i && j<=4+i)
		{  
		   if(j<5)
		   {
			System.out.print(k--);
		   }
		   else 
		   {
			System.out.print(k++);
		   }
		}
		
	   }
	   System.out.print("\n");
	}
   }
}