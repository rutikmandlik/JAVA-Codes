import java.util.*;
public class WhileSumOfDigit
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner (System.in);
	int sum=0,n;                            //n=123
	System.out.println("Enter A Number: ");
	n=sc.nextInt();

	while(n>0)
	{
		sum=sum+(n % 10);               //3  ,  sum=0+3 , sum=3+2 , sum=5+1  
		n=n/10;                         //12 , 1 , 0
	}
	System.out.println("Sum of Digit is: "+sum);    //sum=6
   }
}