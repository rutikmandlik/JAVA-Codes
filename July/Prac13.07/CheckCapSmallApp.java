import java.util.*;
public class CheckCapSmallApp
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Character:");
      char ch=sc.next().charAt(0);
      String res=(ch>='A' && ch<='Z')? "Character is Uppercase" : "Character is Lowercase"  ;
     System.out.println(res);
    }
}