import java.util.*;
public class IfPalindrome
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,temp,rem,rev=0;
      System.out.print("Enter a Number: ");
      a=sc.nextInt();
 
      temp=a;
      
      rem=a%10;
      rev=rev*10+rem;
      a=a/10;

      rem=a%10;
      rev=rev*10+rem;
      a=a/10;

      rem=a%10;
      rev=rev*10+rem;
      a=a/10;
     
      if(rev==temp)
      {
         System.out.print("Number is Palindrome");
      }
      else
      {
         System.out.print("Number is Not Palindrome");
      } 
   }
}