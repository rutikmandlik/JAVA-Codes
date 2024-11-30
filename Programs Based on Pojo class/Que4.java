/*
4. WAP to create the class name as Student with a following methods 
class Student
{ void setSubMarks(int s[])
   { //here we need to store the array in instance variable 
   }
   void calculatePer()
   { //here we need to call the aggregate of six subjects marks through the array and 
	 //calculate its per and store in instance variable.
   } 
   void checkGrades()
   { //here we need to check grades means per>75 && per<=100 then student in distinction  
     //if per>60 && per<=75 then in first division  if per>=50 && per<=60 then second division and 
	 //if per>40 && per<=50 then in third division and if per <40 then  student failed 
   }
}
public class StudentApp
{   public static void main(String x[])
    { //create the object of scanner class
     //declare the array with 6 six of type integer and store input values in array as subject marks
    //create the object of Student class and call the setSubMarks() function and pass array in it
   //then call calculatePer() student function
  //then call checkGrades() function for checking the grading of students.
 		
    }
}
*/

import java.util.*;
class Student
{
	int a[];
	double per;
	void setSubMarks(int []a)
	{
		this.a=a;
	}
	void calculatePer()
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		per = (sum / 600.0)*100;
	}
	void checkGrades()
	{
		System.out.println("Percentage are: "+per+"%");
		if(per>75 && per<=100)
		{
			System.out.println("Student in distinction");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("Student in First Division.");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Student in Second Division.");
		}
		else if(per>40 && per<=50)
		{
			System.out.println("Student in Third Division.");
		}
		else if(per <= 40)
		{
			System.out.println("Student is Failed.");
		}
		
		
	}
}
public class Que4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter 6 Subject Marks in the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Student s1=new Student();
		s1.setSubMarks(arr);
		s1.calculatePer();
		s1.checkGrades();
	}
}