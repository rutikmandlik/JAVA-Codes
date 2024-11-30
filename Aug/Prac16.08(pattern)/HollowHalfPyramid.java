//*
//** 
//* *
//*  * 
//*****

public class HollowHalfPyramid
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(j==1 || i==5 || j==i)
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