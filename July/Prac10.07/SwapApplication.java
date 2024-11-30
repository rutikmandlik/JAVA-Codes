import java.util.*;
public class SwapApplication
{
   public static void main(String args[])
   {
      Scanner xyz=new Scanner(System.in);
      int a,b;
      System.out.println("Enter first input");
      a=xyz.nextInt();
      System.out.println("Enter Secont input");
      b=xyz.nextInt();
      System.out.println("Before Swapping");
      System.out.printf("A= %d\t B= %d\n",a,b);
      a=a^b;  /*a=a*b;*/  //a=a+b;
      b=a^b;  /*b=a/b;*/  //b=a-b;
      a=a^b;  /*a=a/b;*/  //a=a-b;
      System.out.println("After Swapping");
      System.out.printf("A=%d\t B=%d\n",a,b);
   }
}