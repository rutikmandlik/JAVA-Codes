/*
2.Create the Class Name as Rectangle with a following methods and write its logics.
class Rectangle
{ void setLengthWidth(int len,int wid)//accept the radius 
   {
   }
   void showArea()
   { //write here calculation logics of circle area and display it
   }
}
public class AreaApp
{  public static void main(String x[])
     {  //create here object of scanner and accept the length and width as input 
        //create the object of Rectangle and call setLengthWidth and pass radius input as parameter
        //call showArea() for display the display the area
    }
}
*/

import java.util.*;
class Rectangle
{
	int len,wid;
	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	void showArea()
	{
		System.out.println("Area of Rectangle is: "+len*wid);
	}
}
public class Que2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of rectangle: ");
		int len=sc.nextInt();
		System.out.print("Enter width of rectangle: ");
		int wid=sc.nextInt();
		
		Rectangle r1=new Rectangle();
		r1.setLengthWidth(len,wid);
		r1.showArea();
	}
}