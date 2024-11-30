
public class ConsonantApp
{
   public static void main(String args[])
   { 
	int a;
	for(a=65;a<=90;a++)
	{
	   if(a!='A' && a!='E' && a!='I' && a!='O' && a!='U' )   //condition for not equal to Vowels
	   {
		if(a%2==0)       //condition for  Even no
		{
		   System.out.print((char)(a)+" ");
		}
	   }
	}
   }
}