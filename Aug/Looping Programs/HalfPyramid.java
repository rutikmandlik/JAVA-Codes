//*
//**
//***
//****
//*****
//******

public class HalfPyramid
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=6;i++)
	{
	   for(j=1;j<=6;j++)
	   {
	 	if(i>=j)
		{
		   System.out.print("* ");
		}
	   }
	   System.out.print("\n");
	}
   }
}