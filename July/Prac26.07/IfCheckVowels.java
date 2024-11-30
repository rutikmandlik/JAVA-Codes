import java.util.*;
public class IfCheckVowels
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      char ch;
      System.out.print("Enter any Character: ");
      ch=sc.next().charAt(0);

      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
      {
         System.out.println("It is Vowel");
      }
      else
      {
         System.out.println("It is Consonant");    
      } 
   }
}