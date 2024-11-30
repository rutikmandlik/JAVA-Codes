import java.util.*;
public class TestCaseFirst
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter First cab price:");
          int x=sc.nextInt();
       System.out.println("Enter Second cab price:");
          int y=sc.nextInt();

          if(x<y)
          {
              System.out.println("FIRST");
          }
          else if(x>y)
          {
              System.out.println("SECOND");
          }
          else
          {
              System.out.println("ANY");
          }
       
   }
}