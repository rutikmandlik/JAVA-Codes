public class Pattern_Ojne
{
   public static void main(String args[])
   {
 	int i,j;
	for(i=1;i<=9;i++)    //to print rows
	{  boolean flag=true;    //use flag to print space after character
	   char k=65;
	   for(j=1;j<=17;j++)   //to print columns
	   {
		if((j>=10-i && j<=8+i)&& flag)   //logic for shape
		{
		   System.out.print(k++);
	 	   flag=false;
		}
		else
		{
		   System.out.print(" ");
		   flag=true;
		}
	   }
	   System.out.print("\n");
	}
   }
}