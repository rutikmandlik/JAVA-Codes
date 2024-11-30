//*
//* *
//* * *
//* 
//* *
//* * *

public class StarPattern
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=6;i++)
	{
	   for(j=1;j<=3;j++)
	   {
		if((i<=3 && j<=0+i) || (i>3 && j<=i-3))
		{
		   System.out.print("* ");
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