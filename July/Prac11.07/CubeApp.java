import java.util.*;
public class CubeApp
{
   public static void main(String args[])
   {
     Scanner T=new Scanner(System.in);
     int a,cube,fourth;
     System.out.println("Enter a no.");
     a=T.nextInt();
     cube=a*a*a;
     fourth=a*a*a*a;
     System.out.println("Cube is:"+cube);
     System.out.println("Fourth power is:"+fourth);
   }
}   