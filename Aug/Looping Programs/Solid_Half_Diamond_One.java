//3
//44
//555
//6666
//555
//44
//3

public class Solid_Half_Diamond_One
{
   public static void main(String args[])
   {
	int i,j;
	int k=2;
	
	for(i=1;i<=7;i++)
	{
	   //int k=2;
	   for(j=1;j<=4;j++)
	   {
	 	if(i>=j && j<=8-i)
		{
		   if(i<=4)
		   {    
		      	System.out.print(k+i);
		    	
		   }
		   else
		   {   
			 
		      System.out.print(k+(8-i));
		   }
		}
		//else
		//{
		  // System.out.print(" ");
		//}
	   }
	   System.out.print("\n");
	}
   }
}