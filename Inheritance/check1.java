/*
Question:
Consider a scenario where we have two classes: Vehicle and Car. The Vehicle class is a superclass, 
while Car is a subclass that inherits from Vehicle.

The Vehicle class should have:

A field int speed initialized to 0.
A constructor that accepts an integer parameter to initialize the speed field.
A method displayInfo() that prints the speed of the vehicle.
The Car class should:

Inherit from Vehicle.
Have an additional field String model.
A constructor that accepts both speed and model as parameters. This constructor should call the 
superclass's constructor to initialize the speed.
Override the displayInfo() method to display both the speed and the model of the car.
Write the Java code to implement these classes and demonstrate the following:

Create an instance of Vehicle and display its information.
Create an instance of Car and display its information.
Expected Output:
If you create a Vehicle with a speed of 80, and a Car with a speed of 120 and model "Sedan", 
the output should look like this:

Vehicle speed: 80
Car speed: 120, Model: Sedan
*/

import java.util.*;
class Vehicle{
	int speed;
	Vehicle(int speed){
		this.speed=speed;
	}
	void displayInfo(){
		System.out.println("Vehicle speed: "+speed);
	}
}
class Car extends Vehicle{
	String model;
	Car(int speed,String model){
		super(speed);
		this.model=model;
	}
	void displayInfo(){
		System.out.println("Car speed: "+speed);
		System.out.println("Model: "+model);
	}
}
public class check1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter speed of vehicle: ");
		int speed=sc.nextInt();
		System.out.println("Enter speed of car: ");
		int carSpeed=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter model of car: ");
		String model=sc.nextLine();
		
		Vehicle v=new Vehicle(speed);
		v.displayInfo();
		
		Car c=new Car(carSpeed,model);
		c.displayInfo();
	}
}