import java.util.*;
public class TelephoneBill
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number of Calls: ");
	int no=sc.nextInt();
	if(no<=100)
	{
	   System.out.print("Telephone Bill  is: Rs.200");
	}
	else if(no<=150 && no>100)
	{
	   int a=no-100;
	   double s=(a*0.60)+200;   //0.60 rs added per call + minimum RS 200
	   System.out.print("Telephone bill is: Rs."+s);
	}
	else if(no<=200 && no>150)
	{
	   int a=no-150;
	   double s=(a*0.50)+200;   //0.50 rs added per call + minimum RS 200
	   System.out.print("Telephone bill is: Rs."+s);
	}
	else if(no>200)
	{
	   int a=no-200;
	   double s=(a*0.40)+200;   //0.40 rs added per call + minimum RS 200
	   System.out.print("Telephone bill is: Rs."+s);
	}
   }
}