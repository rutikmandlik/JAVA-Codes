class Employee
{
	private String name;
	private int id;
	private String address;
	private int sal;
	private String prevComp;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	public void setPrevComp(String prevComp)
	{
		this.prevComp=prevComp;
	}
	public String getPrevComp()
	{
		return prevComp;
	}
}
class Company
{
	private Employee emp;
	void setEmployee(Employee employee)
	{
		emp=employee;
	}
	void showDetails()
	{
		System.out.println("Name is: "+emp.getName());
		System.out.println("Id is: "+emp.getId());
		System.out.println("Address is: "+emp.getAddress());
		System.out.println("Salary is: "+emp.getSal());
		System.out.println("Previous Compay is: "+emp.getPrevComp());
	}
	
}
public class CompanyApp
{
   public static void main(String args[])
   {
		Company c=new Company();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("ABC");
		e.setSal(10000);
		e.setAddress("PUNE");
		e.setPrevComp("GOOGLE");
		
		c.setEmployee(e);
		c.showDetails();
   }
}