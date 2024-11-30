//   1
//  2 3
// 4 5 6
//7 8 9 10


public class NumberPattern
{
   public static void main(String args[])
   {
	int i,j,k=0;
	for(i=1;i<=4;i++)
	{   boolean flag=true;
	   for(j=1;j<=7;j++)
	   {
		if((j>=5-i && j<=3+i) && flag)
		{
			System.out.printf("%d ",++k);
			flag=false;
   		}
		else
		{
			System.out.printf("  ");
			flag=true;
		}
	   }
	   System.out.printf("\n");
	}
   }
}