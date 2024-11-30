import java.util.*;
public class IfCpSp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int cp,sp;
      System.out.println("Enter a Cost price: ");
      cp=sc.nextInt();
      System.out.println("Enter a Selling price: ");
      sp=sc.nextInt();

      if(cp<sp)
      {
         System.out.println("Profit");

      }
      else
      {
         System.out.println("Loss");
      } 
  }
}