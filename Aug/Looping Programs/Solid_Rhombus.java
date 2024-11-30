//   ****
//  ****
// ****
//****

public class Solid_Rhombus
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=4;i++)
	{
	   for(j=1;j<=7;j++)
	   {
		if((j>=5-i && j<=4)||(j<=8-i && j>4)) 
		{
		   System.out.print("*");
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
