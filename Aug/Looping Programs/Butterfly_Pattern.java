//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *

public class Butterfly_Pattern
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=10;i++)
	{
	   for(j=1;j<=10;j++)
	   {
		if(((j<=i || j>=11-i) && i<=6)||((j<=11-i || j>=i)&& i>=7))
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