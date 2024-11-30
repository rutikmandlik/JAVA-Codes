abstract class Vehicle{
	
	abstract void engine();
}
class Car extends Vehicle{
	void engine(){
		System.out.println("1000 CC Required.");
	}
}
class Bike extends Vehicle{
	void engine(){
		System.out.println("100 cc Required.");
	}
}
public class Program1{
	public static void main(String []args){
		Car c=new Car();
		c.engine();
		
		Bike b=new Bike();
		b.engine();
	}
}