//Check Number Positive Negative or Zero

import java.util.*;
public class CheckNumberSign
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int num;
      System.out.print("Enter a Number: ");
      num=sc.nextInt();
      
  
      String result = (num == 0) ? "Zero" : ((num >> 31 & 1) == 0 ? "Positive" : "Negative");
      System.out.print("The Number is: "+result);  
   }
}