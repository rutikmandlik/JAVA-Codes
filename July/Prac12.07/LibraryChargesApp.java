import java.util.*;
public class LibraryChargesApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int nd;
      System.out.print("Enter No. of days:");
      nd=sc.nextInt();
      String res=nd==5? "Rs 2/Day" : nd>=6 && nd<=10? "Rs 3/Day" : 
                nd>=11 && nd<=15? "Rs 4/Day": nd>15? "Rs 5/Day" : "Charges are not Defined" ;
      System.out.print(res);
   }
}