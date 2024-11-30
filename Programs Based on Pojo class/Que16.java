/*
16) WAP to create the class name as Employee class and create the array object of Employee class 
of size 5 and store all data in it and arrange all employee data in ascending order salary wise.
 
*/

import java.util.*;
class Employee
{
	private int id;
	private String name;
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
	public void setSal(int sal){
		this.sal=sal;
	}
	public int getSal(){
		return sal;
	}	
}
public class Que16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Employee e1[]=new Employee[3];
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new Employee();
			System.out.print("Enter id of Employee: ");
			e1[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter name of employee: ");
			e1[i].setName(sc.nextLine());
			System.out.print("Enter Salary of Employee: ");
			e1[i].setSal(sc.nextInt());
		}
		
		for(int i=0;i<e1.length;i++)
		{
			for(int j=0;j<e1.length - i -1;j++)
			{
				if(e1[j].getSal() > e1[j+1].getSal())
				{
					Employee temp=e1[j];
					e1[j]=e1[j+1];
					e1[j+1]=temp;
				}
			}
		}
		
		System.out.println("\nEmployee details sorted by salary in ascending order:");
		for(int i=0;i<e1.length;i++)
		{
			System.out.println(e1[i].getId()+"\t"+e1[i].getName()+"\t"+e1[i].getSal());
		}
	}
}