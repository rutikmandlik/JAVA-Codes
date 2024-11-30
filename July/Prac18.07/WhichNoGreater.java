import java.util.*;
public class WhichNoGreater
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter 3 numbers: "); 
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     
     String res= (a>b && a>c)? "A is Greater" :
                 (b>a && b>c)? "B is Greater" :
                               "C is Greater" ;
     System.out.println(res);
  }
 
}