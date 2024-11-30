//1
//2*3
//4*5*6
//7*8*9*10
//7*8*9*10  
//4*5*6
//2*3
//1

public class Solid_Half_Diamod_Three
{
   public static void main(String args[]) throws Exception
   {
	int i,j;
	int k=1;
	for(i=1;i<=8;i++)
	{  
	   boolean flag=true;
	   if(i==5)
	   {
		k=7;
	   }
	   else if(i>=6)
	   {
		k=(k/2)-1;
	   }
	   for(j=1;j<=7;j++)
	   {
		if((j>=5-i && j<=3+i && i<=4)||(j>=i-4 && j<=12-i && i>=5))
		{
		   if(flag)
		   {
			System.out.print(k++);
		 	flag=false;
		   }
		   else 
		   {
			System.out.print("*");
			flag=true;
		   }
		Thread.sleep(200);
		}
	   }
	   System.out.print("\n");
	}
   }
}