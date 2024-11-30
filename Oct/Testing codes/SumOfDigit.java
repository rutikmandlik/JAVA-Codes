public class SumOfDigit
{
   public static void main(String args[])
   {
	String s= "10rutik53abhi123java978html1";
	int sum=0;
	int n=0;                //initialize to track current number
	for(int i=0;i<s.length();i++)
	{
	   char c = s.charAt(i);
	   
 	   if(c >= '0' && c <= '9')
	   {
		int digit = c - '0';
		n = n*10+digit;
	   }else{
		sum = sum + n;
		n=0;
	   }
	}
	sum = sum + n;
	System.out.println("Sum of all numbers: "+sum);
   }
}