/*
Question 1: Multi-Level Inheritance with Method Overriding
Create a program with three classes: Animal, Mammal, and Dog.

The Animal class should have:

A field String species.
A constructor to initialize species.
A method sound() that prints "Some generic animal sound".
The Mammal class should:

Inherit from Animal.
Override the sound() method to print "Mammal sound".
Add a constructor that accepts species and calls the Animal constructor to initialize it.
The Dog class should:

Inherit from Mammal.
Override the sound() method to print "Bark".
Add a constructor that accepts species and calls the Mammal constructor to initialize it.
Write code to:

Create an Animal object, a Mammal object, and a Dog object.
Call sound() on each object and display the result.


*/

import java.util.*;
class Animal{
	String species;
	Animal(String species){
		this.species=species;
	}
	void sound(){
		System.out.println("Some generic animal sound.");
	}
}
class Mammal extends Animal{
	Mammal(String species){
		super(species);
	}
	void sound(){
		System.out.println("Mammal Sound");
	}
}
class Dog extends Mammal{
	Dog(String species){
		super(species);
	}
	void sound(){
		System.out.println("Bark");
	}
}
public class Check2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Species: ");
		String species=sc.nextLine();
		
		Animal a=new Animal(species);
		a.sound();
		
		Mammal m=new Mammal(species);
		m.sound();
		
		Dog d=new Dog(species);
		d.sound();
	}
}