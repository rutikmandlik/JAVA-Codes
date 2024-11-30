import java.util.*;
public class TriangleAddApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a1,a2,a3;
      System.out.println("Enter the Angles");
      System.out.print("Angle 1:");
      a1=sc.nextInt();
      System.out.print("Angle 2:");
      a2=sc.nextInt();
      System.out.print("Angle 3:");
      a3=sc.nextInt();
     
      int triangle=a1+a2+a3;
      String result=(triangle==180)? "Triangle is Valid" : "Triangle is Not Valid"  ;
      System.out.println("Answer is: "+result);
   }
}