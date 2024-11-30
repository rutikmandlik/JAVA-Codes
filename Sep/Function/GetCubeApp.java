import java.util.*;
public class GetCubeApp
{
   public static void main(String args[])
   {
	int no;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number: ");
	no=sc.nextInt();
	int result=getCube(no);
	System.out.print("Cube is: "+result);
   }
   public static int getCube(int x)
   {
	return x*x*x;
   }
}