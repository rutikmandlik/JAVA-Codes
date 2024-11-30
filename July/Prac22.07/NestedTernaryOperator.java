//Use nested ternary operators to determine the largest of three numbers.

import java.util.*;
public class NestedTernaryOperator
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("Enter Three Numbers: ");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
  
       String res=(a>b && a>c)? "First Number is Largest" : 
                  (b>a && b>c)? "Second Number is Largest" :
                                "Third Number is Largest" ;
       System.out.print(res);
   }
}