public class Pattern_Two
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=19;i++)   //to print rows
	{
	   for(j=1;j<=10;j++) //to print columns
	   {
		if((j>=11-i && i<=10)||(j>=i-9 && i>=11))   //logic for Shape
		{
		   System.out.print("# ");
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