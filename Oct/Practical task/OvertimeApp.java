/*
Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
			Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
				Note- for a week only 40 hours of working are allowed.
				
				1. Create class Employee with data member ID, Name, total working, salary, overtime
				Set Information by using a setDetails() method and create a display Information() method to
				display all information with salary.
				2. Create another class name as OverTime with method setEmployee(Employee emp[ ]) and 
				void calculateOvertime() to calculate overtime.
*/

import java.util.*;
class Employee
{
	private int id;
	private String name;
	private double workingHr;
	private double sal;
	private double overtime;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setWorkingHr(double workingHr)
	{
		this.workingHr=workingHr;
	}
	public double getWorkingHr()
	{
		return workingHr;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public double getSal()
	{
		return sal;
	}
	public void setOvertime(double overtime)
	{
		this.overtime=overtime;
	}
	public double getOvertime()
	{
		return overtime;
	}
	
	public void displayInformation()
	{
		//System.out.println("Employee Details are: ");
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Total Working Hours are: "+workingHr);
		System.out.println("Basic Salary is: "+sal);
		System.out.println("Overtime Pay: "+overtime);
		System.out.println("Total Salary is(with overtime): "+(sal+overtime));
		System.out.println("___________________________________________");
	}
}
public class OvertimeApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			System.out.println("Enter ID of Employee: ");
			e[i].setId(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter Name of Employee: ");
			e[i].setName(sc.nextLine());
			
			System.out.println("Enter Total working hours in the week: ");
			e[i].setWorkingHr(sc.nextDouble());
			
			System.out.println("Enter Basic Salary: ");
			e[i].setSal(sc.nextDouble());
			
			if(e[i].getWorkingHr() > 40)
			{
				double overtimeHours=e[i].getWorkingHr() - 40;
				double overtime = overtimeHours * 50;
				e[i].setOvertime(overtime);
			}
			else
			{
				e[i].setOvertime(0);
			}
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].displayInformation();
		}
	}
	
}