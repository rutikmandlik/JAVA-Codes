import java.util.*;
public class IfArmstrong
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no;
      System.out.print("Enter 3 digit Number: ");
      no=sc.nextInt();
      System.out.print("Enter First number: ");
      int fnum=sc.nextInt();
      System.out.print("Enter Second number: ");
      int snum=sc.nextInt();
      System.out.print("Enter Third number: ");
      int tnum=sc.nextInt();
    
      int x=fnum*fnum*fnum + snum*snum*snum + tnum*tnum*tnum ;
       
      if(no==x)
      {
         System.out.print("This is Armstrong number");   
      }    
      else
      {
         System.out.print("This is not Armstrong number");
      }
   }
}