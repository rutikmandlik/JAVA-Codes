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
      
      //Using Bitwise >> operator
      //String result = (num == 0) ? "Zero" : ((num >> 31 & 1) == 0 ? "Positive" : "Negative");
   
      //using bitwise AND operator
      //String result = (num & num)==0? "Zero" : (num>0) ? "Positive" : "Negative" ;

      //using bitwise OR operator
      //String result = ~num == -1 ? "Zero" : (num>0) ? "Positive" : "Negative" ;

      //using bitwise NOT operator
      //String result = (num | 0)==0? "Zero" : (num>0) ? "Positive" : "Negative" ;

      //using bitwise XOR operator
      String result = (num ^ num)==0? "Zero" : (num>0) ? "Positive" : "Negative"
      System.out.print("The Number is: "+result);  
   }
}