/*
10) WAP to create the pojo class name as Student class with a following methods and data or variable/state
class Student
{   int id;String name;float per;
    int totalFees;int disFees;
    int actualPaidFees;
void setId(int id)
    { this.id=id;
    }
    int getId()
    { return id;
    }
    void setName(String name)
     { this.name=name;
     }
   String getName()
    { return name;
   }
 //do setter and getter for all students
}
Create the class name as DiscountFees and this class is depend on Student class means in this class 
we need to write a method setStudent() and accept the reference of Student class in it 
As well as we need to define two another method in this class name as  
checkDiscountEligibility(int per) -> this function accept the per of student if per greater than 60 
then student is eligible for discout and give the 30% discount on fees and update in student object 
And we need to write one more function in DiscountFees class show() and in this function contain the 
logics for display the all details of Students with discounted fees
Following sample code gives the completed structure about the two class with empty methods.
 
Also create the main method class with a following operation given below.
public class StudentDiscountApp
{
    public static void main(String x[ ])
    {  //create the object of Scanner class
      //declare the variables for id,name ,per,totalFees,per and accept the input and store its value in variable usign scanner
   //create the object of student class and store the values in object using setter methods
//create the object of DiscountFees class and call setStudent() method and pass student class reference in it
  //call the checkDiscountEligilibility() method and pass per in it accepted from keyboard
//call show() method here
    }
}
*/

import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
	private int totalFees;
	private int disFees;
	private int actualPaidFees;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public  int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public  String getName()
	{
		return name;
	}
	public void setPer(float per)
	{
		this.per=per;
	}
	public float getPer()
	{
		return per;
	}
	public void setTotalFees(int totalFees)
	{
		this.totalFees=totalFees;
	}
	public int getTotalFees()
	{
		return totalFees;
	}
	public void setDisFees(int disFees)
	{
		this.disFees=disFees;
	}
	public  int getDisFees()
	{
		return  disFees;
	}
	public void setActualPaidFees(int actualPaidFees)
	{
		this.actualPaidFees=actualPaidFees;
	}
	public int getActualPaidFees()
	{
		return actualPaidFees;
	}
}
class DiscountFees
{
	Student student;
	void setStudent(Student student)
	{
		this.student=student;
	}
	void checkDiscountEligibility(float per)
	{
		if(per > 60)
		{
			int discount=(int)(student.getTotalFees() * 0.30);
			student.setDisFees(discount);
			student.setActualPaidFees(student.getTotalFees() - discount);
		}
		else
		{
			student.setDisFees(0);
			student.setActualPaidFees(student.getTotalFees());
		}
	}
	void show()
	{
		System.out.println("********************************");
		System.out.println("Student Id: "+student.getId());
		System.out.println("Name: "+student.getName());
		System.out.println("Percentage: "+student.getPer());
		System.out.println("Total Fees: "+student.getTotalFees());
		System.out.println("Discounted Fees: "+student.getDisFees());
		System.out.println("Actual Paid Fees: "+student.getActualPaidFees());
	}
}
public class Que10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Percentage: ");
		float per=sc.nextFloat();
		System.out.println("Enter Total Fees: ");
		int totalFees=sc.nextInt();
		
		Student s1=new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setPer(per);
		s1.setTotalFees(totalFees);
		
		DiscountFees df=new DiscountFees();
		df.setStudent(s1);
		df.checkDiscountEligibility(per);
		df.show();
	}
}
