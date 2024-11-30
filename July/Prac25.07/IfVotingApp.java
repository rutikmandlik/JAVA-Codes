import java.util.*;
public class IfVotingApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int age;
      System.out.print("Enter age of Candidate: ");
      age=sc.nextInt();

      if(age>=18)
      {
         System.out.print("Candidate is Eligible for cast his vote ");
         
      }
      else
      {
         System.out.print("Candidate is not Eligible for cast his vote");
      }
   }
}






































