//This subclass of Vehicle
package com.polymorphism;

public class Car extends Vehicle
{     
	String type;
	public Car()//constructor overloading
	{
		
		
	}
	public Car(String name, double mileage,String type) {
		super(name, mileage);//calling super class constructor
		
		this.type=type;//assigning value
	}
	public void move()//method overriding
	{
		System.out.println(type+"Car is moving..");
	}
}
