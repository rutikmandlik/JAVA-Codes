import java.util.*;
public class Program_No_22
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Year:");
      int no=sc.nextInt();
      
      String res=(no%4==0 && no%100!=0 || no%400==0) ? "It is a Leap Year" : "It is not a Leap Year"  ;
      System.out.println(res);
   }
}