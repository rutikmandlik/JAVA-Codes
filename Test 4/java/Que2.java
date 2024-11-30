/*
Q2. Design a Employee POJO with fields: empId, name, designation, basicSalary, and hra.
• Task:
1. Create a constructor to initialize all fields.
2. Add a method calculateGrossSalary() in the Employee class to calculate the 
gross salary as: grossSalary=basicSalary+hra+basicSalary×0.2(bonus).
3. Write a program to create an array of 5 employees, display their details, and 
calculate gross salary for each employee.
*/

import java.util.*;
class Employee{
	private int empId;
	private String name;
	private String designation;
	private double basicSalary;
	private double hra;
	
	public Employee(int empId,String name,String designation,double basicSalary,double hra){
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
		this.hra=hra;
	}
	double calculateGrossSalary(){
		return basicSalary + hra + (basicSalary * 0.2);
	}
	void displayEmpDetails(){
		System.out.println("====================================");
		System.out.println("Employee Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("HRA: "+hra);
		System.out.println("Gross Salary: "+calculateGrossSalary());
	}
}
public class Que2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Employee []emp=new Employee[2];
		
		for(int i=0;i<emp.length;i++){
			System.out.println("Enter Details of employee "+(i+1)+":");
			System.out.print("ID: ");
			int empId=sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Designtion: ");
			String designation=sc.nextLine();
			System.out.print("Basic Salary: ");
			double basicSalary=sc.nextDouble();
			System.out.print("HRA: ");
			double hra=sc.nextDouble();
			
			emp[i]=new  Employee(empId, name, designation, basicSalary, hra);
		}
		System.out.println("Employee Details are: ");
		for(int i=0;i<emp.length;i++){
			emp[i].calculateGrossSalary();
			emp[i].displayEmpDetails();
		}
	}
}