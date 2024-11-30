import java.util.*;
public class TwoNoEqualApp
{
   public static void main(String args[])
   {
     Scanner r=new Scanner(System.in);
     System.out.println("Enter Two Numbers");
     System.out.print("First No:");
     int a=r.nextInt();
     System.out.print("Second No:");
     int b=r.nextInt();
  
     String result=a==b? "Numbers are Equal" : "Numbers are not Equal" ;
     System.out.println(result);
   }
}