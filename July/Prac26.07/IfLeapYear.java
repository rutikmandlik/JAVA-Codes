import java.util.*;
public class IfLeapYear
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int y;
      System.out.print("Enter a Year: ");
      y=sc.nextInt();
      
      if(y%4==0 && y%100!=0 || y%400==0)
      {
         System.out.print("This is a Leap Year");
      }
      else
      {
         System.out.print("This is Ordinary Year");
      }
   }
}