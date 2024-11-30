import java.util.*;
public class IfCheckAlphaDigitSpecialchar
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      char ch;
      System.out.println("Enter a input: ");
      ch=sc.next().charAt(0);
      
      if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
      {
          System.out.println("It is a Alphabet");
      }
      else if(ch>='0' && ch<='9')
      {
          System.out.println("It is a Digit");
      }
      else
      {
          System.out.println("It is a Special Character");
      }
   }
}