//*
//**
//***
//****
//*****
//****
//***
//**
//*

public class Solid_Half_Diamond
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=9;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j && j<=10-i)
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