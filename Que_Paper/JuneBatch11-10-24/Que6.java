/*
Q6. Write a java program to create a class name as Employee using pojo class to accept id, 
name, email, sal and create method name as getFunction() to implement the logic.
Note : - Display Second Highest Salary Employee Record.
*/

import java.util.*;
class Employee{
	private int id;
	private String name;
	private String email;
	private int sal;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public  void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setSal(int sal){
		this.sal=sal;
	}
	public int getSal(){
		return sal;
	}
}
 
public class Que6
{
	public static void getFunction(Employee[] emp) {
        // Initialize max and smax with the minimum integer value to handle all possible cases
        int max = 0;
        int smax = 0;
        Employee secondHighest = null;

        // First loop to find the highest salary
        for (int i = 0; i < emp.length; i++) {
            int sal = emp[i].getSal();
            if (sal > max) {
                max = sal;
            }
        }

        // Second loop to find the second highest salary (distinct from the highest)
        for (int i = 0; i < emp.length; i++) {
            int sal = emp[i].getSal();
            if (sal > smax && sal < max) {
                smax = sal;
                secondHighest = emp[i];
            }
        }

        if (secondHighest != null) {
            System.out.println("Second Highest Salary Employee Record:");
            System.out.println("ID: " + secondHighest.getId());
            System.out.println("Name: " + secondHighest.getName());
            System.out.println("Email: " + secondHighest.getEmail());
            System.out.println("Salary: " + secondHighest.getSal());
        } else {
            System.out.println("Unable to determine the second highest salary due to insufficient or identical salaries.");
        }
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e1[]=new Employee[3]; 
		
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new Employee();
			
			System.out.println("Enter Id of Employee: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Email: ");
			String email=sc.nextLine();
			System.out.println("Enter Salary: ");
			int sal=sc.nextInt();
			
			e1[i].setId(id);
			e1[i].setName(name);
			e1[i].setEmail(email);
			e1[i].setSal(sal);
		}
		getFunction(e1);
		
	}
}