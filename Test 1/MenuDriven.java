import java.util.*;
public class MenuDriven
{
   public static void main(String args[])
   {
 	Scanner sc=new Scanner(System.in);
	int choice;
	

	System.out.println("choice 1: To find area of Triangle");
	System.out.println("choice 2: To find area of rectangle");
	System.out.println("choice 3: To find area of Equilateral Triangle");
	System.out.println("Enter a Choice: ");
	choice=sc.nextInt();

	switch(choice)
	{
		case 1: int b,h,area;
			System.out.println("Enter Breadth : ");
			b=sc.nextInt();
			System.out.println("Enter Height: ");
			h=sc.nextInt();
			area=((1/2)*b*h);
			System.out.println("Area of triangle is="+area);
    		break;
		case 2: int l,w,A;
			System.out.println("Enter length");
			l=sc.nextInt();
			System.out.println("Enter Width");
			w=sc.nextInt();
			A=l*w;
			System.out.println("Area of Rectangle is="+A);
		break;
		case 3: double s,a;
			System.out.println("Enter side of triangle: ");
			s=sc.nextDouble();
			a=(1.73*s*s)/4;
			System.out.println("Area of Equilateral triangle is="+a);
		break;
		default : System.out.println("Wrong Input");
 	}
   }
}