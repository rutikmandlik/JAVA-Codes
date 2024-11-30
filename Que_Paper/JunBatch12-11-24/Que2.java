import java.util.*;
class Employee{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	double calculateBonus(){
		if(salary >= 100000){
			return salary*0.15;
		}
		else if(salary>=50000){
			return salary * 0.10;
		}
		else {
			return salary * 0.05;
		}
	}
	void displayEmployeeDetail(){
		double bonus=calculateBonus();
		double totalCompensation=(salary + bonus);
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Salary is: "+salary);
		System.out.println("Calculated Bonus is: "+bonus);
		System.out.println("Total Compensation: "+totalCompensation);
	}
}
public class Que2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id of Employee: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Salary: ");
		double salary=sc.nextDouble();
		
		Employee e1=new Employee(id,name,salary);
		e1.calculateBonus();
		e1.displayEmployeeDetail();
	}
}