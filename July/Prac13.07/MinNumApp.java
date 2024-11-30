import java.util.*;
public class MinNumApp
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Numbers");
       System.out.print("A=");
       int a=sc.nextInt();
       System.out.print("B=");
       int b=sc.nextInt();
       
       String res=a<b? "A is Minimum" : "B is Minimum" ;
       System.out.println(res);
   }
}