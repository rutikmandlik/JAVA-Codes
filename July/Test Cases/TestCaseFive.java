import java.util.*;
public class TestCaseFive
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Credit Score");
      int Credit=sc.nextInt();

      if(Credit>=750 && Credit<1000)
      {
     	 System.out.println("Possible to access CRED program");
      }
      else if(Credit<750 && Credit<1000)
      {
 	 System.out.println("NOT Possible to access CRED program");
      }
      else
      {
          System.out.println("ERROR");
      }
   }
}