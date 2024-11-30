//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1

public class Palindrome_Pyramid_one
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++)
	{  
	   int k=0;
	   for(j=1;j<=9;j++)
	   {
	      	
		if(j<=i)
		{
		   System.out.print(++k);
		}
		else if(j<=i+(i-1))
		{
		   System.out.print(--k);
		}
	     	else
	     	{
		   System.out.print(" ");
	     	}
	   }
	   System.out.print("\n");
	}
   }
}