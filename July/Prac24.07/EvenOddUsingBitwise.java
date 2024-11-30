import java.util.*;
public class EvenOddUsingBitwise
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int a;
      System.out.print("Enter a Number: ");
      a=sc.nextInt();
      
      //Using My Logic
      //String res=(a % (~-3)==0)? "Number is Even" : "Number is Odd" ;
        
      //Using Bitwise OR operator
      //String res= (a|1)>a? "Number is Even" : "Number is Odd" ;
      
      //Using Bitwise AND operator
      //String res= (a & 1)==0? "Number is Even" : "Number is Odd" ;

      //Using Bitwise XOR operator
      //String res= (a^1)==a+1? "Number is Even" : "Number is Odd" ;

      //Using Bitwise NOT operator
      //String res= (~a & 1)==1? "Number is Even" : "Number is Odd" ;

      //Using Bitwise right shift operator
      //String res= (a >> 1)<< 1 ==0? "Number is Even" : "Number is Odd" ;

      //Using Bitwise right shift operator
        String res= (a << 31)>> 31 ==0? "Number is Even" : "Number is Odd" ;
      System.out.print(res);
  }
}