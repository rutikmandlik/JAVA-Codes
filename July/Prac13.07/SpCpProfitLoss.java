import java.util.*;
public class SpCpProfitLoss
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int sp,cp;
       String result;
       System.out.print("SP :");
       sp=sc.nextInt();
       System.out.print("CP :");
       cp=sc.nextInt();
       result=sp>cp? "Profit":"Loss"  ;
       System.out.println("Result is:"+result);
   }
}

