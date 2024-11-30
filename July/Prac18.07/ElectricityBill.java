import java.util.*;
public class ElectricityBill
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double unit,rate,bill,finalbill;
      System.out.print("Enter the Meter Unit: ");
      unit=sc.nextDouble();
      System.out.print("Enter per unit rate: ");
      rate=sc.nextDouble();
      
      bill=unit*rate;
      System.out.print("Total Bill: "+bill);
     
      Double res=bill>2000? bill*0.2 : bill*0.05 ;
      System.out.print("\nDiscount is: "+res);
      
      finalbill= bill - res;
      System.out.print("\nFinal Bill is: "+finalbill);
   }
}