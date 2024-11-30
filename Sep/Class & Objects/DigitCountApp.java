import java.util.*;
class DigitCount
{
   int n;
   int count=0;
   void setValue(int no)
   {
	n=no;
   }
   int getDigitCount()
   {
	while(n != 0)
	{
	   n=n/10;
	   count++;
	}
	return count;
   }
   
}
public class DigitCountApp
{
   public static void main(String args[])
   {
	DigitCount dc=new DigitCount();
	dc.setValue(123);
	System.out.print("Digits are: "+dc.getDigitCount());
   }
}
