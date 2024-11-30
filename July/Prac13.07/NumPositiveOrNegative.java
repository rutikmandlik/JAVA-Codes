import java.util.*;
public class NumPositiveOrNegative
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a no: ");
      int no=sc.nextInt();
    
      String res= no<0 ? "Number is Negative" : no>0 ? "Number is Positive" : "Number=0" ;
      System.out.println(res);
   }
}