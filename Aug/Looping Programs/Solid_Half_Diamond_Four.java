//*
//* 1 *
//* 1 2 1 *
//* 1 2 3 2 1 *
//* 1 2 1 *
//* 1 *
//*

public class Solid_Half_Diamond_Four
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=7;i++)
	{  
	   int k=0;
	   for(j=1;j<=7;j++)
	   {
		if(((j==5-i || j==3+i) && i<=4) || ((j==i-3 || j==11-i) && i>=5))
		{
		   System.out.print("*"+" ");
		}
		else if((j>=6-i && j<=2+i && i<=4) || (j>=i-2 && j<=10-i) && i>=5)
		{
		   if(j<=4)
		   {
			System.out.print(++k+" ");
		   }
		   else
		   {
			System.out.print(--k+" ");
		   }
		}
		else
		{System.out.print("  ");
		}
	   }
	   System.out.print("\n");
	}
   }
}