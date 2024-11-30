import java.util.*;
public class IfCheckTriangleEIS
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int s1,s2,s3;
      System.out.print("Enter First Side: ");
      s1=sc.nextInt();
      System.out.print("Enter Second Side: ");
      s2=sc.nextInt();
      System.out.print("Enter Third side: ");
      s3=sc.nextInt();
 

      if(s1==s2 && s2==s3 )
      {
        System.out.print("This is Equilateral Triangle");
      }
      else if(s1==s2 || s1==s3 || s2==s3)
      {
         System.out.print("This is isosceles Triangle");
      }
      else
      {
         System.out.print("This is Scalene Triangle");
      }
   }
}