import java.util.*;
public class IfCheckHeight
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double h;
      System.out.println("Enter Height of Person(in cm): ");
      h=sc.nextDouble();
 
      if(h<150.0)
      {
         System.out.println("Person is Dwarf :-( ");
      }
      else if(h>=150.0 && h<165.0)
      {
         System.out.println("The Person is Average Heighted :-) ");
      }
      else if(h>=165.0 && h<200.0)
      {
          System.out.println("Person is Taller B-) ");
      }
      else
      {
          System.out.println("He is Allien");
      }

   }
}