import java.util.*;
abstract class Area{
	abstract void showArea();
}
class Circle extends Area{
	int radius;
	void setRadius(int radius){
		this.radius=radius;
	}
	void showArea(){
		System.out.println("Area of Circle is: "+ (radius * radius * 3.14f));
	}
}
class Rectangle extends Area{
	int len;
	int wid;
	void setLengthWidth(int len, int wid){
		this.len=len;
		this.wid=wid;
	}
	void showArea(){
		System.out.println("Area of rectangle is: "+len*wid);
	}
}
public class Q4AreaApplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of circle: ");
		int radius=sc.nextInt();
		System.out.println("Enter Length: ");
		int len = sc.nextInt();
		System.out.println("Enter Width: ");
		int wid = sc.nextInt();
		
		Circle c=new Circle();
		c.setRadius(radius);
		c.showArea();
		
		Rectangle r=new Rectangle();
		r.setLengthWidth(len,wid);
		r.showArea();
	}
}