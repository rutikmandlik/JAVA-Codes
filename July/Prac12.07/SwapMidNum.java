import java.util.*;
public class SwapMidNum
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int no,L,F,mid,rem,rev=0;
      System.out.print("Enter 5 Digit No:");
      no=sc.nextInt();
      
      L=no%10;  //5
      F=no/10000;  //1
      
      no=234;
 
      rem=no%10;
      rev=rev*10+rem;
      no=no/10;
   
      rem=no%10;
      rev=rev*10+rem;
      no=no/10;

      rem=no%10;
      rev=rev*10+rem;
      no=no/10;

      F=F*10000;
      mid=rev*10;
      
      F=F+mid+L;  
      System.out.print("After Swapping: "+F);  
      
   }
}