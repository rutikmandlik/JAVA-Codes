import java.util.*;
public class IfNumberSign
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no;
      System.out.print("Enter a Number: ");
      no=sc.nextInt();
  
      if(no>0)
      {
         System.out.print("Number is Positive");
      }
      if(no<0)
      {
         System.out.print("Number is Negative");
      }    
      if(no==0)
      {
         System.out.print("Number is Equal to Zero"); 
      }
   }
}