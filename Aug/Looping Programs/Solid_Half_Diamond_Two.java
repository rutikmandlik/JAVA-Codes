//1
//2*2
//3*3*3
//4*4*4*4
//4*4*4*4
//3*3*3
//2*2
//1

public class Solid_Half_Diamond_Two
{
   public static void main(String args[])
   {
	int i,j;
	int k=0;
	for(i=1;i<=8;i++)
	{  
	   boolean flag=true;
	   if(i<=4)
	   {
		++k;
	   }
	   else if(i>=6)
	   {
		--k;
	   }
	   for(j=1;j<=7;j++)
	   {
		if((j>=5-i && j<=3+i &&i<=4)||(j>=i-4 && j<=12-i && i>=5))
		{  if(flag)
		   {
		   	System.out.print(k);
		   	flag=false;
		   }
		
		   else 
		   {
		   	System.out.print("*");
		   	flag=true;
		   }
		}
		
	   }
	   System.out.print("\n");
	}
   }
}