import java.util.*;
public class IfEmpoyeeSalary
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      double s,gs;
      System.out.println("Enter Basic Salary of Employee: ");
      s=sc.nextDouble();
   
    
      if(s<=10000)
      {
           gs=s+(s*0.2)+(s*0.8);
           System.out.println("Gross Salary= "+gs);
      }
      else if (s<=20000)
      {
           gs=s+(s*0.25)+(s*0.9);
           System.out.println("Gross Salary= "+gs);
      }
      else
      {
           gs=s+(s*0.3)+(s*0.95);
           System.out.println("Gross Salary= "+gs);
      }
   }
}