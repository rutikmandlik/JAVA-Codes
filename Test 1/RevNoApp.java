import java.util.*;
public class RevNoApp
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int no,rem,rev=0;
	System.out.println("Enter a Number: ");
	no=sc.nextInt();     //Input a Number    =123

	rem=no%10;             //to take last digit  123%10=3
 	rev=rev*10+rem;        //store last digit in reverse  =0*10+3 =3
	no=no/10;              //delete last digit from number  =123/10 =12 

	rem=no%10;           //12%10=2 
 	rev=rev*10+rem;      //3*10+2=32
	no=no/10;            //12/10= 1

	rem=no%10;           //1%10=1
 	rev=rev*10+rem;      //32*10+1=321
	no=no/10;

	System.out.println("Reverse Number is: "+rev);     //print Reversed Number
   }
}