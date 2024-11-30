import java.util.*;
public class EvenOddApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no;
      System.out.print("Entera a Number=");
      no=sc.nextInt();
      String result=no%2==0? "Even" : "Odd"  ;
      System.out.println("Number is:"+result);
   }
}