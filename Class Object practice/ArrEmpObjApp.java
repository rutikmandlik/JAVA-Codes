import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	
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
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	
}
public class ArrEmpObjApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			System.out.println("Enter Employee Details: ");
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			System.out.print("Enter Id: ");
			int id=sc.nextInt();
			System.out.print("Enter Salary: ");
			int sal=sc.nextInt();
			sc.nextLine();
			
			e[i].setId(id);
			e[i].setName(name);
			e[i].setSal(sal);
		}
		System.out.println("Display all employee: ");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
		}
	}
}