import java.util.*;
class Employee
{
    private String name;
    private int id;
    private int basicSalary;
    private int incrementedSalary;
    private int totalSalary;
    void setPersonalInfo(String name,int id,int basicSal)
    {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSal;
        this.incrementedSalary = 0;         // Initial increment is 0
        this.totalSalary = basicSal;        // Initially, total salary is equal to basic salary
    }
    void setProgressPer(int progress)
    {
        if (progress > 60) {
            // If progress is greater than 60%, increase basic salary by 30%
            this.incrementedSalary = (int) (this.basicSalary * 0.30);
            this.totalSalary = this.basicSalary + this.incrementedSalary;
        } else {
            this.incrementedSalary = 0;
            this.totalSalary = this.basicSalary;
        }
    }
    void show()
    {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Incremented Salary: " + this.incrementedSalary);
        System.out.println("Total Salary: " + this.totalSalary);
    }
}
public class EmployeeSalaryApp
{
    public static void main(String args[])
    {
        Employee es=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of employee: ");
        String name=sc.nextLine();
        System.out.print("Enter id of employee: ");
        int id=sc.nextInt();
        System.out.print("Enter Basic Salary of employee: ");
        int basicSal=sc.nextInt();
        System.out.print("Enter Progress percentage: ");
        int progress=sc.nextInt();
        es.setPersonalInfo(name,id,basicSal);
        es.setProgressPer(progress);
        es.show();
    }
}