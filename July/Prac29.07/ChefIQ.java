import java.util.*;
public class ChefIQ
{
    public static void main(String args[])
    {
 	Scanner sc=new Scanner(System.in);
        int IQ;
        System.out.println("Enter IQ of Chef: ");
 	IQ=sc.nextInt();

 	if(IQ + 7 >= 170)
 	{
 		System.out.println("YES");
 	}
 	else
 	{
 		System.out.println("NO");
 	}
    }
}