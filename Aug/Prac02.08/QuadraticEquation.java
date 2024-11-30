import java.util.*;
public class QuadraticEquation
{
   public static void main(String args[])
   {
    	Scanner sc=new Scanner(System.in);
	int a,b,c;
	double d,root1,root2;
	
 	System.out.println("Enter Value of A:");
	a=sc.nextInt();
	System.out.println("Enter Value of B:");
	b=sc.nextInt();
	System.out.println("Enter Value of C:");
	c=sc.nextInt();

	d=b*b-4*a*c;
	//System.out.println(d);

	if(d>0)
	{
	   System.out.println("Roots are real & Different: ");
	   root1=(-b + Math.sqrt(d))/(2*a);
	   root2=(-b - Math.sqrt(d))/(2*a);

	   System.out.printf("Root1=%.3f \nRoot2=%.3f",root1,root2);
	}
	else if(d==0)
	{
	   System.out.println("Roots are Real & Equal: ")
	   root1=(-b + Math.sqrt(0))/(2*a);
	   root2=(-b - Math.sqrt(0))/(2*a);

	   System.out.println("Root1=%.3f \nRoot2=%.3f",root1,root2);
	}
	else
	{
	   System.out.println("Roots are Imaginary");
	}
   }
}