import java.util.*;
public class AgeForVoting
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Age:");
       int age=sc.nextInt();
    
       String res=age>=18? "Candidate is Eligible to cast his vote" : "Candidate is Not Eligible to cast his vote" ;
       System.out.println(res);
   }
}
