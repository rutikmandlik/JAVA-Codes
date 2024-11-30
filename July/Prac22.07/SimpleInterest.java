import java.util.*;
public class SimpleInterest
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double P,R,T,SI;
      System.out.print("Enter Principle Amount: ");
      P=sc.nextDouble();
      System.out.print("Enter the Interest Rate: ");
      R=sc.nextDouble();
      System.out.print("Enter the Time in Months: ");
      T=sc.nextDouble();
   
      double Y=T/12;   
      
      SI=(P*R*Y)/100;
      System.out.print("Simple Interest is: "+SI);
   }

}