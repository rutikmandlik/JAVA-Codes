import java.util.*;
public class CheckDivApp
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter a No.:");
       int no=sc.nextInt();
       
       String res=no%5==0? "No is divisible by 5" : no%11==0? "No is divisible by 11" : "No. is not divisible by 5 & 11"  ;
       System.out.println(res);
     
    } 
}