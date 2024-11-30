import java.util.*;
public class IfCheckUpperLowerCase
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      char ch;
      System.out.println("Enter a Character: ");
      ch=sc.next().charAt(0);

      if(ch>='A' && ch<='Z')
      {
         System.out.println("It is Uppercase ");
      }
      else
      {
         System.out.println("It is Lowercase");
      }
   }
}