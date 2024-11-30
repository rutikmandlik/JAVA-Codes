public class Full_Pyramid_No2
{
   public static void main(String args[])
   {
	int i,j,k,c=1,s=1;
	for(i=1;i<=5;i++)
	{
		
		
	for(k=(5-i);k>=1;k--)
	   {
		System.out.print(" ");
	   }
	
	   for(j=1;j<=c;j++)
	   {
		
			System.out.print(s);//i+j-5
			

		if(c>1)
		{
		   if(j<=c/2)
		   s++;
		   else
		   s--;
		} 
		else
		{
		   s++;
		}
		
		 
		
	   }
	   s=(c-i)+2;
	   c=c+2;
	   System.out.print("\n");
	}
   }
}