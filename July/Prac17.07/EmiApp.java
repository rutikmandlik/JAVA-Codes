import java.util.*;
public class EmiApp
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     double p,r,m,emi;
     System.out.println("Enter the Principle amount: ");
     p=sc.nextDouble();
     System.out.println("Enter the Interest Rate: ");
     r=sc.nextDouble();
     System.out.println("Enter the Period in Month: ");
     m=sc.nextInt();
     
     double monthlyRate=r/12/100;
     double power=Math.pow(1+ monthlyRate,m);
     
  
     emi=p*monthlyRate*power/(power-1);
     System.out.println("EMI is: "+emi);   
   }
}