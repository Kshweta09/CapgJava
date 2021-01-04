package com.object;

public class Bike extends Vehicle
{
   String brand;

public Bike()
{
	
}

public Bike(int cc, String color,String brand) 
{
	super(cc, color);
	this.brand=brand;
}
public String toString()
{
	return super.toString()+" brand="+brand;
}
}

