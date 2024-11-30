import java.util.*;
public class EmployeeInsurance
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter The Age of Employee: ");
      int Age=sc.nextInt();
      System.out.print("Enter Employee Marital Status(M/U): ");
      char Marriage=sc.next().charAt(0);
      System.out.print("Gender Of Employee(M/F): ");
      char Gender=sc.next().charAt(0);

      String res=(Marriage=='M')? "Eligible for Insurance" :
                 (Marriage=='U' && Gender=='M' && Age>30)? "Eligible for Insurance" :
                 (Marriage=='U' && Gender=='F' && Age>25)? "Eligible For Insurance" :
                   "Not Eligible For Insurance" ;
      System.out.println(res); 
   }
}