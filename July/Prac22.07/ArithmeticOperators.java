import java.util.*;
public class ArithmeticOperators
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b,sum,difference,product,quotient,remainder;
      System.out.print("Enter First No.: ");
      a=sc.nextInt();
      System.out.print("Enter Second No.: ");
      b=sc.nextInt();
    
      //String N=a>b? "First no. is Grater" : "Second no. is Grater" ;
      
      sum=a+b;
      
      difference=a-b;
  
      product=a*b;
 
      quotient=a/b;

      remainder=a%b;

      System.out.print("Sum of Numbers is: "+sum);
      System.out.print("\nDifference Between Two Numbers are: "+difference);
      System.out.print("\nProduct of Numbers are: "+product);
      System.out.print("\nQuotient is: "+quotient);
      System.out.print("\nRemainder is: "+remainder);      
   }
}