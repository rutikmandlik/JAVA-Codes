import java.util.*;
public class TimeCalculator
{
   public static void main(String args[])
   {
      Scanner R=new Scanner(System.in);
      System.out.println("Total Seconds:");
      int T=R.nextInt();
      double hr,min,sec;
      hr=T/3600;
      min=(T%3600)/60;
      sec=T % 60;
      System.out.printf("%f hours,%f minutes,%f seconds.",hr,min,sec);
      
   }
}