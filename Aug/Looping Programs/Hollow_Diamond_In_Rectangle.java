//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********

public class Hollow_Diamond_In_Rectangle
{
   public  static void main(String args[])
   {
	int i,j;
	for(i=1;i<=10;i++)
	{
	   for(j=1;j<=10;j++)
	   {
		if(((j<=6-i || j>=5+i)&& i<=5)||((j<=i-5 || j>=16-i) && i>=6))
		{
  		   System.out.print("* ");
		}
		else
		{
		   System.out.print("  ");
		}
	   }
	   System.out.print("\n");
	}
   }
}