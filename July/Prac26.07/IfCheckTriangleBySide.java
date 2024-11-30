import java.util.*;
public class IfCheckTriangleBySide
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter Three Sides: ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
 
      if(a+b>c && b+c>a && a+c>b)
      {
          System.out.print("It is Valid triangle");
      }
      else
      {
          System.out.print("It is invalid triangle");
      }
   }
}