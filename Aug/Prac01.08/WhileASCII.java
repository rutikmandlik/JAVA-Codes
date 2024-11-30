import java.util.*;
public class WhileASCII
{
   public static void main(String args[])
   {
	
	int i=0;
	
	while(i<=127)
	{
	   char ch= (char)i;
	   System.out.println(" Character: "+ch +" - ASCII Value is: "+i);
	   i++;	
	}
   }
}