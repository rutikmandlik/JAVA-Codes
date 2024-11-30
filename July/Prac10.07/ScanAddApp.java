import java.util.*;
public class ScanAddApp
{
   public static void main(String args[])
   {
     Scanner xyz=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter first value");
     a=xyz.nextInt();
     System.out.println("Enter Second Value");
     b=xyz.nextInt();
     c=a+b;
     System.out.println("Addition is "+c);
   }
}