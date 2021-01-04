//This is sample program for Polymorphism
package com.polymorphism;

public class Vehicle
{
	String name;
	double mileage;
	
	public  Vehicle()     //constructor overloading
	{
		
	}
		
	public Vehicle(String name, double mileage) 
	{
		this.name = name;//assigning value
		this.mileage = mileage;//assigning value
	}
	public void move() //method overloading
	{
		System.out.println("Vehicle is moving....");
	}
	public void move(String loc)
	{
		System.out.println("vehicle is moving to "+loc);
	}
}
