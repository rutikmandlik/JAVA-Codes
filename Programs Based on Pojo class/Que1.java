/*
1). WAP to create the class name as Circle with a following methods 
class Circle
{
   void setRadius(float radius)//accept the radius 
   {
   }
   void showArea()
   { //write here calculation logics of circle area and display it
   }
}
public class AreaApp
{
    public static void main(String x[])
    {
      //create here object of scanner and accept the radius as input 
     //create the object of area and call setRadius and pass radius input as parameter
     //call showArea() for display the display the area
    }
}
*/

import java.util.*;
class Circle
{
	float radius;
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		float area=0;
		area = 3.14f * radius * radius;
		System.out.println("Area of circle is: "+area);
	}
}
public class Que1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius of circle: ");
		float radius=sc.nextFloat();
		
		Circle c1=new Circle();
		c1.setRadius(radius);
		c1.showArea();
	}
}