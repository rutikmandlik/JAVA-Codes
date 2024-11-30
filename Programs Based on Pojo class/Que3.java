/*
3. WAP to create the class Employee with a following methods 
class Employee
{   void setPersonalInfo(String name,int id,int basicSal)
    { //in this function we need to store name ,id and basicSal in instance variable
    }
    void setProgressPer(int progress)
    { //if progress value is greater than 60 per then increase the basic salary of 
      //employee with 30 percentage 
    }
    void show()
    {//in this function we need to show the all details of employee like as 
     //name id and basic salary as well as incremental salary and total salary of employee
    }
}
public class AreaApp
{
    public static void main(String x[])
    {  // here create the object of Scanner class and accept the name id and basic salary as well 
       //progress per value not need to calculate it by using formual directly enter e.g 70 
       //means 70%
      //create the object of Employee class and call setPersonalInfo and pass name id and salary
     // in it as well as setProgressPer() and pass progress value in it
    //call the show() method of Employee class.
    }
}

*/

import java.util.*;
class Employee{
	String name;
	int id;
	int basicSal;
	int IncSalary;
	int totalSal;
	void setPersonalInfo(String name,int id,int basicSal)
	{
		this.name=name;
		this.id=id;
		this.basicSal=basicSal;
	}
	void setProgressPer(int progress)
	{
		if(progress > 60)
		{
			IncSalary = ((basicSal * 30)/100);
		}
		else
		{
			IncSalary = 0;
		}
		totalSal = basicSal + IncSalary;
	}
	void show()
	{
		System.out.println("************************************");
		System.out.println("Id of employee is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Basic Salary is: "+basicSal);
		System.out.println("Incremental Salary is: "+IncSalary);
		System.out.println("Total Salary is: "+totalSal);
	}
}
public class Que3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of Employee: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Employee: ");
		String name=sc.nextLine();
		System.out.println("Enter Basic Salary of Employee: ");
		int basicSal=sc.nextInt();
		System.out.println("Enter Progress Of Employee: ");
		int progress=sc.nextInt();
		
		Employee e1=new Employee();
		e1.setPersonalInfo(name,id,basicSal);
		e1.setProgressPer(progress);
		e1.show();
	}
}