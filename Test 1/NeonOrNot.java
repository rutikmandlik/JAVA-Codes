import java.util.*;
public class NeonOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,sqr,r,p,sum=0;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();        =9
	
	sqr=no*no;              =9*9=81
	
	r=sqr%10;               =81%10=1
	sum=sum+r;                                  =0+1=1
	p=sqr/10;                =81/10=8
	sum=sum+p;               =1+8=9

	String res=(sum==no)? "It is a Neon Number" : "it is Not a Neon Number" ;   //check Neon by using Conditional Operator
	System.out.println(res);
   }
}