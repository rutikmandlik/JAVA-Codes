import java.util.*;
public class ArmstrongApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int fnum,snum,tnum,number;
		System.out.println("Enter number: ");
		number = sc.nextInt();
		System.out.println("Enter first number: ");
		fnum = sc.nextInt();
		System.out.println("Enter second number: ");
		snum = sc.nextInt();
		System.out.println("Enter third number: ");
		tnum = sc.nextInt();
                int no1=fnum*fnum*fnum;
                int no2=snum*snum*snum;
                int no3=tnum*tnum*tnum;
		
		String result =(no1 + no2 + no3)==number?
			     " The Given Number is Armstrong " : " The Given Number is not Armstrong"; 
		System.out.println(result);
	}
}