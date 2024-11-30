//1 2 3 4 5 6
// 2 3 4 5 6
//  3 4 5 6
//   4 5 6
//    5 6 
//     6
//    5 6
//   4 5 6
//  3 4 5 6
// 2 3 4 5 6
//1 2 3 4 5 6

public class Pattern1
{
   public static void main(String args[])
   {
	for(int i=1;i<=11;i++)
	{
	   int n=i;
	   int s=12-i;
	   boolean flag=true;
	   for(int j=1;j<=11;j++)
	   {
		if((i<=6 && j>=i && j<=12-i)&&flag) 
		{
		   System.out.print(n++ +" ");
		   flag = false;
		}
		else if((i>6 && j>=12-i && j<=i )&&flag)
		{
		   System.out.print(s++ +" ");
		   flag = false;
		}
		else
		{
		   System.out.print("  ");
		   flag = true;
		}
	   }
	  System.out.println();
	}
   }
}