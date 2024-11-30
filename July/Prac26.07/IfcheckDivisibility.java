import java.util.*;
public class IfcheckDivisibility
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no;
      System.out.println("Enter a Number: ");
      no=sc.nextInt();
     
      if(no%5==0 && no%11==0)
      {
         System.out.println("Number is DIvisible by 5 & 11");
      }
      else
      {
         System.out.println("Number is Not Divisble by 5 & 11");
      }
   }
} 