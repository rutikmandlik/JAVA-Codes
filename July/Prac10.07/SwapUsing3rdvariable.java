import java.util.*;
public class SwapUsing3rdvariable
{
   public static void main(String args[])
   {
      Scanner x=new Scanner(System.in);
      int a,b,c;
      System.out.println("Before Swapping:");
      System.out.println("A:");
      a=x.nextInt();
      System.out.println("B:");
      b=x.nextInt();
       
      c=a;
      a=b;
      b=c;
      System.out.println("After Swapping:");
      System.out.println("A:"+a);
      System.out.println("B:"+b);
   }
}