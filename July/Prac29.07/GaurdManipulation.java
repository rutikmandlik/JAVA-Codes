import java.util.*;
public class GaurdManipulation
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int Gaurd,Manipulated;
      System.out.println("Enter total no. Gaurds: ");
      Gaurd=sc.nextInt();
      System.out.println("Enter Guards can be Manipulated: ");
      Manipulated=sc.nextInt();
      
      if(Manipulated<Gaurd)
      {
  	 System.out.println("NO");
      }
      else if(Manipulated>=Gaurd)
      {
       	 System.out.println("YES");
      }
   }
}