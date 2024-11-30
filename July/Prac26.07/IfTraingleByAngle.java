import java.util.*;
public class IfTraingleByAngle
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a1,a2,a3;
      System.out.print("Enter First Angle: ");
      a1=sc.nextInt();
      System.out.print("Enter Second Angle: ");
      a2=sc.nextInt();
      System.out.print("Enter Third Angle: ");
      a3=sc.nextInt();
 
      int x=a1+a2+a3;
 
      if(x==180)
      {
         System.out.print("It is Valid Trianle");
      }
      else
      {
         System.out.print("It is Invalid Triangle ");
      }
   }
}