import java.util.*;
public class PercOfClassAttended
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double nd,pd,ad,perc;
      System.out.print("Enter the Number of Days: ");
      nd=sc.nextInt();
      System.out.print("\nEnter the Number of Absent Days: ");
      ad=sc.nextInt();
      pd=nd-ad;
  
      perc=(pd/nd)*100;
      System.out.println("Percentage of Class Attended:"+perc);
      String res=perc<75? "Candidate is Not Eligible for Exam " : "Candidate is Eligible For Exam" ;
      System.out.print(res);
   }
}