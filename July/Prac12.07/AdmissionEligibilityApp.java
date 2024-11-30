import java.util.*;
public class AdmissionEligibilityApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int total,m,p,c;
      System.out.println("Enter Math,Physics,Chemistry Marks:");
      m=sc.nextInt();
      p=sc.nextInt();
      c=sc.nextInt();
      total=m+p+c;
      int mp=m+p;
      String res=(m>=65 && p>=55 && c>=50) && (total>=190 || mp>=140)? 
                 "Student is Eligible for Admission" : "Student is Not Eligible for Admission" ;
      System.out.println(res); 
   }
}