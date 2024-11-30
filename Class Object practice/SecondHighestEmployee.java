/*
Write a java program to create a class name as Employee using pojo class to accept id,
name, email, sal and create method name as getFunction() to implement the logic.
Note : - Display Second Highest Salary Employee Record.

*/

import java.util.*;
class Employee
{
	private int id;
	private String name;
	private String mail;
	private double sal;
	
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
	public void setEmail(String mail)
	{
		this.mail=mail;
	}
	public String getEmail()
	{
		return mail;
	}
	public void setSalary(double sal)
	{
		this.sal=sal;
	}
	public double getSalary()
	{
		return sal;
	}
	
	public void displayEmployee()
	{
		System.out.println("ID: "+id+", Name: "+name+", Email: "+mail+", Salary: "+sal);
	}
}
public class SecondHighestEmployee
{
	public static void getFunction(Employee e[])
	{
		 // Step 1: Find the highest salary
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() > maxSalary) {
                maxSalary = e[i].getSalary();
            }
        }

        // Step 2: Find the highest salary that is less than maxSalary (second highest)
        double secondMaxSalary = Double.MIN_VALUE;
        int secondMaxIndex = -1;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < maxSalary && e[i].getSalary() > secondMaxSalary) {
                secondMaxSalary = e[i].getSalary();
                secondMaxIndex = i;
            }
        }
		if(secondMaxIndex != -1)
		{
			System.out.println("\nEmployee with the Second Highest Salary:");
			e[secondMaxIndex].displayEmployee();
		}
		else
		{
            System.out.println("There is no second highest salary record.");
        }
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];     //array of reference
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();    //array of object
			System.out.println("Enter id of Employee: ");
			e[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter name: ");
			e[i].setName(sc.nextLine());
			System.out.println("Enter Email: ");
			e[i].setEmail(sc.nextLine());
			System.out.println("Enter Salary: ");
			e[i].setSalary(sc.nextDouble());
		}
		getFunction(e);
	}
}
