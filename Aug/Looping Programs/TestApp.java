//    1
//   1 2
//  1   3
// 1     4
//1 2 3 4 5

public class TestApp
{
   public static void main(String args[])
   {
	int i,j;
	
	for(i=1;i<=5;i++)
	{  int k = 1;
	   boolean flag = true;
	   for(j=1;j<=9;j++)
	   {
		if((j==6-i || j==4+i) && flag)
		{
		   
			System.out.print(k);
			k++;
		   
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