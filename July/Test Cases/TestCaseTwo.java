import java.util.*;
public class TestCaseTwo
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b;
      boolean c;
      System.out.println("Wants to increase volume(true/false):");
      c=sc.nextBoolean();
      System.out.println("Enter Current Volume :");
      a=sc.nextInt();
      System.out.println("Enter Expected volume:");
      b=sc.nextInt();
    
      if(c==true)
      {
          int x=b-a;
          System.out.println("He will have to press "+x  +" Buttons");
      }
      else
      {
          int x=a-b;
          System.out.println("He will have to press "+x  +" Buttons");
      } 
   }
}