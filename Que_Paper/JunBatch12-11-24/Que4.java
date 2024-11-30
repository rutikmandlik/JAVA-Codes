/*
Q4. Write an abstract class Appliance with: 
Attributes: String brand, double power;
Constructor: Initialize brand and power. 
Abstract Method: 
abstract void turnOn() - This method should print a message indicating that the 
appliance is turned on. 
 Create a concrete subclass WashingMachine with: 
Additional attribute int capacity. A constructor to initialize brand, power, and 
capacity.
Implementation of turnOn() to print a message about starting the washing machine 
with the specific capacity. 
In the main method, create an instance of WashingMachine and call the turnOn() 
method.

*/

import java.util.*;
abstract class Appliance{
	String brand;
	double power;
	Appliance(String brand,double power){
		this.brand=brand;
		this.power=power;
	}
	abstract void turnOn();
}
class WashingMachine extends Appliance{
	int capacity;
	WashingMachine(String brand,double power,int capacity){
		super(brand,power);
		this.capacity=capacity;
	}
	void turnOn(){
		if(capacity < 25){
			System.out.println("Washing machine is Starting.");
		}
		else{
			System.out.println("Washing Machine is overloaded. ");
		}
	}
}
public class Que4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of Washing machine: ");
		String name=sc.nextLine();
		System.out.println("Enter power: ");
		double power=sc.nextDouble();
		System.out.println("Enter Capacity of Washing machine(int kg): ");
		int capacity=sc.nextInt();
		
		WashingMachine wm=new WashingMachine(name,power,capacity);
		wm.turnOn();
		
		
	}
}