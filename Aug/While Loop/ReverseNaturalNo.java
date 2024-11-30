import java.util.*;
public class ReverseNaturalNo
{
   public static void main(String args[])
   {
	int i=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Nth no:");
	int no=sc.nextInt();
	while(no>=i)
	{
	   System.out.println(no);
	   no--;
	}
   }
}