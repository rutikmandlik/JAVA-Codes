import java.util.*;
public class MaxBetThreeNo
{
   public static void main(String args[])
   {
  	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter a First Number: ");
	a=sc.nextInt();                                    //Input First Number
	System.out.println("Enter a Second Number: ");
	b=sc.nextInt();                                    //Input Second Number
	System.out.println("Enter a Third Number: ");
	c=sc.nextInt();                                    //Input Third Number

	if(a>b && a>c)          //Check First is Greater or Not
	{
		System.out.println("First Number is Greater");
	}
	else if(b>a && b>c)     //Check Second is Greater or Not
	{
		System.out.println("Second Number is Greater");
 	}
	else                    //Check Third Is Greater or Not
	{
		System.out.println("Third Number is Greater");
	}
   }
}