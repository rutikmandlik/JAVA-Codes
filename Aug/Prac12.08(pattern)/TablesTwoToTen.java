public class TablesTwoToTen
{
   public static void main(String args[])throws Exception
   {
	int i,j;
	for(i=1;i<=10;i++)
	{
	   for(j=1;j<=10;j++)
	   {
	 	System.out.printf("%d\t",i*j);
		     Thread.sleep(100);
	   }
	   System.out.printf("\n");
	}
   }
}