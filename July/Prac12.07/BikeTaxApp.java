import java.util.*;
public class BikeTaxApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int cp;
      System.out.print("Enter cost price of Bike: ");
      cp=sc.nextInt();
      
      String res=cp>100000? "Tax is 15%" : 
                 (cp>50000 && cp<=100000)? "Tax is 10%" :
                 cp<=50000? "Tax is 5%" : "" ;
      System.out.print(res);
   }
}