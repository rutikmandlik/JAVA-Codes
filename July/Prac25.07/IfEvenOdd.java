import java.util.*;
public class IfEvenOdd
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no;
      System.out.print("Enter a Number: ");
      no=sc.nextInt();
  
      if(no%2==0)
      {
         System.out.print("Number is Even");
     
      }
      else
      {
         System.out.print("Number is Odd");
      }
   }
}