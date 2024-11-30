//A
//B C
//D E F
//G H I J
//K L M N O

public class Char_Pyramid_One
{
   public static void main(String args[])
   {
	int i,j;
	char k=65;
	for(i=1;i<=5;i++)
	{
	   for(j=1;j<=5;j++)
	   {
		if(i>=j)
		System.out.print(k++ +" ");
	   }
	   System.out.print("\n");
	}
   }
}