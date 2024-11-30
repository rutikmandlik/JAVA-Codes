import java.util.*;
public class Polymorphism_1
{
   public static void main(String args[])
   {
	calBill(10,100);
	calBill(10,100,80);
   }
   public static void calBill(int qty,int rate)
   {
	System.out.print("Bill without gst is: "+qty*rate);
   }
   public static void calBill(int qty,int rate,int gstRate)
   {
	int gstAmt=(qty*rate)*gstRate/100;
	int total=(qty*rate)+gstAmt;
	System.out.print("\nBill with gst is: "+total);
   }
}