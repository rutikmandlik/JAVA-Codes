//********1********
//*******2*2*******
//******3*3*3******
//*****4*4*4*4*****
//****5*5*5*5*5****

public class Palindrome_Pyramid_Four
{
   public static void main(String args[])
   {    
	int i,j;
	for(i=1;i<=5;i++)
	{  boolean flag=true;
	   for(j=1;j<=17;j++)
	   {
		if((j>=10-i && j<=8+i) && flag)
		{
		    System.out.print(i);
		    flag=false;
		}
		else
		{
		    System.out.print("*");
		    flag=true;
		}
	   }
	   System.out.print("\n");
	}
   }
}