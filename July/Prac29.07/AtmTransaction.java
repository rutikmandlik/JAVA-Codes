import java.util.*;
public class AtmTransaction
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int wa;
      double ab;
      System.out.println("Enter Acount Balance: ");
      ab=sc.nextDouble();
      System.out.println("Enter Withdraw amount: ");
      wa=sc.nextInt();

      if(wa % 5 != 0 )
      {
         System.out.println("Withdrawl Amount should be in terms of 5,10,15...etc");
      }
      else if(wa % 5 == 0 && wa < ab)
      {
         System.out.println("Amount Withdrawled by you is: \n" + wa);
         System.out.println("Current Balance is: " + (ab-wa-0.50)); 
      }
      else if(wa % 5 == 0 && wa > ab)
      {
         System.out.println("Insufficient Funds");
      }
   }
}