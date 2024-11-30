//   1
//  2 3
// 4 5 6
//7 8 9 10

public class Triangle_With_No
{
   public static void main(String args[])
   {
	int i,j;
	int k=1;
	for(i=1;i<=4;i++)
	{
	   boolean flag=true;
	   for(j=1;j<=7;j++)
	   {
		if((j>=5-i && j<=3+i) && flag)
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