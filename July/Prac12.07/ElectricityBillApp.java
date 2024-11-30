import java.util.*;
public class ElectricityBillApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double a,Bill,finalBill;
      System.out.print("Enter Electricity Bill Units:");
      a=sc.nextInt();

      Double res=(a<50)?  a*0.50 :
                 (a<150)? a*0.75:
                 (a<250)? a*1.20:
                          a*1.50 ;
                           
     System.out.println("Without Charge bill is= "+res);
     Bill = res * 0.2;
     System.out.println("Additional charge is = "+Bill);
     finalBill = Bill + res;
     System.out.print("The Final Bill is= "+finalBill);
   }
}