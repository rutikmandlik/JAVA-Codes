import java.util.*;
public class SwapFirstLastDigitApp
{
   public static void main(String args[])
   {
       Scanner x=new Scanner(System.in);
       int no,Last,First;
       System.out.println("Enter no:");
       no=x.nextInt();
       
       Last=no%10;
       no=no/10;
       First=no/1000;
       no=no%1000;
       
       Last=Last*10000;
       no=no*10;
       no=Last+no+First;
       System.out.println("After Swapping:"+no);
   }
}